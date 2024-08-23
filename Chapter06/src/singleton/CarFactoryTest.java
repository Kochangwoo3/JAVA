package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// 싱글톤 패턴으로 클래스 구현 연습
		// 이공장클래스에서 자동차가 생성될때마다 10001 에서 증가 
		// 10002, 10003 자동차번호가 붙도록 자동차클래스를 생성해보세요
		CarFactory factory = CarFactory.getInstance(); // 싱글톤 메서드
		Car mySonata = factory.createCar();   // 메서드에서 Car 생성
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());  // 10001 출력
		System.out.println(yourSonata.getCarNum());  // 10002 출력

	}

}
