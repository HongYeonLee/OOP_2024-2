package week10;
import java.util.Scanner;
import java.util.Vector;

class Menu {
		Scanner key;
	
		private Vector<Pizza> pizzaVector = new Vector<>();
		
		private int getMenu() {
			key = new Scanner(System.in);
			System.out.println("\n--- Pizza Menu ---");		
			System.out.println("1. Add (피자를 추가)");
			System.out.println("2. View (특정 인덱스의 피자를 조회)");
			System.out.println("3. Modify (특정 인덱스의 피자를 수정)");
			System.out.println("4. Delete (특정 인덱스의 피자를 삭제)");
			System.out.println("5. List All (모든 피자를 출력)");
			System.out.println("6. Exit");
			System.out.println();
			System.out.print("Choose an option : ");	
			int menu = key.nextInt();
			return menu;
		}
		
	
		public void run(String user) {
			System.out.println("=========================================");	
			System.out.println("[ " + user + " ]");
			System.out.println("=========================================");	
		
			while(true) {
				int choice = getMenu();
				
				switch(choice) {
					case 1 :
						addPizza(key);
					    break;
					case 2 :
						viewPizza(key);
					    break;
					case 3 :
						modifyPizza(key);
					    break;				
					case 4 :
						deletePizza(key);
						break;
					case 5:
						listAllPizza(key);
						break;
					case 6:
						System.out.println(user);
						System.out.println("24년 이화 정원 마음껏 누리세요^^");
						return;
					default:
						System.out.println("다시 입력하세요!"); 
						continue;
				}
				
			}		
		}
		
		private void addPizza(Scanner key) {
			// TODO Auto-generated method stub
			System.out.print("피자 이름: ");
			key.nextLine(); //엔터먹어가기
			String name = key.nextLine();
			System.out.print("칼로리: ");
			int calories = key.nextInt();
			key.nextLine(); //엔터먹어가기
			System.out.print("토핑: ");
			String toppings = key.nextLine();
				
			Pizza pizza = new Pizza(name, calories, toppings);
			pizzaVector.add(pizza);
			System.out.println("Pizza 추가: " + pizza.getPizzaInfo());
		}
		
		private void viewPizza(Scanner key) {
			// TODO Auto-generated method stub
			System.out.print("index: ");
			int index = key.nextInt();
			
			if (index >= 0 && index < pizzaVector.size()) {
				Pizza pizza = pizzaVector.get(index);
				System.out.println("Pizza 정보: " + pizza.getPizzaInfo());
			}
			else {
				System.out.println("잘못된 index 입니다");
			}
			
		}
		
		private void modifyPizza(Scanner key) {
			// TODO Auto-generated method stub
			System.out.print("수정할 index: ");
			int index = key.nextInt();
			key.nextLine(); //엔터먹어가기
			Pizza p = pizzaVector.get(index);
			System.out.print("new name (현재: " + p.getName() +"): ");
			String name = key.nextLine();
			System.out.print("new calories (현재: " + p.getCalories() + "): ");
			int calories = key.nextInt();
			key.nextLine(); //엔터 먹어가기
			System.out.print("new toppings (현재: " + p.getToppings() + "): ");
			String toppings = key.nextLine();
			
			p.setName(name);
			p.setCalories(calories);
			p.setTopping(toppings);
			System.out.println("Pizza 수정: " + p.getPizzaInfo());
		}
		
		private void deletePizza(Scanner key) {
			// TODO Auto-generated method stub
			System.out.print("삭제할 index: ");
			int index = key.nextInt();
			key.nextLine(); //엔터 먹어가기
			
			if(index >= 0 && index < pizzaVector.size()) {
				Pizza p = pizzaVector.remove(index);
				System.out.println("Pizza 삭제: " + p.getPizzaInfo());
			}
			else {
				System.out.println("잘못된 index 입니다");
			}
			
		}

		private void listAllPizza(Scanner key) {
			// TODO Auto-generated method stub
			System.out.println("피자 전체 리스트:");
			for (int i = 0; i < pizzaVector.size(); i++) {
				System.out.println(i + ": " + pizzaVector.get(i).getPizzaInfo());
			}
			
		}
}