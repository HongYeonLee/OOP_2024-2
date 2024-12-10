package week10Code;



	import java.io.FileReader;
	import java.io.IOException;

	public class FileReaderNotBufEx {

	    public static void main(String[] args) {
	        String filename = "example_no_buffer.txt";  // 읽을 파일 이름

	        FileReader reader = null;
	        try {
	            // FileReader 생성
	            reader = new FileReader(filename);
	            int character;

	            // 파일에서 한 문자씩 읽기
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);  // 문자 출력
	            }

	        } catch (IOException e) {
	            System.out.println("파일 읽기 오류: " + e.getMessage());
	            
	        } finally {
	            // FileReader 닫기
	            try {
	                if (reader != null) reader.close();
	            } catch (IOException e) {
	                System.out.println("파일 닫기 오류: " + e.getMessage());
	            }
	        }
	    }
	}



