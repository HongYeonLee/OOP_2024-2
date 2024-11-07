package week10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

class FileReadClass {
    public Vector<String> reader() {
        String filename;
        Scanner sc = new Scanner(System.in);
        System.out.print("읽을 파일 이름 입력 : ");
        filename = sc.nextLine();
        
        Vector<String> v = new Vector<String>();
        FileReader reader = null;
        try {
            // FileReader 생성
            reader = new FileReader(filename+".txt"); //open
            Scanner fileScanner = new Scanner(reader);
            fileScanner.useDelimiter(","); // ','로 구분해서 읽기
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();  // 한 줄 읽기
                String[] data = line.split(",");  // 콤마로 구분
                
                // 각 항목을 벡터에 추가
                for (String s : data) {
                    v.add(s.trim());  // trim()으로 공백 제거 후 추가
                }
            }

        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
            
        } finally {
            // FileReader 닫기
            try {
                if (reader != null) reader.close(); //close - 수정을 하지 않으므로 저장x, 메모리 반납만
            } catch (IOException e) {
                System.out.println("파일 닫기 오류: " + e.getMessage());
            }
            System.out.println(filename + "을(를) 읽었습니다");
            System.out.println();
            System.out.println(filename + "의 내용");
            for (int i = 0; i < v.size(); i+=3) {
            	System.out.println(v.get(i) + " " + v.get(i+1) + " " + v.get(i+2));
            }
        }
        
        return v;
    }
}
