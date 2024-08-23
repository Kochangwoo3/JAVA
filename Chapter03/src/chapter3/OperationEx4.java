package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		// 조건 연산자 실습
		int motherAge = 47;
		int fatherAge = 45;
		
		int diff;
		diff = (fatherAge > motherAge) ? (fatherAge - motherAge) : (motherAge - fatherAge);
		
		System.out.println("나이차: " + diff);
		
		int num = 9;
		boolean  isEven;
		
		isEven = (num % 2) == 0 ? true : false;
		
		System.out.println(isEven);
		
		
		boolean myB = false;
		int myInt = Boolean.compare(myB, false);  // 다르면 1, 같으면 0
		System.out.println(myInt);
		
		
		boolean myBoolean = false;
		myInt = (myBoolean) ? 1 : 0;
		System.out.println(myInt); // 1 출력

	}

}
