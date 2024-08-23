package ploymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		// 고객 관리 프로그램 완성하기
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);      // protected  id, name 다른폴더 직접접근불가  
		customerLee.setCustomerName("이순신");  // 셋터를 public 만들어 호출
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());  // 다형성 하위 가상메서드 실행
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price); // 10000
		int kimPrice = customerKim.calcPrice(price); //  9000
		System.out.println();
		System.out.println(customerLee.getCustomerName() + " 님이" + leePrice  
				+ "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println(customerKim.getCustomerName() + " 님이" + kimPrice  
				+ "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		
	}
}
