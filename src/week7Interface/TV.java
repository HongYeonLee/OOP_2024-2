package week7Interface;

interface TV {
	//멤버 : 메소드, 상수
	public static final int MAX_VOLUME = 10; //변경 불가
	public static final int MIN_VOLUME = 10;
	
	public abstract void turnOn(); //추상 메소드
	public abstract void turnOff();
	public abstract void changeVolume(int volume);
	public abstract void changeChannel(int volume);
}
