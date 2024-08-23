package chapter03;

import java.util.Scanner;

public class TestRun {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int price, payment, change;

		System.out.print("물건 가격 입력: ");

		price = in.nextInt();

		System.out.print("지불 금액 입력: ");

		payment = in.nextInt();

		System.out.print("--------------------------------------\n");

		change = payment - price;

		System.out.printf("거스름돈: %d원\n", change);

		in.close();

		System.out.print("--------------------------------------\n"); 

//		System.out.printf("10000원: %d개\n", change/10000);
//		System.out.printf("1000원: %d개\n", (change%10000)/1000);
		System.out.printf("1000원: %d개\n", change/1000);
		
		System.out.printf("500원: %d개\n", (change%1000)/500);

		System.out.printf("100원: %d개\n", (change%500)/100);

		System.out.printf("10원: %d개\n", (change%100)/10);

		System.out.print("--------------------------------------\n");
	}

}
