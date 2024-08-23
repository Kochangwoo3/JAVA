package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// n1의 n2승 (2의 4승)을 구해 리턴하는 메소드 2*2*2*2
		Scanner in = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("첫번째 수 입력 : ");
		n1 = in.nextInt();
		System.out.println("두번째 수 입력: ");
		n2 = in.nextInt();
		in.close();
		
		System.out.printf("%d^%d=%3d\n", n1, n2, power(n1, n2));
		System.out.printf("%d+%d=%3d\n", n1, n2, add(n1, n2));
		System.out.printf("%d-%d=%3d\n", n1, n2, substract(n1, n2));
	}

	public static int substract(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public static int add(int n1, int n2) {
		int result = 0;
		result = n1 + n2;
		return result;
	}
	
	public static int power(int n1, int n2) {
		int square = 1;
		for(int i=0; i<n2; i++) {
//   0,         1,         2,          3
// 2 =[1]*2 ,4 = [2]*2, 8 = [4]*2 , 16 = [8]*2			
			square = square * n1;     
			//square *= n1;
		}
		return square;
	}

}
