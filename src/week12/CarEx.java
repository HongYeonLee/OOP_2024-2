package week12;

import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("과제#8-1 이화여대 컴퓨터공학과 2371049 이홍연");
		System.out.println("\nThread class 사용한 스레드");
		System.out.print("\n생산 자동차 대수(바퀴4, 몸체1, 문3): ");
		
		// 각 부품을 생성하는 스레드 생성
		int carNum = key.nextInt();
		
		FactoryThread wheels = new FactoryThread("바퀴", 500, carNum * 4);
		FactoryThread trunk = new FactoryThread("몸체", 900, carNum );
		FactoryThread door = new FactoryThread("문", 700, carNum * 3);
		wheels.start();
		trunk.start();
		door.start();
	}

}
