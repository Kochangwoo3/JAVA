package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		// 증가,감소 연산자
		int gameScore = 150;
		int level = 10000;
		
		int lastScore1 = ++gameScore; 
		// gameScore = gameScore + 1;
		// lastScore1 = gameScore;
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
//		int lastLevel = level++;
//		// lastLevel = level; // 10000
//		// level  = level + 1 // 10001
		
		int lastLevel = --level;
		// level  = level - 1 //  9999
		// lastLevel = level; //  9999			
		
		System.out.println(lastLevel);
		System.out.println(level);
		
		// 관계 연산자 (비교연산자 실습)
		System.out.println("관계 연산자 (비교연산자 실습)");
		int fatherAge = 45;
		int motherAge = 47;
		boolean value;
		value = fatherAge != motherAge;
		
		System.out.println(value);  // true / false
		
		// 논리 연산자 실습	
		System.out.println("논리 연산자 실습");
		int num1 = 10;
		int num2 = 20;
		boolean flag = (num1 > 0) && (num2 > 0); // T && T   flag 는 참
		System.out.println(flag); // true
		
		flag = (num1 < 0) && (num2 > 0);  // F && T   flag 거짓  : 논리곱은 둘다 T 일때만 참
		System.out.println(flag); // false
		
		flag = (num1 < 0) || (num2 > 0);  // false || true : 논리합은 둘중 하나만이라도 T 면 T
		System.out.println(flag); // true
		
		flag = !(num1 > 0);  // !true
		System.out.println(flag);  //false
		
	
	}

}
