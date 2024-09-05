package week1;

public class ExamplePerson {

	public static void main(String[] args) {

	  //클래스   객체
		Person hwang; // 객체 선언, 레퍼런스 변수
		hwang = new Person(); // new로 생성자 호출 - 메모리 할당
		hwang.name = "황수현";
		hwang.job = "컴퓨터과학전공 학생";
		hwang.age = 20;
		hwang.gender = true;
		hwang.bloodType = "A";
		
		System.out.print(hwang.name + "은 " + hwang.job + "이고 " + hwang.age + "세이며 ");
		if (hwang.gender) {
			System.out.print("여성이면서 ");
		}
		else {
			System.out.print("남성이면서 ");
		}
		System.out.println("혈액형은 " + hwang.bloodType + "형 입니다.");
		
		Person 이홍연 = new Person();
		이홍연.name = "이홍연";
		이홍연.job = "컴퓨터공학과 학생";
		이홍연.age = 22;
		이홍연.gender = true;
		이홍연.bloodType = "A";
		
		System.out.print(이홍연.name + "은 " + 이홍연.job + "이고 " + 이홍연.age + "세이며 ");
		if (이홍연.gender) {
			System.out.print("여성이면서 ");
		}
		else {
			System.out.print("남성이면서 ");
		}
		System.out.println("혈액형은 " + 이홍연.bloodType + "형 입니다.");
	}

}
