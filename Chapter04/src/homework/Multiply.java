package homework;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		/*
◈ 2**의배수이면서, 3의배수에도 해당** => [ ]은(는) 2의 배수 이면서, 3의 배수 입니다.
◈ 2**의배수에만 해당** => [ ]은(는) 2의 배수 입니다.

◈ 3**의배수에만 해당** => [ ]은(는) 3의 배수 입니다.
◈ 2**의배수도 3의배수도 해당안됨** => [ ]은(는) 2의 배수도 3의 배수도 아닙니다.
		 */
		int num;
		System.out.print("정수 입력: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		
//		if(num%2 == 0) {
//			if(num%3 == 0) {
//				System.out.printf("%d은(는) 2의 배수 이면서, 3의 배수 입니다.", num);
//			}else {
//				System.out.printf("%d은(는) 2의 배수 입니다.", num);
//			}
//		}else {
//			if(num%3 == 0) {
//				System.out.printf("%d은(는) 3의 배수 입니다.", num);
//			}else {
//				System.out.printf("%d은(는) 2의 배수도 3의 배수도 아닙니다.", num);
//			}
//		}
		
		if(num%2 == 0 && num%3 == 0) {
			System.out.printf("%d은(는) 2의 배수 이면서, 3의 배수 입니다.", num);
		}else if(num%2 == 0) {
			System.out.printf("%d은(는) 2의 배수 입니다.", num);
		}else if(num%3 == 0) {
			System.out.printf("%d은(는) 3의 배수 입니다.", num);
		}else {
			System.out.printf("%d은(는) 2의 배수도 3의 배수도 아닙니다.", num);
		}


	}

}
