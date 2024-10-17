package week7;

import java.util.Scanner;

class Paint {
	Scanner key = new Scanner(System.in);
	
	private int getMenu() {
		System.out.println("====================================");
		System.out.println("     interface Shape 실습 메뉴");
		System.out.println("====================================");
		System.out.println("[1] Shape");
		System.out.println("[2] Circle");
		System.out.println("[3] Oval");
		System.out.println("[4] Rect");
		System.out.println("[5] Triangle");
		System.out.println("[6] 종료");
		System.out.print(">>>>>>>>>>>>>메뉴 선택: ");
		
		int menu = key.nextInt();
		return menu;
	}
	
	void run() {
		
		while(true) {
			int menu = getMenu();
			switch(menu) {
			case 1:
				Shape pizza = new Circle(5);
				pizza.shapeRedraw();
				System.out.println("pizza의 면적은 " + pizza.getArea());
				pizza.draw();
				Circle pizza2 = (Circle) pizza;
				pizza2.changeColor("RED");
				pizza2.printColor();
				break; 
			case 2:
				Circle colock = new Circle(5);
				colock.shapeRedraw();
				System.out.println("colock의 면적은 " + colock.getArea());
				colock.draw();
				colock.changeColor("RED");
				colock.printColor();
				break;
			case 3:
				Oval dish = new Oval(3, 5);
				dish.shapeRedraw();
				System.out.println("dish의 면적은 " + dish.getArea());
				dish.draw();
				dish.changeColor("RED");
				dish.printColor();
				break;
			case 4:
				Rect monitor = new Rect(3, 5);
				monitor.shapeRedraw();
				System.out.println("monitor의 면적은 " + monitor.getArea());
				monitor.draw();
				monitor.changeColor("RED");
				monitor.printColor();
				break;
			case 5:
				Triangle cheese = new Triangle(3, 5);
				cheese.shapeRedraw();
				System.out.println("cheese의 면적은 " + cheese.getArea());
				cheese.draw();
				cheese.changeColor("RED");
				cheese.printColor();
				break;
			case 6:
				System.out.println("Interface 프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력했습니다! 다시 입력하세요");
				continue;
			}
		}
	}
}
