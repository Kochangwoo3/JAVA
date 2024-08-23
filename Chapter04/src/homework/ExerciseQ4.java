package homework;

import java.util.Scanner;

/************************************
lineCnt = 4;  //라인수(lineCnt)
         i     달러갯수(dCnt) 별갯수(starCnt)
              =라인수-1        1    ++2
$$$*     1       3            1
$$***    2       2            3
$*****   3       1            5
*******  4       0            7
 
 *************************************/
public class ExerciseQ4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("별라인수 입력 : ");
		int lineCnt = in.nextInt();
		in.close();
		// 별삼각형 그리기
		//int lineCnt = 6;
		int dCnt = lineCnt - 1;
		int starCnt = 1;
		
		for(int i=1; i<=lineCnt; i++) {
			//달러/공백찍기
			for(int j=1; j<=dCnt; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=starCnt; k++) {
				System.out.print("*");
			}
			// 중요  달러나 별을 찍는 갯수의 변화 ==========
			dCnt = dCnt - 1;     
			starCnt = starCnt + 2;
			//========================================
			System.out.println();
		}
		

	}

}
