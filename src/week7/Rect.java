package week7;

class Rect implements Shape, Color{
	private int width, height; //가로와 세로
	private String color;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
		this.color = "BLUE";
	}

	@Override
	public void printColor() {
		// TODO Auto-generated method stub
		System.out.println("Rect color = " + color);
	}

	@Override
	public void changeColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("Rect color 변경 " + color);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//System.out.print("Rect : draw() : " + width + "x" + height + " 크기의 사각형");
		System.out.println("Rect : draw() 콜 : ");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.print("Rect : getArea() : ");
		return width*height;
	}
}
