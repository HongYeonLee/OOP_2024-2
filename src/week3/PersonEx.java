package week3;

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오브젝트 프로그래밍, OOP
		//사람, 학생, 조교, 연구자, 교수님
		System.out.println("Person ---------");
		Person ahn = new Person("안영아");
		System.out.print("Person: " + ahn.name);
		ahn.speak();
		ahn.eat();
		ahn.walk();
		ahn.sleep();
		System.out.println(ahn.getClass()); //추가
		System.out.println("ahn.toString(): " + ahn.toString()); //추가
		System.out.println();
		System.out.println();
		
		//학생
		System.out.println("Student ---------");
		Student ewha = new Student("이화여대");
		System.out.print("Student: " + ewha.name + " " + ewha.school);
		ewha.speak();
		ewha.eat();
		ewha.walk();
		ewha.sleep();
		ewha.study();
		System.out.print(ewha.getClass()); //추가
		System.out.println();
		System.out.println();
		
		//조교
		System.out.println("StudentWorker ---------");
		StudentWorker com = new StudentWorker("시험도우미");
		System.out.print("StudentWorker: " + com.name + " " + com.school + " " + com.jobRole);
		com.speak();
		com.eat();
		com.walk();
		com.sleep();
		com.study();
		com.work();
		System.out.print(com.getClass()); //추가
		System.out.println();
		System.out.println();
		
		//연구자
		System.out.println("Researcher ---------");
		Researcher lim = new Researcher("AI");
		System.out.print("Reseacher: " + lim.name + " " + lim.subjectArea);
		lim.speak();
		lim.eat();
		lim.walk();
		lim.sleep();
		lim.reseach();
		System.out.print(lim.getClass()); //추가
		System.out.println();
		System.out.println();
		
		//교수
		System.out.println("Professor ---------");
		Professor young = new Professor("대한민국");
		System.out.print("Professor: " + young.name + " " + young.subjectArea + " " + young.country);
		young.speak();
		young.eat();
		young.walk();
		young.sleep();
		young.reseach();
		young.teach();
		System.out.print(young.getClass()); //추가
		System.out.println();
		System.out.println();
		
	}

}
