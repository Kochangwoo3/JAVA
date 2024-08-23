package ifexample;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// 국/영/수 점수 입력 -> 모두 60점 이상이면 : 합격  
		//             아니면(한과목 이상 60점 미만이면) : 불합격
		Scanner in = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 연속으로 입력(공백 구분) : ");
		int kor = in.nextInt();
		int eng = in.nextInt();
		int mat = in.nextInt();
		in.close();
		
//		if(kor >= 60 && eng >= 60 && mat >= 60) {  // 합격조건
//			System.out.println("모든 과목이 60점 이상으로 합격입니다.");
//		}else {
//			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다.");
//		}
		
//		if(kor < 60 || eng < 60 || mat < 60) {    //  불합격조건
//			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다.");
//		}else {
//			System.out.println("모든 과목이 60점 이상으로 합격입니다.");
//		}
		
		if(!(kor >= 60 && eng >= 60 && mat >= 60)) {  //  불합격조건
			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다.");
		}else {
			System.out.println("모든 과목이 60점 이상으로 합격입니다.");
		}
				
	}

}
