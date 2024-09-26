package week4;

public class DowncastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person com, ahn;
		Student ewha;
		
		com = new Person();
		//com = ahn; 문제발생
		//ewha = (Student) com; //com은 new를 통해 Person 클래스에대한 메모리 할당을 받았기에 Student 클래스에 대한 메모리 할당은 받지 않아서 오류
		ahn = new Student(); //상속에서 가장 많이 쓰는 코드, 업캐스팅, 실제 크기보다 더 크게 메모리 할당을 받음
		//System.out.println("ahn.grade = " + ahn.getGrade());
		
		ewha = (Student) ahn;
		System.out.println("ewha.grade = " + ewha.getGrade());
		
		Person aPerson = new Student();
		Student bStudent = (Student) aPerson;
		
		//작은걸 큰거에 넣을 때는 오류 발생x, 반대는 발생 
		//int aNum = 75.344; //
		//byte bNum = 10000; //1바이트 변수에 4바이트 변수를 넣어서 오류
		
		System.out.println("com 오브젝트");
		System.out.println("com.name = " + com.getName() 
						+ " com.id = " + com.getId()
						+ " com.grade = " + "접근불가 "
						+ " com.department = " + "접근불가 ");
	}

}
