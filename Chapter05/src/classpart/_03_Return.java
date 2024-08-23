package classpart;

import java.util.Scanner;

public class _03_Return {
	
	public static int getSum(int x, int y) {
//		System.out.println("두 수의 합은 " + (x + y) + "입니다.");
		return (x + y);
	}

	public static void main(String[] args) {
		// 파라미터 있는 메서드
		Scanner in = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		int n1, n2;
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		
		double result = getSum(n1, n2) * 1234 / 3.14;
		System.out.println("result = " + result);
		System.out.println("입력한 두 수의 합은 " + getSum(n1, n2) + "입니다.");

	}

}
