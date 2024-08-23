package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		// 인터페이스 실습
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		//System.out.println(calc.divide(num1, 0));
		calc.showInfo();
		// 인터페이스의 디폴트 메서드 + private메서드
		calc.description();
		System.out.println();
		// 인터페이스의 정적메서드 연습  + private정적메서드
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
		
		
	}

}
