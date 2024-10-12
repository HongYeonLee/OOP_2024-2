package week5Task;

class ColorPoint2 extends Point{
	String color;
	
	public ColorPoint2() {
		super();
		color = "WHITE";
	}
	
	public ColorPoint2(int x, int y) {
		super(x, y);
		color = "WHITE";
	}
	
	public ColorPoint2(int x, int y, String color) {
		this(x, y);
		this.color = color;
		System.out.println("2번) Point 클래스를 상속받은 ColorPoint2 클래스 사용");
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
	
	double getDistance(ColorPoint2 p) {
	     int dx = getX()-p.getX();
	     int dy = getY()-p.getY();
	     return Math.sqrt((dx*dx) + (dy*dy));
	}
	
	void showDistance(ColorPoint2 p) {
		System.out.println("cp에서 임계점까지의 거리는 " + getDistance(p));
	}
}
