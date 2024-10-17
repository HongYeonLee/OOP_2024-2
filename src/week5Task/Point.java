package week5Task;

class Point {
	private int x, y;
	
	//생성자
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//getter, setter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	protected void showPoint() {
		System.out.println("(" + x + "," + y + ")의 점입니다.");
	}
}
