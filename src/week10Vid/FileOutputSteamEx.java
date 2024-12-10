package week10Vid;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputSteamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		String filename = "c:/Temp/outputByteStream";
		FileOutputStream fos = null;
		
		try {
			//파일 열 때 에러 발생 가능
			fos = new FileOutputStream(filename);
			
			while(true) {
				//파일에 문자열 쓰기
				System.out.print("data (quit): ");
				String data = key.nextLine(); //빈칸 포함
				if(data.equals("quit")) {
					break;
				}
				fos.write(data.getBytes()); //바이트를 문자열로 변환해서 메모리에 write
				
				//파일에 정수 쓰기 (깨짐)
				System.out.print("data (0:exit) :");
				int data2 = key.nextInt(); //빈칸 포함
				if(data2 == 0) {
					break;
				}
				fos.write(data2);
			}
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					//파일 스트림을 닫습니다
					fos.close(); //저장, 에러 발생 가능
					System.out.println(filename + " 데이터가 파일에 성공적으로 저장되었습니다.");
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
