package homework;

import java.util.Scanner;

public class PayAmount {

	public static void main(String[] args) {
		/*
		 코스모상점의 빅 세일 기간으로 모든 물건은 가격의 25%를 할인해서 판매 한다.
		 단 3500원의 별도의 배송비가 발생한다.
		 물건 가격을 입력 받아 배송비를 포함한 결제 금액을 출력 하시오.
		 [출력] :
		 물건 가격 : 77000
         회원님의 최종 결제금액(배송비 포함)은 61250원 입니다.
		 */
		final int DELIVERY_FEE = 3500;
		int price;
		double finalPrice;
		
		System.out.print("물건 가격: ");
		
		Scanner in = new Scanner(System.in);
		price = in.nextInt();
		in.close();
		
		finalPrice = (price * 0.75) + DELIVERY_FEE;
		System.out.printf("회원님의 최종 결제금액(배송비 포함)은 %.0f원 입니다.",
				finalPrice);
	}

}
