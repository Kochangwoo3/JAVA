package exercise;

import java.util.HashMap;

class Car {
	// 자동차 이름 멤버변수 하나
	String name;
	// 생성자
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}


// Q6
public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();  // 싱글톤
		// Car car = new Car();
		Car sonata1 = factory.createCar("연수차");  
		// new Car()  HashMap<String, Car>     
		//     containsKey("연수차") : 존재하면   get("연수차")   없다면 put("연수차" , new Car()  )
		Car sonata2 = factory.createCar("연수차");
		System.out.println(sonata1 == sonata2);  // true
		// 해시맵에 키값이 "연수차" 키값으로 value에 인스턴스 저장
		
		Car avante1 = factory.createCar("승연차");
		Car avante2 = factory.createCar("승연차");
		System.out.println(avante1 == avante2); // true
		
		System.out.println(sonata1 == avante1); // false

	}

}
