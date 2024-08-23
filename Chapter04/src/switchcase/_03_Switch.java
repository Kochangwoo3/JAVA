package switchcase;

import java.util.Scanner;

public class _03_Switch {

	public static void main(String[] args) {
		/*****************************************************
		 문자를 입력 받아 아래의 메시지를 출력하는 프로그램을 작성해보자
		 단 switch문으로 작성하시요
		 F 또는 f 입력 시 :  File Menu
		 H 또는 h 입력 시 :  Help Menu
		 E 또는 e 입력 시 :  Edit Menu
		 그 밖의 입력 시: Error
		 [출력 예]
		 메뉴 코드 입력 : H
		 Help Menu
		 *****************************************************/
		char code;
		System.out.println("메뉴 코드 입력 : ");
		Scanner in = new Scanner(System.in);
		code = in.nextLine().charAt(0);
		in.close();
		
		if (code >= 'a' && code <= 'z') {  // 소문자 라면?
			// 대문자로 변환
			code = (char) (code - 32);  // a(97)  -> (char)(97 - 32) -> A
		}
		
		switch(code) {
//		case 'f':
		case 'F':
			System.out.println("File menu\n");
			break;
//		case 'h':
		case 'H':
			System.out.println("Help menu\n");
			break;
//		case 'e':
		case 'E':
			System.out.println("Edit menu\n");
			break;
		default:
			System.out.println("Error\n");
		}
		

	}

}
