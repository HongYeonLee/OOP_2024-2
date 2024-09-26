package week4;

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ahn = new Person();
		Person ewha = new Person("안영아", "STUDENT");
		
		//System.out.println("ahn.name = " + ahn.name);
		System.out.println("ahn.name = " + ahn.getName());
		System.out.println("ewha.name = " + ewha.getName());
		
		//ahn.name = "한국인";
		ahn.setName("한국인");
		System.out.println("ahn.name = " + ahn.getName());
	}

}
