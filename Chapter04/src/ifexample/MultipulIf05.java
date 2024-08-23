package ifexample;

import java.util.Scanner;

public class MultipulIf05 {

	public static void main(String[] args) {
		    
		// 입력받은 문자가 대문자라면? 소문자로 출력
		// 입력받은 문자가 소문자라면? 대문자로 변환 출력
		// 대문자도 소문자도 아니라면 -> "영문자가 아닙니다." 출력
		
		Scanner in = new Scanner(System.in);
		System.out.print("영문자 입력: ");
		char alpha = in.next().charAt(0);    
		in.close();
		
		// 범위   && 연산자를 쓴다
		if(alpha >= 'a' && alpha <= 'z') {   // 소문자인 경우는?
			// 32 는 대문자 소문자 유니코드값 차이
			System.out.println("소문자: " + alpha + "=> 대문자: " + (char)(alpha - 32));
		}else if(alpha >= 'A' && alpha <= 'Z') {   // 대문자인 경우는?
			System.out.println("대문자: " + alpha + "=> 소문자: " + (char)(alpha + 32));
		}else {
			System.out.println("영문자가 아닙니다.");
		}
		


	}
}
