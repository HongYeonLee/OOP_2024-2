package week12;

import java.util.Scanner;

public class RunnableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("과제#8-2 이화여대 컴퓨터공학과 2371049 이홍연");
		System.out.println("\nRunnable Interface 사용한 스레드");
		System.out.print("\n생산 자동차 대수(바퀴4, 몸체1, 문3): ");
		
		// 각 부품을 생성하는 스레드 생성
		int carNum = key.nextInt();
		
		Thread wheelWorker = new Thread(new FactoryThread("바퀴", 500, carNum * 4));
		Thread trunkWorker = new Thread(new FactoryThread("몸체", 900, carNum ));
		Thread doorWorker = new Thread(new FactoryThread("문", 700, carNum * 3));
		wheelWorker.start();
		trunkWorker.start();
		doorWorker.start();
	}

}
