package week14Task;
import java.util.HashMap;
import java.util.Map;

class CarFactory {
	private final HashMap<String, Integer> inventory = new HashMap<>(); // 부품 저장소
	private final Object lock = new Object(); //동기화 객체
	int carCnt;
	int sellCarCnt;
	
	public CarFactory() {
		//초기 부품 재고 설정
		inventory.put("Wheel", 0);
		inventory.put("Door", 0);
		inventory.put("Body", 0);
		carCnt = 0;
		sellCarCnt = 0;
	}
	
	public void produce(String partName, int count) {
		// TODO Auto-generated method stub
		synchronized (lock) {
			inventory.put(partName, inventory.get(partName) + count);
			System.out.println(partName + " 생산 완료 (" + inventory.get(partName) + "개)");
			System.out.println("현재 재고: " + inventory);
			System.out.println("***** 생산 notifyAll()");
			lock.notifyAll(); //조립 스레드에 알림
		}
	}
	
	public void sellCar() {
		// TODO Auto-generated method stub
		synchronized (lock) {
			try {
				if(carCnt > 0) {
					System.out.println("영업점에서 자동차를 판매합니다. 현재 자동차 판매 수 (" + sellCarCnt + "개)");
					carCnt--;
				}
				else {
					System.out.println("생산된 자동차가 없어 영업점에서 자동차를 팔 수 없습니다.");
					System.out.println("-----판매 wait()");
					lock.wait();
				}
			}catch(InterruptedException e) {
				System.out.println("판매 스레드가 중단되었습니다.");
			}
		}
	}
	
	public void assembleCar() {
		synchronized(lock) {
			try {
				while(true) {
					//모든 부품이 준비될 때까지 대기
					if(inventory.get("Wheel") >= 4 && inventory.get("Door") >= 3 && inventory.get("Body") >= 1) {
						inventory.put("Wheel", inventory.get("Wheel") - 4);
						inventory.put("Door", inventory.get("Door") - 3);
						inventory.put("Body", inventory.get("Body") - 1);
						System.out.println("🚗 Car assembled! 1대 현재 재고: " + inventory);
						carCnt++;
						sellCarCnt++;
						System.out.println("***** 판매 notifyAll()");
						lock.notifyAll(); //판매 스레드에 알림
					}
					else {
						System.out.println("-----조립 wait()");
						lock.wait(); //대기
					}
				}
			}catch(InterruptedException e) {
				System.out.println("조립 스레드가 중단되었습니다.");
			}
		}
	}

}
