package classpart.classdivide;

import java.util.Scanner;

import classpart.classdivide.sub.Getsum;

public class _02_Parameter {
	
	
	public static int turn = 0;  //  클래스 정적변수 
	
// 원본소스 메서드	
//	public static void add(int n1, int n2) {
//		turn++;
//		System.out.println("두 수의 합은 " + (n1 + n2) + "입니다.");
//	}

	public static void main(String[] args) {
		// 파라미터 있는 메서드
//		String str = "hello";
//		System.out.println(str.substring(0, 3));
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		int n1, n2;
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
// 원본 메서드 호출		
//		add(n1, n2);
		
		Getsum gtSum  = new Getsum();
		int sum = gtSum.add(n1, n2);  //클래스 메서드 호출
		
		System.out.println("두 수의 합은 " + sum + "입니다. turn: " + turn);
	}

}
