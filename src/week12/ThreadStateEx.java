package week12;

import java.util.Scanner;

public class ThreadStateEx {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("과제#8-3 이화여대 컴퓨터공학과 2371049 이홍연");
		System.out.println("\nRunnalbe Interface 사용해서 스레드 상태 확인");
		System.out.print("\n스레드 개수: ");
		
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		Thread[] threads = new Thread[num];
		
		//스레드 생성
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Task(i + 1, (i + 1) * 5000));
		}
		
		//스레드 상태 출력 (NEW 상태)
		for (int i = 0; i < threads.length; i++) {
			System.out.println("스레드 " + (i + 1) + " 상태: " + threads[i].getState());
		}
		
		//스레드 시작
		for (Thread thread : threads) {
			thread.start();
		}
		
		//스레드 상태 출력 (RUNNABLE 상태 또는 TIMED_WAITING 상태
		for (int i = 0; i < threads.length; i++) {
			Thread.sleep(500); //상태를 보기 위해 잠시 대기
			System.out.println("스레드 " + (i + 1) + " 상태: " + threads[i].getState() +
								" 이름: " + threads[i].getName() + 
								" ID: " + threads[i].getId() + 
								" 우선순위: " + threads[i].getPriority());
		}
		
		//모든 스레드가 종료될 때까지 대기
		for (Thread thread : threads) {
			thread.join();
		}
		
		//스레드 상태 출력 (TERMINATED 상태)
		for (int i = 0; i < threads.length; i++) {
			System.out.println("스레드 " + (i + 1) + " 상태: " + threads[i].getState());
		}
		
		System.out.println("모든 스레드 작업 완료");
	}

}
