package Practice;

import java.io.*;
import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader fReader = null;
		FileWriter fWriter = null;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야합니다.");
		
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String s1 = sc.nextLine();
		
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String s2 = sc.nextLine();
		
		try {
			fReader = new FileReader(s1);
			fWriter = new FileWriter("C:/temp/appended2.txt");
			writeToFile(fReader, fWriter);
			fReader.close();
			
			fReader = new FileReader(s2);
			writeToFile(fReader, fWriter);
			
			fReader.close();
			fWriter.close();
			System.out.println("프로젝트 폴더 밑에 appended2.txt 파일에 저장하였습니다.");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
		
		/*
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
			in.close();*/
	}
	
	private static void writeToFile(FileReader in, FileWriter out) throws IOException{
		char buf[] = new char[50];
		int count = 0;
		while(true) {
			count = in.read(buf, 0, buf.length);
			if(count == -1)
				break;
			if(count > 0) {
				out.write(buf, 0, count);
			}			
		}		
	}

}
