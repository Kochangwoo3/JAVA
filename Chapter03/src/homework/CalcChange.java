package homework;

import java.util.Scanner;

public class CalcChange {

	public static void main(String[] args) {
		// 물건 값과 지불액을 입력받아 거스름돈을 구하는 프로그램을 작성 하시오.
/*
	거스름돈: 2920원
	--------------------------------------
	1000원: 2개  거스름돈 / 해당금액
	500원: 1개   (거스름돈 % 상위단위금액) / 해당금액
	100원: 4개   (거스름돈 % 상위단위금액) / 해당금액
	10원: 2개    (거스름돈 % 상위단위금액) / 해당금액
 */
		int price, payment, change;
		
		Scanner in = new Scanner(System.in);
		System.out.print("물건 가격 입력: ");
		price = in.nextInt();
		
		System.out.print("지불 금액 입력: ");
		payment = in.nextInt();
		System.out.println("------------------------------");
		in.close();
		change = payment - price;  
		
		System.out.printf("거스름돈: %d원\n", change);
		System.out.println("------------------------------");
		System.out.printf("1000원: %d개\n", change/1000); 
		System.out.printf("500원: %d개\n", (change%1000)/500);
		System.out.printf("100원: %d개\n", (change%500) /100);
		System.out.printf("10원: %d개\n",  (change%100) /10);
		System.out.println("------------------------------");
	}

}
