package homework;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 0~99 사이의 무작위 숫자를 100개 출력 후,   
		// 구간의 개수를 카운트 하는 프로그램을 작성해 보자.
		int[] num = new int[5];
		int[] count = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100);// Math.random(): 0~0.99999 = 0 ~ 99
			System.out.printf("%5d", num[i]);
			
			for(int j=0; j<count.length; j++) {
				if(num[i]/10 == j) {
					count[j] += 1;
				}
			}
			
			//여기에 코드를 작성하시요	
			//int j = num[i] / 10;  // 임의의 숫자 몫
			//count[j] = count[j] + 1;
			
			//count[num[i] / count.length]++; 
			
			
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		System.out.println("===================================================");
		for (int j = 0; j < 10; j++) {
			System.out.printf("%2d ~ %2d까지의 정수는 %2d개 입니다.\n", j*10, (j*10)+ 9, count[j]);
		}
		
	}

}
