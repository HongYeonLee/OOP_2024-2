package 기말;

import java.util.HashMap;
import java.util.Map;

class CarFactory {
	private final HashMap<String, Integer> inventory = new HashMap<>();
	private final Object lock = new Object();
	int carCnt;
	
	public CarFactory() {
		//초기 부품 재고 설정
		inventory.put("Wheel", 0);
		inventory.put("Door", 0);
		inventory.put("Body", 0);
		carCnt = 0;
	}
	
	//부품 생산
	public void produce(String partName, int count) {
		synchronized(lock) {
			inventory.put(partName, inventory.get(partName) + count);
			System.out.println(partName + "생산 완료 (" + inventory.get(partName) + "개)");
			System.out.println("현재 재고 : " + inventory);
			System.out.println("----생산 notifyAll()");
			lock.notifyAll(); //조립 스레드에 알림
		}
	}
	
	public void assembleCar() {
		synchronized(lock) {
			try {
				while(true) {
					if(inventory.get("Wheel") >= 4 && inventory.get("Door") >= 3 && inventory.get("Body") >= 1) {
						inventory.put("Wheel", inventory.get("Wheel") - 4);
						inventory.put("Door", inventory.get("Door") - 3);
						inventory.put("Body", inventory.get("Body") - 1);
						carCnt++;
						System.out.println("🚗 Car assembled! "+ carCnt + "대 " + " 현재 재고: " + inventory);
						
					}
					else {
						lock.wait();
						System.out.println("------조립 wait()");
					}
				}
			}catch(InterruptedException e) {
				System.out.println("조립 스레드가 중단되었습니다.");
			}
		}
	}
}
