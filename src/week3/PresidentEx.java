package week3;

public class PresidentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		President[] 총장들 = new President[5];
		
		총장들[0] = new President();
		총장들[1] = new President("서울대", "최고학교");
		총장들[2] = new President("연세대", "연구최고");
		총장들[3] = new President("한양대", "학생우선");
		총장들[4] = new President("서강대", "복지우선");
		
		for(int i = 0; i <총장들.length; i++) {
			총장들[i].name = "총장" + i;
		}
		
		for(int i = 0; i < 총장들.length; i++) {
			System.out.print("이름: " + 총장들[i].name + " 학교: " + 총장들[i].university + " 비전: " 
							+ 총장들[i].vision + " 연구분야: " + 총장들[i].subjectArea + " 나라: " + 총장들[i].country);
			총장들[i].speak();
			총장들[i].eat();
			총장들[i].sleep();
			총장들[i].walk();
			총장들[i].teach();
			총장들[i].학교성장();
			System.out.println();
		}
	}

}
