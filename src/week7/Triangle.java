package week7;

class Triangle implements Shape, Color{
	private int width, height; //가로와 세로
	private String color;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.color = "BLUE";
	}
	
	@Override
	public void printColor() {
		// TODO Auto-generated method stub
		System.out.println("Triangle color = " + color);
	}

	@Override
	public void changeColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("Triangle color 변경 " + color);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle : draw() 콜 : ");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.print("Triangle : getArea() : ");
		return width*height*0.5;
	}

}
