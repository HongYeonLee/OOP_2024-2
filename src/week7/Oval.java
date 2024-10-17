package week7;

class Oval implements Shape, Color{
	private int width, height; //가로와 세로
	private String color;
	
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
		this.color = "BULE";
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//System.out.print("Oval : " + width + "x" + height + "에 내접하는 타원");
		System.out.println("Oval : draw() 콜 : ");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.print("Oval : getArea() : ");
		return PI*width*height;
	}

	@Override
	public void printColor() {
		// TODO Auto-generated method stub
		System.out.println("Oval color = " + color);
	}

	@Override
	public void changeColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("Oval color 변경 " + color);
	}

}
