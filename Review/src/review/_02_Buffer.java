package review;

import java.util.Scanner;

public class _02_Buffer {

	public static void main(String[] args) {
		// 입력을 여러 번 받을 때 입력을 받지 못하는 상황
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력(공백구분) : ");
		int n = sc.nextInt();
		//String str = in.next();
		sc.nextLine();  // 입력 버퍼에 남아있는 엔터를 가져오는 작업 -  중요
		
		System.out.println("하위메뉴보고 문자열 입력 : ");
		String str = sc.nextLine();
		
		sc.close();
		System.out.printf("입력받은 정수는 %d이며, 문자열은 %s입니다.\n", n, str);
	}

}
