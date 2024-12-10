package 기말;

import java.util.Scanner;

public class CarAssemblyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		//각 부품을 생산하는 스레드 생성
		System.out.print("생산 자동차 대수 (바퀴4, 몸체1, 문3): ");
		int carNum = key.nextInt();
		CarFactory factory = new CarFactory();
		
		//생산스레드
		Thread wheel = new Thread(new Producer(factory, "Wheel", carNum*4, 1000));
		Thread door = new Thread(new Producer(factory, "Door", carNum*3, 1500));
		Thread body = new Thread(new Producer(factory, "Body", carNum, 2000));
		
		//조립 스레드
		Thread assembler = new Thread(factory::assembleCar);
		
		//스레드 실행
		wheel.start();
		door.start();
		body.start();
		assembler.start();
	}

}
