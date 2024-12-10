package week10Vid;

import java.io.*; //이러면 io 패키지 밑에 있는 모든 클래스 import
import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일 객체 생성
		File file = new File("c:/Temp/example.txt");
		
		try {
			//파일 생성
			if(file.createNewFile()) {
				System.out.println("File created: " + file.getName());
				System.out.println("File created: " + file.getAbsolutePath());
			}
			
			else {
				System.out.println("File already exists. " + file.getAbsolutePath());
			}
			
			//파일 속성 확인
			System.out.println();
			System.out.println("File path: " + file.getAbsolutePath());
			System.out.println("Is writable " + file.canWrite());
			System.out.println("Is readable " + file.canRead());
			System.out.println("File size in bytes: " + file.length());
			
			//파일 삭제
			if(file.delete()) {
				System.out.println("Deleted the file: " + file.getName());
			}
			else {
				System.out.println("Failed to deletee the file.");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
        // 디렉터리 생성 예제
        File dir = new File("exampleDirectory");
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Directory created: " + dir.getName());
            } else {
                System.out.println("Failed to create directory.");
            }
        }

        // 디렉터리 안에 파일 생성
        File nestedFile = new File(dir, "nestedFile.txt");
        try {
            if (nestedFile.createNewFile()) {
                System.out.println("File created in directory: " + nestedFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating file in directory.");
            e.printStackTrace();
        }
	}

}
