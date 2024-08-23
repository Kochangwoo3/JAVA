package homework;

import java.util.Scanner;

public class CalcPay {

	public static void main(String[] args) {
		/***************************************************
		 [급여 상세]
			시간 당 급여(TIME_PAY) : 10000원 , 야간 근무 시 : 시간 당 급여 * 1.5
			근무 시간을 입력 받아 급여를 출력 하시오.
		 [출력 예]
			월 총 근무 시간(workHour): 100
			주간 근무 시 '1', 야간 근무 시 '2' 입력 : 2  -> timpPayRate
			당신의 이번 달 총 급여는 1500000원 입니다.
			
			총급여(salary) = TIME_PAY * workHour * timpPayRate
		 ****************************************************/
		final int TIME_PAY = 10000;
		int workType = 1; // 근무형태
		double workHour, timePayRate, salary;
		
		Scanner in = new Scanner(System.in);
		System.out.print("월 총 근무 시간: ");
		workHour = in.nextDouble();
		System.out.print("주간 근무 시 1, 야간 근무 시 2 입력 : ");
		workType = in.nextInt(); 
		in.close();
		
		timePayRate = (workType == 1) ? 1 : 1.5;
		salary = ( TIME_PAY * timePayRate ) * workHour;  
		// 총급여 = ( 시간당급여 * 급여비율 ) * 총시간 
		
		System.out.printf("당신의 이번 달 총 급여는 %.0f원 입니다.", salary);
		

	}

}
