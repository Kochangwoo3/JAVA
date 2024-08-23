package chapter07;

import java.util.Scanner;

public class _03_GetMax {

	public static void main(String[] args) {
		// 배열값중 최대값 구하기
		int[] arr = new int[5];
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("입력 %d: ", i+1);
			arr[i] = in.nextInt();
		}
		in.close();
		
// 최대값 구하기
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("\n최대값: " + max);
		
	}

}
