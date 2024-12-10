package week11Vid;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int dividend; //나뉨수
		int divisor; //나눗수
		
		while(true) {
			System.out.print("나뉨수를 입력하십시오: ");
			try {
				dividend = scanner.nextInt();
				
			}catch(InputMismatchException e) { //java.util.InputMismatchException;
				scanner.nextLine(); //버퍼 비우기
				System.out.println("정수를 입력해주세요.");
				continue;
			}
		
			System.out.print("나눗수를 입력하시오: ");
			divisor = scanner.nextInt();
			
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " +
									dividend/divisor + "입니다");
			}catch(ArithmeticException e) { //import할 필요x
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}	

}
