package week5Task;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이화여대 컴공과 2371049 이홍연");
		ColorPoint2 cp1 = new ColorPoint2();
		ColorPoint2 cp2 = new ColorPoint2(30, 20, "DEEPGREEN");
		System.out.println();
		
		cp1.showPoint();
		cp2.showPoint();
		cp2.showDistance(cp1);
	}

}
