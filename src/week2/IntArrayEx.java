package week2;

public class IntArrayEx {

	public static void main(String[] args) {
		
		//정수 배열
		int[] ewha = new int[10];
		int[] ewhaRef;
		ewhaRef = ewha; //두 레퍼런스 변수가 같은 주소를 가리킴
		
		for (int i = 0; i < ewha.length; i++) {
			ewha[i] = i;
		}
		
		for (int i = 0; i < ewha.length; i++) {
			System.out.println("ewha[" + i + "] = " + ewha[i]);
			
		}
		
		for (int i = 0; i < ewha.length; i++) {
			System.out.println("ewhaRef[" + i + "] = " + ewhaRef[i]);
			
		}
		
		//실수 배열
		double[] com = new double[10];
		
		for (int i = 0; i < 10; i++) {
			com[i] = 1.; //초기화
		}
		
		for (int i = 0; i < 10; i++) {
			com[i] = i * 2;
		}
		
		for (int i = 0; i < com.length; i++) {
			System.out.println("com[" + i + "] = " + com[i]);
		}
		
		//문자열 배열
		String[] name = new String[5]; //문자열 String은 클래스
		name[0] = "이화여대";
		name[1] = "컴공과";
		name[2] = "자바프로그래밍";
		name[3] = "이홍연";
		name[4] = "가을학기";
		
		//boolean 배열
		boolean[] grade = new boolean[4];
		grade[0] = true;
		grade[1] = false;
		grade[2] = false;
		
		//문자 배열
		char[] mouse = new char[4];
		mouse[0] = '이';
		mouse[1] = '화';
		mouse[2] = '여';
		mouse[3] = '대';
		
		//2차원 배열
		//정수 2차원 배열
		int[][] ewha2 = new int[3][2];
		
		for (int i = 0; i < ewha2.length; i++) {
			for (int j = 0; j < ewha2[i].length; j++) {
				ewha2[i][j] = i * 2 + j; 
			}
		}
		
		for (int i = 0; i < ewha2.length; i++) {
			for (int j = 0; j < ewha2[i].length; j++) {
				System.out.println("ewha2[" + i + "][" + j + "] = " + ewha2[i][j]);
			}
		}
		
		//문자열 2차원 배열
		String[][] com2 = new String[2][3];
		
		//문자열 넣고 출력
		//com2[i][j] = "com2_ij"
		for (int i = 0; i < com2.length; i++) {
			for(int j = 0; j < com2[i].length; j++) {
				com2[i][j] = "com2_" + i + j; 
			}
		}
		
		for (int i = 0; i < com2.length; i++) {
			for(int j = 0; j < com2[i].length; j++) {
				System.out.println("com2[" + i + "][" + j + "] = " + com2[i][j]);
			}
		}
		
		//비정방형 배열, 2차원
		String[][] ewha3 = new String[3][];
		
		ewha3[0] = new String[4];
		ewha3[1] = new String[2];
		ewha3[2] = new String[1];
		
		for (int i = 0; i <ewha3[0].length; i++) {
			ewha3[0][i] = "ewha3_0" + i;
		}
		
		for (int i = 0; i < ewha3[1].length; i++) {
			ewha3[1][i] = "ewha3_1" + i;
		}
		
		for (int i = 0; i < ewha3[2].length; i++) {
			ewha3[2][i] = "ewha3_2" + i;
		}
		
		for (int i = 0; i < ewha3.length; i++) {
			for (int j = 0; j < ewha3[i].length; j++) {
				System.out.println("ewha3[" + i + "][" + j + "] = " + ewha3[i][j]);
			}
		}
		
		//3차원 배열
		String[][][] com3 = new String[3][][];
		
		com3[0] = new String[3][];
		com3[0][0] = new String[3];
		com3[0][1] = new String[2];
		com3[0][2] = new String[1];
		
		com3[1] = new String[2][2];
		com3[2] = new String[1][2];
		

	}
	

}
