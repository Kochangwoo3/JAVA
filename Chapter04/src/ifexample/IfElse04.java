package ifexample;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
		// 두개의 정수를 입력받아 나눗셈의 몫과 나머지를 출력하는 프로그램을 작성해보자
		// 나누는 수(제수)가 0인 경우 "0으로 나눌 수 없습니다." 라고 메시지를 출력한다.
		// [출력 예]
		// 2개의 정수 입력 : 3 0
		// 0으로 나눌 수 없습니다
		Scanner in = new Scanner(System.in);
		int n1, n2;
		System.out.print("공백 구분 연속으로 두 수 입력: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		 
		if(n2 != 0) {
			System.out.println("몫: " + (n1 / n2) + ", 나머지: " + (n1 % n2));
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
