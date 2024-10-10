package week6;

abstract class Box {
	protected int size;
	public Box() {
		this.size = 10;
	}
	
	public Box(int size) {
		this.size = size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public abstract boolean consume();
	public abstract void print();
	
}
