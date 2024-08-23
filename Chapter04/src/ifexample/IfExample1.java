package ifexample;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		// 나이에 따라 다른 문장 출력하기
//		Scanner in = new Scanner(System.in);
//		System.out.print("나이를 숫자로 입력해주세요: ");
//		int age = in.nextInt();
//		in.close();
//		//System.out.println(age);
//		if(age >= 8) {
//			System.out.println("학교에 다닙니다.");
//		}else {
//			System.out.println("학교에 다니지 않습니다.");
//		}
		
		
		char gender = 'M';
		//만약에 gender가 'F'라면
		if(gender == 'F') {
			System.out.println("여성입니다.");
		}else {  // 그렇지 않다면
			System.out.println("남성입니다.");
		}
		
		
//		if(gender == 'F') System.out.print("여성");
		if(gender == 'F') {
			System.out.print("여성");
		}
		
		
	}

}
