package review;

public class _04_LogicalOperator {

	public static void main(String[] args) {
		// 관계연산과 논리연산 실습
		System.out.println(3 == 2);   // 일치여부 비교연산  false

		System.out.println(!(3 == 2)); // 부정  !(false) => true
		System.out.println((3>2) && (3>4)); // ture && false => false
		// 논리곱: 두개항이 모두 true여야지만 true
		// 논리합: 두개항중 어느 하나라도 tree 가 존재하면 true
		System.out.println((3!=2) || (-1>0));   // true || false => true
		
	}

}
