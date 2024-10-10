package week6;
import java.util.Scanner;

public class CoffeeVendingMachine {
	private String name;
	private IngredientBox water = new IngredientBox("[재료0] Water	");
	private IngredientBox ice = new IngredientBox("[재료1] Ice	");
	private IngredientBox coffee = new IngredientBox("[재료2] Coffee	");
	private IngredientBox icecream = new IngredientBox("[재료3] IceCream	");
	private IngredientBox milk = new IngredientBox("[재료4] SteamedMilk");
	private Scanner scanner = new Scanner(System.in);
	
	//생성자
	public CoffeeVendingMachine(String name) {
		this.name = name;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private void setIngredientSize() {
		int size;
		System.out.print("[재료0] Water의 양을 입력하세요: ");
		size = scanner.nextInt();
		water.size = size;
		
		System.out.print("[재료1] Ice의 양을 입력하세요: ");
		size = scanner.nextInt();
		ice.size = size;
		
		System.out.print("[재료2] Coffee의 양을 입력하세요: ");
		size = scanner.nextInt();
		coffee.size = size;
		
		System.out.print("[재료3] IceCream의 양을 입력하세요: ");
		size = scanner.nextInt();
		icecream.size = size;
		
		System.out.print("[재료4] SteamedMilk의 양을 입력하세요: ");
		size = scanner.nextInt();
		milk.size = size;
		
		System.out.println();
		
	}
	
	private int getMenu() {
		System.out.println("======================================");
		System.out.println("[1] 에소프레소		(에소프레소)");
		System.out.println("[2] 아메리카노		(에소프레소에 뜨거운 물을 추가한 것)");
		System.out.println("[3] 라떼			(에소프레소와 스팀 밀크)");
		System.out.println("[4] ICE아메리카노		(에소프레소에 ICE를 추가한 것)");
		System.out.println("[5] 마키아토		(에소프레소에 소량의 우유나 우유 거품)");
		System.out.println("[6] 아포카토		(에소프레소에 바닐라 아이스크림을 얹은 것)");
		System.out.println("[7] 카푸치노 		(에소프레소에 스팀밀크와 우유 거품)");
		System.out.println("[8] 종료");
		System.out.print(">>>>>>>>>>메뉴 선택 : ");

		int menu = scanner.nextInt();
		return menu;
	}
	
	private void print() {
		water.print();
		ice.print();
		coffee.print();
		icecream.print();
		milk.print();
	}
	
	public void run() {
		System.out.println("======================================");
		System.out.println("[ " + name + " (컴공과 2371049 이홍연) ]");
		System.out.println("======================================");
		setIngredientSize();
		print();
		System.out.println();
		while(true) {
			int menu = getMenu();
			switch(menu) {
				case 1: //에소프레소
					if(coffee.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						break;
					}
					coffee.consume();
					break;
				case 2: //아메리카노
					if(coffee.isEmpty() && water.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						System.out.println("Water가 부족합니다.");
						break;
					}
					else if (coffee.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						break;
					}
					else if(water.isEmpty()) {
						System.out.println("Water가 부족합니다.");
						break;
					}
					coffee.consume();
					water.consume();
					break;
				case 3: //라떼
					if(coffee.isEmpty() && milk.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						System.out.println("Milk가 부족합니다.");
						break;
					}
					else if (coffee.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						break;
					}
					else if(milk.isEmpty()) {
						System.out.println("Milk가 부족합니다.");
						break;
					}
					coffee.consume();
					milk.consume();
					break;
				case 4: //ICE 아메리카노
					if(coffee.isEmpty() && ice.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						System.out.println("ICE가 부족합니다.");
						break;
					}
					else if (coffee.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						break;
					}
					else if(ice.isEmpty()) {
						System.out.println("ICE가 부족합니다.");
						break;
					}
					coffee.consume();
					ice.consume();
					break;
				case 5: //마키아토
					if(coffee.isEmpty() && milk.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						System.out.println("Milk가 부족합니다.");
						break;
					}
					else if (coffee.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						break;
					}
					else if(milk.isEmpty()) {
						System.out.println("Milk가 부족합니다.");
						break;
					}
					coffee.consume();
					milk.consume();
					break;
				case 6: //아포카토
					if(coffee.isEmpty() && icecream.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						System.out.println("IceCream이 부족합니다.");
						break;
					}
					else if (coffee.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						break;
					}
					else if(icecream.isEmpty()) {
						System.out.println("IceCream이 부족합니다.");
						break;
					}
					coffee.consume();
					icecream.consume();
					break;
				case 7: //카푸치노
					if(coffee.isEmpty() && milk.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						System.out.println("Milk가 부족합니다.");
						break;
					}
					else if (coffee.isEmpty()) {
						System.out.println("Coffee가 부족합니다.");
						break;
					}
					else if(milk.isEmpty()) {
						System.out.println("Milk가 부족합니다.");
						break;
					}
					coffee.consume();
					milk.consume();
					break;
				case 8: //프로그램 종료
					System.out.println(name + " (컴공과 2371049 이홍연)");
					System.out.println("오늘 하루 행복하세요. 고맙습니다.^^");
					return;
				default:
					System.out.println("다시 입력하세요!");
					continue;
			}
			print();
		}
	}
	
	
}
