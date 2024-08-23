package ifexample;

import java.util.Scanner;

public class IfElse05 {

	public static void main(String[] args) {
		// 주민번호 입력 받아 성별을 판별하는 프로그램을 작성해보자
		/*
		 남자 : 뒷 번호 첫 자리가 1이나 3
		 여자 : 뒷 번호 첫 자리가 2이나 4
		 [출력 예]
		 주민 등록 번호 입력( ex. 040722-3045810 ) : 020430-3045810
		 당신은 남자 입니다
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("주민 등록 번호 입력( ex. 040722-3045810 ) : ");
		char check;
		check = in.nextLine().charAt(7);
		in.close();
		
		if(check == '1' || check == '3') {
			System.out.println("당신은 남자 입니다.");
		}else {//}
			System.out.println("당신은 여자 입니다.");
		}
		
	}

}
