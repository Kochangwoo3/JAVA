package homework;

public class Product {
	// static 변수는 인스턴스 생성과 상관없이 먼저 생성됨
	// 클래스 메서드: 인스턴스 생성과 상관없이 먼저 생성됨
	private static int serialNum = 1200;  // 클래스변수
	private static int madeCnt = 0;
	// 멤버변수 = 인스턴스변수
	private int productID;
	private String productName;
	private String maker;
	private int price;
	
	
	// static 메서드  = 클래스 메서드
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Product.serialNum = serialNum;
	}	
	
	public Product(String productName, String maker, int price) {
		//제품이 생성될 때마다 일련번호 증가
		serialNum = serialNum + 1; // serialNum++;
		madeCnt++;
		productID = serialNum; // 증가된 값을 제품아이디 인스턴스변수에 대입
		this.productName = productName;
		this.maker = maker;
		this.price = price;
	}
	
	public void showProductInfo() {
		System.out.println(productID+".\t" + productName+ "\t" + maker +"\t" + price +"원");
	}
	

	public static int getMadeCnt() {
		return madeCnt;
	}

	public static void setMadeCnt(int madeCnt) {
		Product.madeCnt = madeCnt;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
