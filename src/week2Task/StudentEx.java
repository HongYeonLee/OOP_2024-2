package week2Task;
import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {
		Student[][] school;
		int ban;
		int person;
		Scanner sc = new Scanner(System.in);
		System.out.print("반과 인원을 입력하세요 : ");
		ban = sc.nextInt();
		person = sc.nextInt();
		
		school = new Student[ban][person];
		
		for (int i = 0; i < school[0].length; i++) {
			school[0][i] = new Student();
		}
		
		school[1][0] = new Student("서울대", "김서울");
		school[1][1] = new Student("연세대", "김연세");
		school[1][2] = new Student("고려대", "김고려");
		school[1][3] = new Student("서강대", "김서강");
		school[1][4] = new Student("한양대", "건축학과", 21123, "김한양", 25, "ee@email.com");
		
		school[2][0] = new Student("사회복지학과", "김사복", 240000, 20);
		school[2][1] = new Student("철학과", "김철학", 240001, 21);
		school[2][2] = new Student("휴기바", "김휴기바", 240002, 22);
		school[2][3] = new Student("조소과", "김조소", 240003, 23);
		school[2][4] = new Student("작곡과", "김작곡", 240004, 24);
		
		
		
		for (int i = 0; i < school.length; i++) {
			for (int j = 0; j < school[i].length; j++) {
				System.out.println(school[i][j].name + "의 전공은 " + school[i][j].major + "이고 " + 
			                       school[i][j].age + "살이며 학번은 " + school[i][j].ID + "입니다.");
				System.out.println(school[i][j].school + "에 다니고 있으며 이메일은 " + school[i][j].email + "입니다");
			}
			System.out.println();
		}
	}
}
