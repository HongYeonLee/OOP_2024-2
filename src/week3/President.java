package week3;

import week3.Professor;

class President extends Professor{
	String university;
	String vision;
	
	President(){
		super("대한민국");
		university = "이화여대";
		vision = "일류대학";
	}
	
	President(String university) {
		this.university = university;
	}

	President(String university, String vision) {
		this(university);
		this.vision = vision;
	}

	void 학교성장() {
		System.out.print(" 학교를 성장시키다");
	}

}
