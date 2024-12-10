package week10Code;

import java.io.*;
import java.util.ArrayList;

public class FileIOExample {

    // 파일로 데이터 저장
    public static void writeToFile(String filename, ArrayList persons) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Object obj : persons) {
                Person person = (Person) obj;  // 타입 캐스팅 필요
                writer.write(person.toString());
                writer.newLine();
            }
            System.out.println("파일 저장 성공: " + filename);
        } catch (IOException e) {
            System.out.println("파일 저장 실패: " + e.getMessage());
        }
    }

    // 파일에서 데이터 읽기
    public static ArrayList readFromFile(String filename) {
        ArrayList persons = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String occupation = data[2];
                persons.add(new Person(name, age, occupation));
            }
            System.out.println("파일 읽기 성공: " + filename);
        } catch (IOException e) {
            System.out.println("파일 읽기 실패: " + e.getMessage());
        }
        return persons;
    }
    
}