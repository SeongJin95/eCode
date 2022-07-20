package Practice06;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DicServerFrame extends JFrame{
	private JTextField eng = new JTextField(10);
	private JTextField kor = new JTextField(10);
	private JButton saveBtn = new JButton("저장");
	private JButton engsearchBtn = new JButton("영>한");
	private JButton korsearchBtn = new JButton("한>영");
	private JTextArea ta = new JTextArea(7, 25);
	private HashMap<String, String> dicEng = new HashMap<>();
	private HashMap<String, String> dicKor = new HashMap<>();
	private JButton word  = new JButton("단어 불러오기");
	private JButton removeWord = new JButton("단어 삭제");
	
	
	public DicServerFrame() {
		super("단어사전 서버");
		setSize(350,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("영어"));
		c.add(eng);
		c.add(new JLabel("한글"));
		c.add(kor);
		c.add(saveBtn);
		c.add(engsearchBtn);
		c.add(korsearchBtn);
		c.add(new JScrollPane(ta));
		c.add(word);
		c.add(removeWord);
		setVisible(true);
		setResizable(false);
		saveBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(eng.getText().isEmpty() || kor.getText().isEmpty()) {
					ta.append("저장 (실패)\n");
					JOptionPane.showMessageDialog(null, "빈 칸이 있습니다!", "경고", JOptionPane.ERROR_MESSAGE);			
					
				}else {
					ta.append("삽입 (" + eng.getText() + "," + kor.getText() + ")\n");
					dicEng.put(eng.getText(), kor.getText());
					dicKor.put(kor.getText(), eng.getText());
				}				
			}
		});
		
		engsearchBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(eng.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "빈 칸 입니다", "경고", JOptionPane.ERROR_MESSAGE);
				else {
					String s = dicEng.get(eng.getText());
					if(s==null)
						s = "없음";
					kor.setText(s);
				}
			}
		});
		
		korsearchBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(kor.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "빈 칸 입니다", "경고", JOptionPane.ERROR_MESSAGE);
				else{
					String s = dicKor.get(kor.getText());
					if(s==null)
						s = "없음";
					eng.setText(s);
				}
			}
		});
		
		removeWord.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = eng.getText();
				String b = kor.getText();
				if(a.isEmpty() || b.isEmpty()) {
					JOptionPane.showMessageDialog(null, "빈 칸이 있습니다", "경고", JOptionPane.ERROR_MESSAGE);
					ta.append("삭제 (실패)\n");
				}
				else {
					if(!dicEng.containsKey(eng.getText()) || !dicKor.containsKey(kor.getText())) {
						if(!dicEng.containsKey(eng.getText()))
							ta.append("삭제 (등록되지 않은 단어 입니다 eng)\n");
						if(!dicKor.containsKey(kor.getText()))
							ta.append("삭제 (등록되지 않은 단어 입니다 kor)\n");
						else
							ta.append("삭제 (등록되지 않은 단어 입니다)\n");
						System.out.println(!dicEng.containsKey(eng.getText()));
						System.out.println(!dicKor.containsKey(kor.getText()));
					}else {
						dicEng.remove(eng.getText(), kor.getText());
						dicKor.remove(kor.getText(), eng.getText());
						ta.append("삭제 (" + eng.getText() + "," + kor.getText() + ")\n");
					}					
				}
			}
		});
		
		
		word.addActionListener(new OpenActionListener());
		
		
		
		new ServerThread().start();
		
	}
	
	class OpenActionListener implements ActionListener{
		private JFileChooser chooser;
		public OpenActionListener() {
			chooser = new JFileChooser();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("txt file", "txt");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,  "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			String filePath = chooser.getSelectedFile().getPath();
			wordin(filePath);
		}
	}
	
	public void wordin(String filePath) {
		try{
			Scanner reader = new Scanner(new FileReader(filePath));
			int count = 0;
			while(reader.hasNext()) {
				String engw = reader.next();
				String korw = reader.next();
				dicEng.put(engw, korw);
				dicKor.put(korw, engw);
				count++;				
			}
			ta.append("저장 (" + count + "개의 단어가 저장 되었습니다)\n");
			reader.close();
			Set<String> keySet = dicEng.keySet();
			Iterator<String> it = keySet.iterator();
			while(it.hasNext()){
				String key = it.next(); //키 값 1개 읽어오기
				String value = dicEng.get(key);
				System.out.println(key + ":"+value);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	class ServerThread extends Thread{
		@Override
		public void run() {
			ServerSocket  listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(1006);
				while(true) {
					socket = listener.accept();
					//log.append("클라이언트 연결됨\n");
					new ServiceThread(socket).start();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if(listener != null)
					listener.close();
				if(socket != null)
					socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}	
	
	class ServiceThread extends Thread{
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out = null;
		
		public ServiceThread(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));					
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			while(true) {
				try {
					String signal = in.readLine();
					String word = in.readLine();
					String trans = null;
					if(signal.equals("0"))
						trans = dicEng.get(word);
					else if(signal.equals("1"))
						trans = dicKor.get(word);
					
					if(trans == null) 
						trans = "없음";
					
					out.write(trans + "\n");
					out.flush();
					
					ta.append("검색 (" + word + ")\n");
					int pos = ta.getText().length();
					ta.setCaretPosition(pos);
					
				}catch(IOException e) {
					return;
				}				
			}
		}
	}

	public static void main(String[] args) {
		new DicServerFrame();
	}
	
}
