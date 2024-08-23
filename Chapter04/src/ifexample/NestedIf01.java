package ifexample;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/***************************
		 국/영/수 점수 입력받아 평균 구한 후
		 평균이 60 점 이상 과락없으면(모두 60점 이상이면) [합격]
		 평균이 60 점 이상이지만 과락이 있으면 [과락으로 불합격]
		 평균이 60 점 미만 [평균 미달 불합격]
		*****************************/
		int kor, eng, mat;
		double avg;
		
		System.out.print("국어 영어 수학 점수 입력(공백 구분) : ");
		Scanner in = new Scanner(System.in);
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		in.close();
		
		avg = (double)(kor + eng + mat) / 3;
		if(avg >= 60) {
			if(kor>=60 && eng>=60 && mat>=60) {
				System.out.println("합격");
			}else {
				if (kor < 60) {
					System.out.printf("국어 ");
				}
				
				if (eng < 60) {
					System.out.printf("영어 ");
				}
				
				if (mat < 60) {
					System.out.printf("수학 ");
				}
				
				System.out.printf("과락으로 불합격\n");
			}
		}else {
			System.out.println("평균 미달 불합격");
		}
		

	}

}
