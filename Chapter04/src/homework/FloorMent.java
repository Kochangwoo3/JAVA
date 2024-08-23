package homework;

import java.util.Scanner;

public class FloorMent {

	public static void main(String[] args) {
		/* 층번호 를 입력하면
		 1층 약국입니다
		 2층 정형외과입니다
		 3층 피부과입니다.
		 4층 치과입니다.
		 5층 헬스클럽입니다.        이외 []층 존재하지 않는 층입니다
		 */
		int floor;
		String ment;
		
		Scanner in = new Scanner(System.in);
		System.out.println("층번호 입력(1~5): ");
		floor = in.nextInt();
		in.close();
		
		switch(floor) {
		case 1: ment = "약국";
			break;
		case 2: ment = "정형외과";
			break;
		case 3: ment = "피부과";
			break;
		case 4: ment = "치과";
			break;
		case 5: ment = "헬스클럽";
			break;
		default: ment = "존재하지 않는 층";
		}
		System.out.println(floor + "층 " + ment + "입니다.");
		
//		String floor;
//		String ment;
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("층번호 입력(1~5): ");
//		floor = in.next();
//		
//		in.close();
//		System.out.println(floor);
		

	}

}
