package homework;

import java.util.Scanner;

/***********************************************
       lineCnt = 7              
         [i]  [spaceCnt(dCnt)]
              lineCnt/2            starCnt
              (lineCnt/2+1)-i         
$$$*      1     3  <= 4-1            1  <= 2*i - 1 
$$***     2     2  <= 4-2            3  
$*****    3     1  <= 4-i            5
*******   4    [0] <= 4-i            7  <= 2*4 - 1  starCnt
$*****    5     1 ++spaceCnt         5  starCnt -=  2;
$$***     6     2                    3
$$$*      7     3                    1
***********************************************/
public class ExerciseQ5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int lineCnt;
		int lineCnt;
//		do {	// 일단 해!!
//			System.out.print("마름모 줄수 입력(홀수 입력): ");
//			lineCnt = in.nextInt();
//		}while(lineCnt%2 == 0);  // 반복 조건
		String input;
		
		while(true) {
			System.out.print("마름모 줄수 입력(홀수 입력): ");
//			lineCnt = in.nextInt();	
//			if(lineCnt%2 == 1) { //반복 탈출 조건 -> 정상입력값
//				break;
//			}else {
//				System.out.println("홀수 입력값인지 확인하세요!!!");
//			}
			
			input = in.nextLine();
			if (input.matches("[0-9]+")) {
				//System.out.println(input + "는 숫자입니다.");
				lineCnt = Integer.parseInt(input);
				if(lineCnt%2 == 1) { //반복 탈출 조건 -> 정상입력값
					break;
				}else {
					System.out.println("홀수 입력값인지 확인하세요!!!");
				}
			} else {
				System.out.println("숫자가 아닙니다. 다시 입력해주세요");
			}
//			
			
		}
		
		in.close();
		
		// 마름모 출력
//		int lineCnt = 9;
		int spaceCnt = lineCnt/2;
		int starCnt = 1;
		
		for(int i=1; i<=lineCnt; i++) {
			if(i <= lineCnt/2+1) {  //중간라인까지 : 중요핵심
				spaceCnt = (lineCnt/2+1) - i;
				starCnt = 2*i - 1;
			}else { // 중간라인 미만
				spaceCnt = spaceCnt + 1;
				starCnt = starCnt - 2;   // starCnt -=  2;
			}

			for(int j=1; j<=spaceCnt; j++) {
				System.out.print(" ");
			}  
			for(int k=1; k<=starCnt; k++) {
				System.out.print("*");
			} 
			
			System.out.println();
		}
	}

}
