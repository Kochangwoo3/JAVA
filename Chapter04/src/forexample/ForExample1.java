package forexample;

public class ForExample1 {

	public static void main(String[] args) {
		// for문 예제
		int i;
/*
//		for(초기식; 조건식; 증감식) {
//			반복 실행문;
//		}
		
		for( i=1; i<=10; i++) {   //증감식: i += 1, ++i, i= i+1
			System.out.print(i + " ");
		}
		System.out.println("i값: " + i);
		
		//10부터 1씩 감소하면서 0까지 출력
		for(i=10; i>=0; --i) {
			System.out.print(i + " ");
		}
		System.out.println("i값: " + i);
		
		// 0부터 90까지 10씩 증가하며 출력
		for(i = 0; i<=90; i+=10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 0부터 10까지 3의배수 출력
		for(i=3; i<=100; i+=3) {
			System.out.print(i + " ");
		}
*/
		
		
		/* i   끝값: i+9
		   1 ~  10     
          11 ~  20
          21 ~  30
          .
          .
          .
          91 ~ 100 		   
		 */
//		for(i=1; i<=91; i+=10) {
//			//System.out.println(i + " ~ " + (i+9) );
//			System.out.printf("%3d ~ %3d\n", i, i+9);
//		}
		/*   i       "2 * " + i + " = " + (2*i) 
		 2 * 1 =  2
		 2 * 2 =  4
		 2 * 3 =  6
		 .
		 .
		 2 * 9 = 18
		 
		for(i=1; i<=9; i++) {
//			System.out.println( "2 * " + i + " = " + (2*i) );
			System.out.printf("2 * %d = %2d\n", i, (2*i) );
		}
	
		// 합계를 구할 변수
		int sum = 0;
		// 100 ~ 500까지의 합계는 []입니다. (1씩증가)
		for(i=100; i<=500; i++) {
			sum = sum + i;
		}
		System.out.println("100 ~ 500까지의 합계는 " + sum + "입니다.");
*/		
		
		// 1 ~ 100 까지의 범위에서 3의 배수의 합계는 %d입니다.\n 
		int sum1 = 0;
		int totalCnt = 0;
		for(i=3; i<=100; i+=3) {  // 3의배수 이면서
			if(i%2 != 0) {        // 2의 배수가 아닌 수의 개수와 합계는 
				System.out.print(i + " ");
				sum1 += i;
				totalCnt++;
			}
		}
// 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87 90 93 96 99 		
// 3 9 15 21 27 33 39 45 51 57 63 69 75 81 87 93 99 
		
		System.out.println();
		System.out.printf("1 ~ 100 까지의 범위에서 3의 배수, "
				+ "2의 배수가 아닌 수의 합계는 %d입니다.\n", sum1);
		System.out.printf("1 ~ 100 까지의 범위에서 3의 배수, "
				+ "2의 배수가 아닌 수의 개수는 %d입니다.\n", totalCnt);
//		
		/*
		 0도 ~ 100도까지의 섭씨 온도를 화씨 온도로 변환한 표를 작성해보자.
		섭씨 온도는 5도씩 증가하며 출력한다.
		
		화씨 온도(F) = (섭씨 온도(C) × 1.8) ＋ 32
		
		[출력 결과]
		
		*** Celsius 온도 => Fahrenheit 온도 환산표 ***
		Celsius    => Fahrenheit
		0          => 32.00     
		5          => 41.00   
		

		int c; // 섭씨온도
		double fa;  // 화씨 온도(F)
		
		for(c=0; c<=100; c+=5) {
			//System.out.println(c);
			//화씨 온도(F) = (섭씨 온도(C) × 1.8) ＋ 32
			fa = (c * 1.8) + 32;
			System.out.printf("%-10d => %-10.2f\n", c, fa);
		}
		 */
		

	}

}
