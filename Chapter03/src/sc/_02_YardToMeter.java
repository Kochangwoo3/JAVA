package sc;

import java.util.Scanner;

public class _02_YardToMeter {

	public static void main(String[] args) {
		final double ONE_YARD = 0.9144;
		
		System.out.print("야드 입력: ");
		Scanner in = new Scanner(System.in);   // A a = new A(System.in);
		//double yard = 250;
		double yard = in.nextDouble();
		in.close();
		
		double meter = yard * ONE_YARD;
		
		System.out.println(yard + "야드는 " + meter + "미터 입니다." );
	}

}
