package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		// 상속 클래스 테스트하기
		Customer customerLee = new Customer(10010, "이순신");
//		customerLee.customerID = 10010;
//		customerLee.setCustomerID(10010);      // protected  id, name 다른폴더 직접접근불가  
//		customerLee.setCustomerName("이순신");  // 셋터를 public 만들어 호출
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 1000);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		

	}
}
