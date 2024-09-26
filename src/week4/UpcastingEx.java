package week4;

public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//업캐스팅
		Person ahn;
		Student ewha;
		
		ewha = new Student("A", "컴퓨터");
		ahn = ewha;
		
		System.out.println("ewha 오브젝트");
		System.out.println("ewha.name = " + ewha.getName() 
						+ " ewha.id = " + ewha.getId()
						+ " ewha.grade = " + ewha.getGrade()
						+ " ewha.department = " + ewha.getDepartment());
		System.out.println();
		
		//업캐스팅
		System.out.println("ahn 오브젝트");
		System.out.println("ahn.name = " + ahn.getName() 
						+ " ahn.id = " + ahn.getId()
						+ " ahn.grade = " //+ ahn.getGrade()
						+ " ahn.department = " //+ ahn.getDepartment());
						);
		System.out.println();
		
	}

}
