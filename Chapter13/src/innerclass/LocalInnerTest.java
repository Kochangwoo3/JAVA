package innerclass;

class Outer {
	// 멤버변수
	int outNum = 100;
	// 정적변수
	static int sNum = 200;
	
	// 메서드
	public Runnable getRunnable(int i) {
		int num = 100;  // 지역변수는 메서드 호출 시 스택에 생성
		
		return new Runnable() {   // 익명 내부 클래스   
			int localNum = 10;
			@Override
			public void run() {
				// 메서드 지역변수는 클래스에 사용되면 상수로 변함 => 값 변경 불가
				//num = 200; 
				//i = 100;
				System.out.println("i = " + i);  //5
				System.out.println("num = " + num);  //100
				System.out.println("localNum = " + localNum);  //10
				System.out.println("outNum = " + outNum + " (외부클래스 인스턴스 변수)");  // 100
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부클래스 정적 변수)"); //200
			}

		};
		
		
//		class MyRunnable implements Runnable {  // 지역 내부 클래스
//			// 멤버변수
//			int localNum = 10;
//			// 메서드
//			@Override
//			public void run() {
//				// 메서드 지역변수는 클래스에 사용되면 상수로 변함 => 값 변경 불가
//				// num = 200; 
//				// i = 100;
//				System.out.println("i = " + i);  //5
//				System.out.println("num = " + num);  //100
//				System.out.println("localNum = " + localNum);  //10
//				System.out.println("outNum = " + outNum + " (외부클래스 인스턴스 변수)");  // 100
//				System.out.println("Outer.sNum = " + Outer.sNum + "(외부클래스 정적 변수)"); //200
//			}
//			
//		}
//		
//		return new MyRunnable();
		
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// 지역내부 클래스
		Outer out = new Outer();
		Runnable runner = out.getRunnable(5);
		runner.run();
	}

}
