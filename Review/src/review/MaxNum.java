package review;

import java.util.Scanner;

public class MaxNum {

	
	public static void main(String[] args) {
		// 3개의 정수를 연속으로 입력 받아 세 수중 
		// 가장 큰수를 리턴하는 메서드를 정의해 보시오
		int x, y, z, k;
		Scanner in = new Scanner(System.in);
		System.out.print("4개의 정수를 입력(공백 구분): ");
		x = in.nextInt();
		y = in.nextInt();
		k = in.nextInt();
		z = in.nextInt();
		
		System.out.printf("네 수 중 가장 큰 수는 %d\n", getLargeNum(x, y, k, z));
		
		in.close();
	}
	
	public static int getLargeNum(int x, int y, int k, int z) {
//		int max=x;
//		
//		if(max<y) {
//			max=y;
//			if(max<z) {
//				max=z;
//			}
//		}else if(max<z){
//			max=z;
//			if(max<y) {
//				max=y;
//			}
//		}
		                 // x y k z
		                 // 3 5 7 9    max = z
		int max=x;       // 7 5 4 3    max = x
		                 // 3 7 6 5    max = y
		if(max<y) {      // 3 5 9 7 
			max=y;
		}
		
		if(max<k) {     
			max=k;
		}
		
		if(max<z){
			max=z;
		}
		
		return max;
	}
	
	
}
