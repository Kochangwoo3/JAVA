package Q5;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
	
		for(Car car : carList) {
			car.run(); //템플릿메서드 start(); drive(); stop(); turnOff();
			System.out.println("==================");
		}

	}

}
