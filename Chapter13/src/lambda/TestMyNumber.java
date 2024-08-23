package lambda;

import java.util.function.BinaryOperator;

public class TestMyNumber {

	public static void main(String[] args) {
		
//		MyNumber max1 = new MyNumber() {
//			@Override
//			public int getMax(int num1, int num2) {
//				return (num1 >= num2) ? num1 : num2;
//			}
//		};
//		System.out.println(max1.getMax(10, 20));
		
//		BinaryOperator max1 = new BinaryOperator<T>() {
//		};
		
//		MyNumber max1 = new MyNumber() {
//			
//			@Override
//			public int getMax(int num1, int num2) {
//				// TODO Auto-generated method stub
//				return (num1 >= num2) ? num1 : num2;
//			}
//		};
//		
		// 람다식 구현과 호출
		MyNumber max = (num1, num2) -> (num1 >= num2) ? num1 : num2;
		//BinaryOperator acc =  (num1, num2) -> (num1 >= num2) ? num1 : num2;
		
		
		
		System.out.println(max.getMax(10, 20));

	}

}
