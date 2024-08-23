package exercise;

import java.util.HashMap;

public class CarFactory {
	// 정적변수
	private static CarFactory instance = new CarFactory();
	HashMap<String, Car> carMap = new HashMap<>();
	
	// 생성자
	private CarFactory() {}
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	// 메서드
	public Car createCar(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}
		
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}

}
