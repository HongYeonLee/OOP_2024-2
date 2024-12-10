package week10Code;


import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) {
        String filename = "example_ansi.txt";  // 작성할 파일 이름
        String[] lines = {
            "가을은 조용히 찾아와",
            "나뭇잎을 물들이고",
            "우리의 마음도 물들인다."
        };

        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename), "MS949");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            for (String line : lines) {
                bufferedWriter.write(line);  // 한 줄씩 파일에 쓰기
                bufferedWriter.newLine();    // 줄바꿈 추가
            }
            System.out.println("ANSI 인코딩으로 파일 작성 완료: " + filename);

        } catch (IOException e) {
            System.out.println("파일 쓰기 오류: " + e.getMessage());
        }
    }
}
