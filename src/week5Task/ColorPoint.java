package week5Task;

class ColorPoint extends Point{
	
	private String color;
	
	//생성자
	public ColorPoint() {
		super();
		color = "WHITE";
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		color = "WHITE";
	}
	
	public ColorPoint(int x, int y, String color) {
		this(x, y);
		this.color = color;
		System.out.println("1번) Point 클래스를 상속받은 ColorPoint 클래스 사용");
	}
	
	//getter, setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//오버라이딩
	protected void showPoint() {
		System.out.print(color + "색의 ");
		super.showPoint();
	}
	
}
