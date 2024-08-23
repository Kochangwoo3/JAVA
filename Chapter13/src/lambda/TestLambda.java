package lambda;

@FunctionalInterface
interface PrintString {
	void showString(String str);
}


public class TestLambda {

	public static void main(String[] args) {
		// 매개변수로 전달하는 람다식
		PrintString lambdaStr = str -> System.out.println(str);  //1. 람다식을 변수에 대입
//		PrintString lambdaStr_ = new PrintString() {
//			@Override
//			public void showString(String str) {
//				 System.out.println(str);
//			}
//		};
		
		lambdaStr.showString("hello lambda local Variable");
		
		showMyString(lambdaStr);                                // 2. 메서드 매개변수로 전달
	
		PrintString reStr = returnString();
		reStr.showString("hello ");
	}
	
	public static void showMyString(PrintString p) {
		// PrintString p1 = str -> System.out.println(str);
		
		p.showString("hello lambda parameter");
	}
	
	public static PrintString returnString() {
		return s-> System.out.println(s + "world return lambda");             // 3. 반환 값으로 사용 가능
	}

}
