package ifexample;

import java.util.Scanner;

public class SimplyIf01 {

	public static void main(String[] args) {
		/************************
		 정수 입력 받아 
		  - 양의 정수라면? 양의 정수로 출력
		  - 음의 정수라면? 양의 정수로 변환해서 양의 정수로 출력
		 ************************/
		Scanner in = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = in.nextInt();
		in.close();
		
		if(n < 0) {  // 음의 정수인 경우?
			n = n * -1;
			System.out.println("음의 정수를 양의 정수로 반환합니다.");
		}
		
		System.out.println("결과는 " + n + "입니다.");
	}

}
