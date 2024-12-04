package week10;
import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

import week9.FileReaderNotBufEx;
import week9.FileWriterNotBufEx;

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
			System.out.println("6. File Write (문자 스트림)");
			System.out.println("7. File Read (문자 스트림");
			System.out.println("8. Search Pizza (피자 정보로 검색)");
			System.out.println("9. Exit");
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
						fileWrite();
						break;
					case 7:
						fileRead();
						break;
					case 8:
						searchPizza();
						break;
					case 9:
						System.out.println(user);
						System.out.println("24년 이화 정원 마음껏 누리세요^^");
						return;
					default:
						System.out.println("다시 입력하세요!"); 
						continue;
				}
				
			}		
		}
		
		private void fileWrite() {
			// TODO Auto-generated method stub
			FileWriterClass ewha1 = new FileWriterClass();
			String info = "";
			for (int i = 0; i < pizzaVector.size(); i++) {
				info += pizzaVector.get(i).getName() + "," + pizzaVector.get(i).getCalories() + "," + pizzaVector.get(i).getToppings() + "\n";
				
			}
			ewha1.writer(info);
		}
		
		private void fileRead() {
			// TODO Auto-generated method stub
			FileReadClass ewha2 = new FileReadClass();
			Vector<String> v = ewha2.reader();
			for (int i = 0; i < v.size(); i+=3) {
				String name = v.get(i);
				int calories = Integer.parseInt(v.get(i + 1));
				String toppings = v.get(i+2);
				
				Pizza pizza = new Pizza(name, calories, toppings);
	            pizzaVector.add(pizza);
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
			if (index >= 0 && index < pizzaVector.size()) {
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
			else {
				System.out.println("잘못된 index 입니다");
			}
;
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
		
		private void searchPizza() {
			//벡터와 이터레이터 연결
			Iterator<Pizza> it = pizzaVector.iterator();
			String name;
			int cal;
			System.out.print("1. 피자  2. 칼로리  3. 토핑 : ");
			int num = key.nextInt();
			key.nextLine();
			
			switch(num) {
			case 1:
				System.out.print("검색할 피자 이름: ");
				name = key.nextLine();
				
				while (it.hasNext()) {
					Pizza ahn = it.next();
					if(ahn.getName().equals(name)) {
						System.out.println(ahn.getPizzaInfo());
					}
				}
				
				break;
			case 2:
				System.out.println("검색할 칼로리 : ");
				cal = key.nextInt();
				while(it.hasNext()) {
					Pizza ahn = it.next();
					if(ahn.getCalories() == cal) {
						System.out.println(ahn.getPizzaInfo());
						break;
					}
				}
				break;
			case 3:
				System.out.print("검색할 토핑 이름: ");
				name = key.nextLine();
				
				while (it.hasNext()) {
					Pizza ahn = it.next();
					if(ahn.getToppings().equals(name)) {
						System.out.println(ahn.getPizzaInfo());
						break;
					}
				}
				break;
			}
		}
		
		
}