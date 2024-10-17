package week7;

class Circle implements Shape, Color{
	
	private int radius;
	private String color;
	
	Circle(int radius){
		this.radius = radius;
		this.color = "BLUE";
	}
	//인터페이스를 상속받으면 반드시 오버라이딩 해야 한다. 안하면 에러
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Cicle : draw() 콜 : ");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.print("Cicle : getArea() : ");
		return PI*radius*radius;
	}
	
	@Override
	public void printColor() {
		// TODO Auto-generated method stub
		System.out.println("Circle color = " + color);
	}
	
	@Override
	public void changeColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("Circle color 변경 " + color);
		
	}
	
	
}
