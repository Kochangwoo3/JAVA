package review;

import java.util.Scanner;

public class _05_NestedIf {

	public static void main(String[] args) {
		// 중첩 if
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = in.nextInt();
		
		System.out.println("학년을 입력하세요(1~4) : ");
		int year = in.nextInt();
		
		if(score >= 60) { //60점 이상
			if(year != 4) {
				System.out.println("합격!");  // 4학년 아니면서 60점이상이니까 합격
			}else if(score >= 70) {
				System.out.println("합격!!");  // 4학년 이면서 70점 이상
			}else {
				// 4학년이면서 70점 미만
				System.out.println("불합격!");
			}
		}else {// 60점 미만
			System.out.println("불합격!!");
		}
		
		in.close();
	}

}
