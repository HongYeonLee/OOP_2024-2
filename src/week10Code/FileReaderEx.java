package week10Code;

	import java.io.FileInputStream;
	import java.io.InputStreamReader;
	import java.io.BufferedReader;
	import java.io.IOException;

	public class FileReaderEx {

	    public static void main(String[] args) {
	        //String filename = "example_ansi.txt";  // 읽을 파일 이름
	    	String filename = "user_input_ansi.txt";  // 읽을 파일 이름
	        // ANSI 인코딩 (예: MS949 또는 CP1252) 지정
	        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename), "MS949");
	             BufferedReader bufferedReader = new BufferedReader(reader)) {

	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);  // 한 줄씩 출력
	            }
	        } catch (IOException e) {
	            System.out.println("파일 읽기 오류: " + e.getMessage());
	        }
	    }
	}
