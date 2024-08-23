package forexample;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		int d, m;
		int begin, end, temp;
		
		System.out.print("구구단의 시작 단 입력: ");
		Scanner in = new Scanner(System.in);
		begin = in.nextInt();
		
		System.out.print("구구단의 끝 단 입력: ");
		end = in.nextInt();
		in.close();
		
//		begin = 2;
//		end = 9;
		if(begin > end) {   //begin: 7, end: 1
			temp = begin; // temp : 7
			begin = end;  // begin: 1
			end = temp;   // end: 7
			System.out.println("시작단이 끝단보다 큰경우 두개 값을 교환 처리합니다.");
		}
		
		
//		// 가로 구구단 출력
		System.out.println("\n\n ### 가로 구구단 ### \n");
		for(d=begin; d<=end; d++) {  // 단: d
			System.out.printf("%d단: ", d);
			
			for(m=1; m<=9; m++) {  // 곱하는 수": m
				System.out.printf("%d*%d=%2d  ", d, m, d * m);
			}
			System.out.println();
		}
		
		// 세로 구구단 출력
		System.out.println("\n\n ### 세로 구구단 ### \n");
		for(m=1; m<=9; m++) {  // 곱하는 수": m
			for(d=begin; d<=end; d++) {
				System.out.printf("%d*%d=%2d  ", d, m, d*m);
			}
			System.out.println();
		}
		

	}

}
