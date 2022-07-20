package ex03;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class GameScoreTest extends JFrame implements ActionListener{
	JTable table;
	JTextField namef;
	JTextField scoref;
	JButton button;
	
	MyTableModel model;
	
	public GameScoreTest() {
		super("명예의전당");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		model = new MyTableModel();
		model.fillTable();
		
		JLabel label = new JLabel("명예의전당" + JLabel.CENTER);
		label.setFont(new Font("SansSerif", Font.PLAIN, 30));
		add(label, BorderLayout.NORTH);
		
		table = new JTable(model);
		
		//사용자 인터페이스 부분을 만든다.
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(500, 200));
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("이름"));
		namef = new JTextField(10);
		panel.add(namef);
		
		panel.add(new JLabel("점수"));
		scoref = new JTextField(10);
		panel.add(scoref);
		
		button = new JButton("점수 제출");
		button.addActionListener(this);
		panel.add(button);
		
		add(panel, BorderLayout.SOUTH);
		setVisible(true);		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = namef.getText();
		String score = scoref.getText();
		
		try {
			Connection conn = makeConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO scores VALUES ( '" + name+"', "+score+ ")");
					conn.close();
		}catch(SQLException e1) {
			System.err.println("Caught Exception : " + e1.getMessage());
		}
		model.fillTable();
	}
	
	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "exdb";
		String password = "12345";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc driver 로딩 성공");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
		} catch (ClassNotFoundException e) {
            System.out.println("jdbc driver 로딩 실패");
		} catch (SQLException e) {
            System.out.println("오라클 연결 실패");
		}
		return con;
	}
	
	public static void main(String[] args) {
		GameScoreTest mainApp = new GameScoreTest();
	}
	
	public class MyTableModel extends AbstractTableModel{
		private String[] columnNames = { "이름", "점수" };
		private static final int ROWS = 10;
		private static final int COLS = 2;
		Object[][] data = new String[ROWS][COLS];
		
		@Override
		public int getRowCount() {
			return data.length;
		}

		@Override
		public int getColumnCount() {
			return columnNames.length;
		}
		
		public String getColumnName(int col) {
			return columnNames[col].toString();
		}

		public void fillTable() {
			try {
				Connection conn = makeConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM scores ORDER BY score DESC");
				int row = 0;
				while(rs.next()) {
					data[row][0] = rs.getString("name");
					data[row][1] = rs.getString("score");
					row++;					
				}
				conn.close();
			}catch(SQLException e) {
				System.err.println("Caught Exception : " + e.getMessage());
			}
			fireTableDataChanged();
		}
		
		public void setValueAt(Object value, int row, int col) {
			data[row][col] = value;
			fireTableCellUpdated(row, col);
		}
		
		public Object getValueAt(int row, int col) {
			return data[row][col];
		}
		
	}
}
