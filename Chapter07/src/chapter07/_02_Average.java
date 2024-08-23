package chapter07;

public class _02_Average {

	public static void main(String[] args) {
		// 배열 이용 평균 구하기
		int[] num = new int[1000];
		int total = 0;
		
		for(int i=0; i< num.length; i++) {
			num[i] = (int)(Math.random() * 10); // 0 ~ 9 
			total += num[i];  // 저장된 정수를 누적
			System.out.printf("%4d", num[i]);
//			if(i==9 || i==19 || i==29) {
			if(i%10 == 9) {
				System.out.println();
			}
		}
		System.out.println("\n정수 "+ num.length + "개의 평균은 " +
						(double)total/num.length + "입니다." );

	}

}
