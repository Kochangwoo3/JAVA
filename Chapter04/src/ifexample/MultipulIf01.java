package ifexample;

import java.util.Scanner;

public class MultipulIf01 {

	public static void main(String[] args) {
		/***************************************
		 국/영/수 점수를 입력 받아 평균을 구한 후,
		 	평균이 90점 이상이면 A등급
		 	평균이 80점 이상이면 B등급
		 	평균이 70점 이상이면 C등급
		 	평균이 60점 이상이면 D등급
		 	아니라면 F등급
		 [출력 예] 평균은 %.2f로 %c등급 입니다.
		 ***************************************/
		int kor, eng, mat;
		
		System.out.print("국어 영어 수학 점수 입력(공백 구분): ");
		Scanner input = new Scanner(System.in);
		kor = input.nextInt();
		eng = input.nextInt();
		mat = input.nextInt();
		input.close();
		
		double avg = (kor + eng + mat) / 3.0;
		char grade = 'F'; 
		// 다중 if문: 여러 개 중 한 개 선택
		if(avg >= 90) {
			grade = 'A';
		} else if(avg >= 80) {
			grade = 'B';
		} else if(avg >= 70) {
			grade = 'C';
		} else if(avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("평균은 %.2f로 %c등급입니다 \n", avg, grade);
		
	}

}
