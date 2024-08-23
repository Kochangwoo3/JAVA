package template;

public abstract class Car {
	// 구현부 {} 없는 추상메서드
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void washCar() {};
	public void startCar() {
		String str;
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	// 템플릿 메서드
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
