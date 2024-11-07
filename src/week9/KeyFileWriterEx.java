package week9;



	import java.io.FileOutputStream;
	import java.io.OutputStreamWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class KeyFileWriterEx {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String filename = "user_input_ansi.txt";  // 저장할 파일 이름

	        System.out.println("저장할 내용을 입력하세요. (입력을 마치려면 빈 줄 입력)");

	        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename), "MS949")) {

	            while (true) {
	                String input = scanner.nextLine();
	                if (input.isEmpty()) {  // 빈 줄을 입력하면 종료
	                    break;
	                }
	                writer.write(input + System.lineSeparator());  // 입력 내용을 파일에 쓰고 줄바꿈 추가
	            }

	            System.out.println("입력한 내용을 ANSI 인코딩으로 저장했습니다: " + filename);

	        } catch (IOException e) {
	            System.out.println("파일 쓰기 오류: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}



