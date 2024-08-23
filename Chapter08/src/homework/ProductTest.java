package homework;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
//		// Product 클래스 생성 테스트
//		Product product1 = new Product("새우깡", "농심(주)", 1900);
//		Product product2 = new Product("빼빼로", "롯데제과", 2200);
//		Product product3 = new Product("먹태깡", "농심(주)", 2500);
//		
//		System.out.println("[출고 리스트]");
//		product1.showProductInfo();
//		product2.showProductInfo();
//		product3.showProductInfo();
//		System.out.println("------------------------------------");
//		System.out.println(Product.madeCnt + "건");

		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("새우깡", "농심(주)", 1900));
		list.add(new Product("빼빼로", "롯데제과", 2200));
		list.add(new Product("먹태깡", "농심(주)", 2500));
		
		System.out.println("[출고 리스트]");
		for(Product p: list ) {
			p.showProductInfo();
		}
		System.out.println("------------------------------------");
		System.out.println(Product.getMadeCnt() + "건");
	}

}
