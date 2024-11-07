package week10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

class FileWriterClass {
	public void writer(String data) {
        Scanner sc = new Scanner(System.in);
        System.out.print("생성할 파일 이름 입력: ");
        String filename = sc.nextLine();
        
        File file = new File(filename+".txt");
        boolean isFileExist = file.exists();
        boolean option = false;
        
        if(isFileExist) {
        	System.out.println("이미 이름이 같은 파일이 있습니다.");
        	System.out.print("해당 파일에 이어쓰기 - true | 해당 파일 덮어쓰기 - false : ");
        	option = sc.nextBoolean();
        	sc.nextLine(); //엔터먹어가기
        }
        

        FileWriter writer = null;
        try {
            // FileWriter 생성
            writer = new FileWriter(filename+".txt", option);

            // 파일에 문자열 작성
            writer.write(data);

            // flush를 사용하여 강제로 출력
            writer.flush(); //버퍼 비우기
            
            System.out.println(filename + " 생성되었습니다");
            
        } catch (IOException e) {
            System.out.println("파일 쓰기 오류: " + e.getMessage());
            
        } finally {
            // FileWriter 닫기
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("파일 닫기 오류: " + e.getMessage());
            }
        }
    }
}
