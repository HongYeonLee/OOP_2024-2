package week14Task;

import java.util.Scanner;

public class CarAssemblyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		//각 부품을 생산하는 스레드 생성
		System.out.println("과제#9 이화여대 컴퓨터공학과 2371049 이홍연");
		System.out.println("\nRunnable Interface 사용한 스레드");
		System.out.print("\n생산 자동차 대수 (바퀴4, 몸체1, 문3): ");
		int carNum = key.nextInt();
		
		CarFactory factory = new CarFactory();
		
		//생산 스레드
		Thread wheelProducer = new Thread(new Producer(factory, "Wheel", carNum*4, 1000));
		Thread doorProducer = new Thread(new Producer(factory, "Door", carNum*3, 1500));
		Thread bodyProducer = new Thread(new Producer(factory, "Body", carNum*1, 2000));
		
		//조립 스레드
		Thread assembler = new Thread(factory::assembleCar);
		
		//판매 스레드
		Thread carSeller = new Thread(new Consumer(factory, carNum, 3000));
		
		//스레드 실행
		wheelProducer.start();
		doorProducer.start();
		bodyProducer.start();
		assembler.start();
		carSeller.start();
	}

}
