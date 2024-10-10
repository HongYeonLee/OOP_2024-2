package week6;

class IngredientBox extends Box{
	private String name;
	
	//생성자
	public IngredientBox(int size) {
		super(size);
	}
	
	public IngredientBox(String name) {
		this.name = name;
	}
	
	public IngredientBox(String name, int size) {
		super(size);
		this.name = name;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.print(name + "	["+size+"] ");
		for(int i = 0; i < size; i++) {
			System.out.print("#|");
		}
		System.out.println();
	}
	
	public boolean consume() {
		if(size == 0) {
			return false;
		}
		size--;
		return true;
	}
	
	
}
