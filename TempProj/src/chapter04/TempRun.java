package chapter04;

import java.util.Scanner;

public class TempRun {
	

	public static int getLargeNum(int x,int y,int z) {
		int max=x;
		if(max<y) {
			max=y;
			if(max<z) {
				max=z;
			}
		}else if(max<z){
			max=z;
			if(max<y) {
				max=y;
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		//큰 수를 구해 리턴하는 메서드
		int x, y, z;
		
		Scanner in = new Scanner(System.in);
		System.out.print("3개의 정수를 입력(공백 구분): ");
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		
		System.out.printf("세 수 중 가장 큰 수는 %d\n",getLargeNum(x,y,z));
		
		in.close();
	}



}
