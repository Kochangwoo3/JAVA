package homework;

import java.util.Scanner;

public class CalcGrade {

	public static void main(String[] args) {
/**********************************
점수를 입력받아 등급을 출력하는 프로그램을 작성해보자.(**if문 이용**)
(단, 점수는 0~100점까지만 입력 가능하며, 그 외의 점수를 입력하면 “잘못된 점수 입력”이라는 메시지 출력 후, 종료)

◈ [90점 이상 : A등급], [80점 이상 : B등급], [70점 이상 : C등급], [60점 이상 : D등급],
  [60점 미만 : F등급]		  
**********************************/
		int score;
		char level;
		System.out.println("점수 입력: ");
		Scanner in = new Scanner(System.in);
		score = in.nextInt();
		in.close();
		
		if(score>=0 && score<=100) {
			if(score>=90) {
				level = 'A';
			}else if(score>=80) {
				level = 'B';
			}else if(score>=70) {
				level = 'C';
			}else if(score>=60) {
				level = 'D';
			}else {
				level = 'F';
			}
			
			if(level == 'F') {
				System.out.printf("[60점 미만 : %c등급]", level);
			}else {
				if(score == 100) {
					System.out.printf("[90점 이상 : %c등급]", level);
				}else {
					System.out.printf("[%d점 이상 : %c등급]", (score/10)*10, level);
				}
			}
			
		}else {
			System.out.println("잘못된 점수 입력입니다.");
		}
	
		
	}

}
