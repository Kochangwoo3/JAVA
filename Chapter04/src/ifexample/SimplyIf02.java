package ifexample;

import java.util.Scanner;

public class SimplyIf02 {

	public static void main(String[] args) {
		// 기본 입장료는 2000원
		// 나이를 입력 받아 60세 이상인 경우는 입장료는 0원 입니다.
		int fee = 2000; // 입장료
		Scanner in = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = in.nextInt();
		in.close();
		
		// 조건에 따라 수행하는 명령문 : 명령문 한줄이면 중괄호는 생략 가능하다.
		if(age >= 60) {
			fee = 0;
		}		
		System.out.println("입장료는 " + fee + "원 입니다.");

	}

}
