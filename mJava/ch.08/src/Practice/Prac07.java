package Practice;

import java.io.*;

public class Prac07 {

	public static void main(String[] args) {
		BufferedInputStream srcStream = null;
		BufferedOutputStream destStream = null;
		File srcFile = new File("c:/Windows/Web/Wallpaper/Theme1/img1.jpg");
		File destFile = new File("c:/Temp/copyimg.jpg");
		
		try {
			srcStream = new BufferedInputStream(new FileInputStream(srcFile)); // 버퍼 입력 스트림에 연결
			destStream = new BufferedOutputStream(new FileOutputStream(destFile)); // 버퍼 출력 스트림에 연결
			
			long tenPercent = srcFile.length();
			long progress = 0;
			
			System.out.println("a.jpg를 b.jpg로 복사합니다. \n%10마다 *를 출력합니다.");
			byte[] buf = new byte[1024];
			int numRead = 0;
			while(true) {
				numRead = srcStream.read(buf, 0, buf.length);
				if(numRead == -1) {
					if(progress > 0) {
						System.out.print("*");
					}
					break;
				}
				if(numRead>0)
					destStream.write(buf, 0, numRead);
				
				progress += numRead;
				if(progress>=tenPercent) {
					System.out.print("*");
					progress = 0;
				}
			}
			srcStream.close();
			destStream.close();
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
			
		
		
		/*File src = new File("c:/Windows/Web/Wallpaper/Theme1/img1.jpg");
		
		File dest = new File("c:/Temp/copyimg.jpg");
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			int n=0;
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
				n++;
				if(n==(src.length()/10)) {
					System.out.print("*");
					n=0;
				}			
			}
			System.out.println();
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}*/
	}

}
