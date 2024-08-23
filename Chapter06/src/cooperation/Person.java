package cooperation;

public class Person {
	// 멤버 변수`
	String name;
	int money;
	// 생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	// 메서드
	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		String msg = starCoffee.brewing(money);
		if(msg != null) {
			System.out.println( name + "님이 " + money + "원을 내고 " + msg);
		}
	}
	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		
		// BeanCoffee beanCoffee = new BeanCoffee();
		// A a  = new A();
		
		String msg = beanCoffee.brewing(money);
		// 이씨는 콩다방에서 4,500원을 내고 라떼를 사 마셨습니다.
		System.out.println( name + "님이 콩다방에서 " + money + "원을 내고 " + msg);
	}

}
