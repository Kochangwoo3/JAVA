package chapter10;

interface PhoneInterface {
	int TIMEOUT = 10000;  // public static final 생략  -> 상수
	//추상메서드
	void sendCall();
	void receiveCall();
	//default메서드
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	// 메소드 추가
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}


public class InterfaceEx {

	public static void main(String[] args) {
		// 인터페이스 구현 테스트
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
