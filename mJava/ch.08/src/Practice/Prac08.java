package Practice;

import java.io.*;
import java.util.*;

public class Prac08 {
	private String fileName = "C:/temp/phone.txt";
	private HashMap<String, String> phoneMap = new HashMap<String, String>();
	
	public Prac08() {}
	
	private void readPhoneFile() {
		try {
			Scanner sc = new Scanner(new FileReader(new File(fileName)));
			while(sc.hasNext()) {
				String name = sc.next();
				String tel = sc.next();
				phoneMap.put(name, tel);
			}
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("총" + phoneMap.size() + "개의 전화번호를 읽었습니다.");
		
	}
	
	private void processQuery() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("이름>> ");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			String tel = phoneMap.get(name);
			System.out.println(tel);
		}
		sc.close();
	}
	
	public void run() {
		readPhoneFile();
		processQuery();
	}
	public static void main(String[] args) {
		Prac08 phoneExplorer = new Prac08();
		phoneExplorer.run();
	}
/*
	public static void listDirectory(File dir) {		
		File[] subFiles = dir.listFiles();
		File f = subFiles[0];
		for(int i=0;i<subFiles.length;i++) {
			if(f.length()<subFiles[i].length())
				f = subFiles[i];
		}
		System.out.println("가장 큰 파일은" + dir.getPath() + f.getName() + " " + f.length() + "바이트");
		
	}
	
	public static void main(String[] args) {
		
		File f2 = new File("c:\\Temp\\java_sample");
		if(!f2.exists()) {
			f2.mkdir();
		}
		
		listDirectory(new File("c:\\"));
		
	}
*/
}
