package ifexample;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		// 정수 입력 받아 짝수/홀수를 판별하는 코드를 작성하시오
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("정수 입력:");
		num = in.nextInt();
		in.close();
		
		if(num % 2 == 0) {
			System.out.println(num + "은(는) 짝수 입니다.");
		}else {
			System.out.println(num + "은(는) 홀수 입니다.");
		}

	}

}
