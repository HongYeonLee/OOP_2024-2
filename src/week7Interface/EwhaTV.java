package week7Interface;

class EwhaTV implements TV{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켰다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끈다");
		
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("TV의 볼륨을 " + volume + "로 조절한다");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("TV의 채널을 " + channel + "로 변경한다");
	}

}
