package week4Task;

public class TaskEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//업캐스팅
		Employee m = new Manager("매니저", 20, "여자", 200, "1월1일", 3); 
		Employee p1 = new Staff("스태프", 21, "여자", 100, "1월2일", "카페라떼");
		Person p2 = new Hourly("알바1", 22, "여자", 50, "1월3일", 2);
		Person p3 = new Hourly("알바2", 23, "여자", 40, "1월4일", 3);
		
		//다운캐스팅
		Staff s = (Staff) p1;
		Hourly h1 = (Hourly) p2;
		Hourly h2 = (Hourly) p3;
		
		System.out.println("Employee 이름 = " + m.getName()
						+ " 나이 = " + m.getAge()
						+ " 성별 = " + m.getGender()
						+ " 월급 = " + m.getSalary()
						+ " 고용일 = " + m.getHireDate());
		
		System.out.println();
		
		System.out.println("Staff 이름 = " + s.getName()
						+ " 나이 = " + s.getAge()
						+ " 성별 = " + s.getGender()
						+ " 월급 = " + s.getSalary()
						+ " 고용일 = " + s.getHireDate()
						+ " 주요커피 = " + s.getMajor());
		System.out.println();

		System.out.println("Hourly1 이름 = " + h1.getName()
						+ " 나이 = " + h1.getAge()
						+ " 성별 = " + h1.getGender()
						+ " 월급 = " + h1.getSalary()
						+ " 고용일 = " + h1.getHireDate()
						+ " 일한시간 = " + h1.getTime());
		System.out.println();

		System.out.println("Hourly2 이름 = " + h2.getName()
						+ " 나이 = " + h2.getAge()
						+ " 성별 = " + h2.getGender()
						+ " 월급 = " + h2.getSalary()
						+ " 고용일 = " + h2.getHireDate()
						+ " 일한시간 = " + h2.getTime());
		System.out.println();

	}

}
