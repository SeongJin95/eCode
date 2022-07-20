package Practice;//WordSearch

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Prac11 {
	private Vector<String> wordVector = new Vector<String>();
	
	public Prac11() {}
	
	private boolean readFile() {
		try {
			Scanner sc = new Scanner(new FileInputStream("words.txt"));
			while(sc.hasNext())
				wordVector.add(sc.nextLine());
			sc.close();
		}catch(FileNotFoundException e) {
			System.out.println("프로젝트 폴더 밑의 words.txt 파일이 없습니다");
			return false;
		}
		System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다");
		return true;		
	}
	
	private void processQuery() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			boolean found = false;
			System.out.print("단어>>");
			String searchWord = sc.nextLine();
			if(searchWord.equals("그만"))
				break;			
			for(int i=0;i<wordVector.size();i++) {
				String word = wordVector.get(i);
				if(word.length()<searchWord.length())
					continue;
				String frontPart = word.substring(0, searchWord.length());
				
				if(searchWord.equals(frontPart)) {
					System.out.println(word);
					found = true;
				}
			}
			if(!found)
				System.out.println("발견할 수 없음");
		}
		sc.close();
	}
	
	public void run() {
		boolean res = readFile();
		if(res == true)
			processQuery();
		System.out.println("종료합니다...");
	}
	

	public static void main(String[] args) {
		Prac11 ws = new Prac11();
		ws.run();
	}

}
