package week4;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ewha = new Student();
		Student com = new Student("A", "computer");
		
		//출력은 친절하게, 자세하게
		System.out.println("ewha.name = " + ewha.getName() 
						+ " ewha.id = " + ewha.getId()
						+ " ewha.grade = " + ewha.getGrade()
						+ " ewha.department = " + ewha.getDepartment());
		System.out.println();
		
		System.out.println("com.name = " + com.getName() 
						+ " com.id = " + com.getId()
						+ " com.grade = " + com.getGrade()
						+ " com.department = " + com.getDepartment());
		System.out.println();
		
		ewha.setName("안영아");
		ewha.setGrade("A+");
		System.out.println("ewha.name = " + ewha.getName() 
						+ " ewha.id = " + ewha.getId()
						+ " ewha.grade = " + ewha.getGrade()
						+ " ewha.department = " + ewha.getDepartment());
	}

}
