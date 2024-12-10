package week11Vid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileNotFoundException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile("c:/Temp/example.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFile(String filename) throws IOException{
		FileReader frs = null;
		try {
			frs = new FileReader(filename);
		} catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		BufferedReader reader = new BufferedReader(frs);
		String line = null;
		
		while(true) { //readLine()은 IOException throws함
			try {
				line = reader.readLine();
			} catch(IOException e) {
				System.out.println("reader.readLine()할 수가 없습니다.");
			}
			
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		
		reader.close();
	}
}
