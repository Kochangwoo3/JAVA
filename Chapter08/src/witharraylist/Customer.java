package witharraylist;

public class Customer {
	// 멤버변수
	protected int customerID; 		// 고객 아이디
	protected String customerName; 	// 고객 이름
	protected String customerGrade;	// 고객 등급
	int bonusPoint; 	// 보너스 포인트
	double bonusRatio;	// 적립 비율
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	
	// 메서드
	// 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);  // 보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade +
				"이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerName() {
		return customerName;
	}
	
	
}
