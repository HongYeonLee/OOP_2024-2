package week7;

//5장 상속, 실습문제 15번
interface Shape {
	//인터페이스 멤버 메소드, 상수
	
	static final double PI = 3.14; //상수
	
	//메소드는 반드시 public으로 써야함
	public abstract void draw(); //도형을 그리는 추상 메소드, 상속받으면 구현 필요
	public abstract double getArea(); //도형의 면적을 리턴하는 추상메소드, 상속받으면 구현 필요
	
	//응집성 - abstract 클래스를 상속하면 반드시 상위 클래스와 하위 클래스는 같은 패키지내에 있어야 한다.
	//그러나 인터페이스는 public으로만 선언하므로 위치가 어디든 상속받으면 사용 가능
	
	public default void shapeRedraw() { //디폴트 메소드
		System.out.println("--inferface Shape shapeRedraw(): 다시 그립니다");
		System.out.print("--inferface Shape draw(): 콜 ");
		draw(); //하위 클래스에서 오버라이딩된게 호출됨
		
	}

//0.인터페이스를 Reuse할 때는 반드시 추상메소드를 오버라이딩 해야 한다. 하지 않으면 에러
//1.인터페이스는 멤버가 메소드 (추상메소드, 디폴트 메소드)
//2. 오브젝트 생성 불가
//3. 인터페이스는 Reuse
//	클래스	implements		인터페이스1, 인터페이스2, 인터페이스3
//	인터페이스	extends			인터페이스1, 인터페이스2, 인터페이스3
//	클래스 	extends			클래스
// 	인터페이스					클래스 (error)
//	클래스	extends			클래스 implements	인터페이스1, 인터페이스2, 인터페이스3
}
