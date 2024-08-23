package homework;

public class SalaryCalc {

	public static void main(String[] args) {
		// 1번
		/*
			홍길동군은 한 달에 기본급 150만원과 보너스 70만원을 받는다.
			세금은 기본급의 10% 이며, 실 급여액은 전체 급여에서 세금을 뺀 금액을
			은행 계좌로 입금 받는다.
			이때, A군의 통장으로 매월 입금되는 실 급여액을 구하는 프로그램을 작성해보자.
		 */
		int salary = 1500000; 
		int bonus = 700000;
		double realMoney;
		
		realMoney = ( salary * 0.9 ) + bonus; // 기본급
		
//		System.out.println("홍길동군의 실급여액은 " + real_money + "원 입니다.");
		System.out.printf("홍길동군의 실급여액은 %.0f원 입니다.", realMoney);
		
	}

}
