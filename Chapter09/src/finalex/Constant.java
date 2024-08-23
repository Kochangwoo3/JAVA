package finalex;

public class Constant {
	// 멤버변수
	int num = 10;
	final int NUM = 100;  // 상수선언
	
	public static void main(String[] args) {
		final int NUM1;  // 상수 선언 및 초기화
		NUM1 = 200; // 가능
		//NUM1 = 300; // 오류
		
		// final 실습
		Constant constant = new Constant();
		constant.num = 50;
		//constant.NUM = 200;  // 오류
		
	}

}
