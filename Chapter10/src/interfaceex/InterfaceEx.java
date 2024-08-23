package interfaceex;

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
// 인터페이스 상속
interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface {
	public void play();
	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

// 상속과 함께 다중 인터페이스 구현
class SmartPhone extends PDA implements
	MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화왔어요");
	}

	@Override
	public void play() {
		System.out.println("음악 연주");
	}

	@Override
	public void stop() {
		System.out.println("음악 중단");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요");
	}
	
	// 추가 메서드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
	
}


public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}

}
