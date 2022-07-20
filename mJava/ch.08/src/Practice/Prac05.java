package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Prac05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로잭트 폴더에 있어야 합니다.");
		try {
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			String s1 = sc.next(); 
			FileInputStream fin1 = new FileInputStream(s1);
			System.out.print("두번째 파일 이름을 입력하세요>>");
			String s2 = sc.next(); 
			FileInputStream fin2 = new FileInputStream(s2);
			System.out.println(s1 + "와 " + s2 + "를 비교합니다.");
			int c1, c2;
			while((c1=fin1.read())!=-1) {
				if((c2=fin2.read())!=-1){
					if(c1==c2)
						continue;
					else {
						System.out.println("파일이 다릅니다.");
						return;
					}
				}
				
			}
			System.out.println("파일이 같습니다.");
			
			fin1.close();
			fin2.close();
		}catch(IOException e) {
			System.out.println("파일을 읽지 못했습니다. 경로명을 확인해 주세요.");
			
		}		
	}

}
