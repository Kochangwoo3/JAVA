package inheritance;

public class CustomerTest3 {
	public static void main(String[] args) {
		// 상속 클래스 생성되는 과정

		Customer customerKim = new VIPCustomer(10020, "김유신", 1234);
//		customerKim.setCustomerID(10020);
//		customerKim.setCustomerName("김유신");

		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	
	}
}
