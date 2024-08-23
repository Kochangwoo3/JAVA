package ifexample;

import java.util.Scanner;

public class MultipulIf02 {

	public static void main(String[] args) {
		/*************************************************
		 두수를 입력 받아 두수중 큰수와 작은수를 출력하는 프로그램을 작성해보자
		 같은 수 입력 시 "두 수는 같습니다."라고 출력한다.
		 [출력 예]
		 두 수 입력 (공백 구분) : 3 5
		 두 수 중 큰 수는 5이며, 작은 수는 3입니다.
		 
		 두 수 입력 (공백 구분) : 3 3
		 두 수는 같습니다.
		 *************************************************/
		Scanner in = new Scanner(System.in);
		int n1, n2;
		System.out.print("두 수 입력 (공백 구분) :");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		
		if(n1 == n2) {
			System.out.println("두 수는 같습니다.");
		}else if(n1 > n2) {
			System.out.println("큰 수: " + n1 + ", 작은 수:" + n2);
		}else {
			System.out.println("큰 수: " + n2 + ", 작은 수:" + n1);
		}
	}

}
