package week9;

import java.io.*;
import java.util.ArrayList;

public class MainEx {

	public static void main(String[] args) {
        // 샘플 데이터 생성
        ArrayList persons = new ArrayList();
        persons.add(new Person("Alice", 30, "Engineer"));
        persons.add(new Person("Bob", 25, "Designer"));
        persons.add(new Person("Charlie", 35, "Teacher"));

        FileIOExample  sample  = new  FileIOExample();
        
        // 파일에 데이터 저장
        String filename = "people.txt";
        sample.writeToFile(filename, persons);

        // 파일에서 데이터 읽기
        ArrayList loadedPersons = sample.readFromFile(filename);
        for (Object obj : loadedPersons) {
            Person person = (Person) obj;  // 타입 캐스팅 필요
            System.out.println(person);
        }
    }
}



