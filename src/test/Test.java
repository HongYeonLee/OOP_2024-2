package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		while(x++ < 3) {
			System.out.println(x);
		}
		
		int i = 0, j =0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				if(i == 2 && j == 1) break;
				if(i == 3 && j == 2) continue;
			}
		}
		
		System.out.println("i = " + i + ", j = " + j);
		
		//배열 선언
		int[] array = new int[5];
		int array1[] = new int[5];
		int[][] array2 = new int[5][];
		array2[0] = new int[3];
	}

}