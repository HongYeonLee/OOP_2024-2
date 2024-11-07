package week9;



	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;

	public class FileReaderNotBufEx {

	    public void reader() {
	        String filename = "example_no_buffer.txt";  // 읽을 파일 이름
	        Scanner sc = new Scanner(System.in);
	        System.out.print("읽을 파일 이름 입력 : ");
	        filename = sc.nextLine();

	        FileReader reader = null;
	        try {
	            // FileReader 생성
	            reader = new FileReader(filename); //open
	            int character;

	            // 파일에서 한 문자씩 읽기
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);  // 문자 화면 출력
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
	        }
	    }
	}



