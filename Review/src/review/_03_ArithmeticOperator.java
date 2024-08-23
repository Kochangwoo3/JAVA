package review;

import java.util.Scanner;

public class _03_ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초단위의 정수를 입력하세요:");
		int inValue = sc.nextInt();
		int hour = (inValue/60)/60;  // 5000 / 5000
		int minute = (inValue / 60) % 60;  // (5000 / 60)= 83 % 60 = 23분
		int second = inValue % 60; // 20 초
		
		
		System.out.print(inValue + "초는 ");
		System.out.print(hour + " 시간, ");
		System.out.print(minute + " 분, ");
		System.out.print(second + "초입니다.");
				
		sc.close();

	}

}
