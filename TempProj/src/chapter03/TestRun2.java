package chapter03;

import java.util.Scanner;

public class TestRun2 {

	public static void main(String[] args) {
	
		final int TIME_PAY = 10000;
		int workType;
		double workHour, salary, timePayRate;
				
		Scanner in = new Scanner(System.in);
			
		System.out.print("월 총 근무 시간: ");
		workHour = in.nextDouble();
		
		System.out.print("주간 근무 시 1, 야간 근무 시 2 입력: ");
		workType = in.nextInt();
		
		timePayRate = (workType == 1)? 1 : 1.5;
		
		salary = TIME_PAY * workHour * timePayRate;
		
		System.out.println("당신의 이번 달 총 급여는 " + (int)salary + "원 입니다.\n");
	}

}
