package ch08_11;

import java.io.*;
import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		System.out.println("아래에서 전체 경로명이 아닌 파일 이름만 입력하세요");
		String s1, s2;
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		s1 = sc.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		s2 = sc.nextLine();
		try {
			br = new BufferedReader(new FileReader(s1));
			bw = new BufferedWriter(new FileWriter("c:/temp/append.txt"));
			writeToFile(br, bw);
			br = new BufferedReader(new FileReader(s2));
			writeToFile(br, bw);
			if(bw!=null)
				bw.close();
			System.out.println("appended.txt. 파일에 저장하였습니다.");
			
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
	
	private static void writeToFile(BufferedReader in, BufferedWriter out) throws IOException{
		char b[] = new char[50];
		int numRead = 1;
		while(numRead>0) {
			numRead = in.read(b, 0, b.length);
			if(numRead>0) {
				out.write(b, 0, numRead);
			}
		}
		if(in != null)
			in.close();
	}

}
