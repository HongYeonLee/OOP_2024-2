package week10Code;



	import java.io.FileWriter;
	import java.io.IOException;

	public class FileWriterNotBufEx {

	    public static void main(String[] args) {
	        String filename = "example_no_buffer.txt";  // 작성할 파일 이름
	        String content = "가을은 조용히 찾아와\n나뭇잎을 물들이고\n우리의 마음도 물들인다.\n";

	        FileWriter writer = null;
	        try {
	            // FileWriter 생성
	            writer = new FileWriter(filename);

	            // 파일에 문자열 작성
	            writer.write(content);

	            // flush를 사용하여 강제로 출력
	            writer.flush();
	            
	            System.out.println("파일 작성 완료: " + filename);
	            
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


