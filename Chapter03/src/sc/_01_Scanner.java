package sc;

import java.util.Scanner;

public class _01_Scanner {

	public static void main(String[] args) {
		int n;
		System.out.print("정수 입력:");
		Scanner in = new Scanner(System.in); //Ctrl + Shift + o
		// n = 10, n = 150;
		n = in.nextInt();
		
		in.close();  // 입력 끝
		System.out.println("입력 받은 정수는 " + n + "입니다.");

	}

}
