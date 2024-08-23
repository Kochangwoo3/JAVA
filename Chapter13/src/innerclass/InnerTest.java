package innerclass;

class OutClass {   // 외부 클래스
	private int num = 10;         // 외부부클래스 인스턴스변수
	private static int sNum = 20; // 외부클래스의 정적변수  = static 변수
	
	InClass inClass;  // 인스턴스변수
	
	public OutClass() {
		inClass = new InClass(); // 단 외부클래스 생성된 후 내부 클래스 생성가능
	}
	
	static class InStaticClass {  // 정적 내부 클래스
		int inNum = 100;          // 인스턴스변수
		static int sInNum = 200;  // 정적변수
		void inTest() {   // 정적 내부 클래스의 일반메서드
			//System.out.println("OutClass num = " + num + "(외부클래스 인스턴스 변수)");  외부클래스 인스턴스 변수 사용불가
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)");
			System.out.println("InStaticClass inNum = " + inNum + "(정적내부클래스의 인스턴스 변수)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(정적내부클래스의 정적 변수)");
		}
		static void sTest() {
//			num += 10;
//			inNum += 10;   // 외부 클래스와 정적내부 클래스의 인스턴스변수는 사용할수 없음
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(정적내부클래스의 정적 변수)");
		}
	}
	
	
	class InClass {  // 인스턴스 내부 클래스
		int inNum = 100;  // 내부클래스의 인스턴스 변수
		static int sInNum = 200;  // 인스턴스 내부클래스에서 정적변수 jdk17 가능 
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부클래스 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)");
		}
		static void sTest() { // 인스턴스 내부클래스에서 정적메서드 jdk17 가능
			
		}
	}
	
	// Outer 클래스 메서드
	public void usingClass() {
		inClass.inTest();
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		// 내부 클래스 테스트
		OutClass  outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		
		System.out.println(outClass.inClass.inNum);
		
//		OutClass outClass = new OutClass();
//		OutClass.InClass inClass = outClass.new InClass();
//		
//		inClass.inTest();
		
	}

}
