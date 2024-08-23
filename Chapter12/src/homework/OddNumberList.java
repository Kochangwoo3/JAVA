package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumberList {

	public static void main(String[] args) {
		// 입력받은 리스트와 홀수 리스트를 생성
		Scanner in = new Scanner(System.in);
		//리스트 두개 선언
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		
		System.out.println("정수를 입력하세요. 종료하려면 0을 입력하세요.");
		int input;
		do {
			System.out.print("입력 : ");
			input = in.nextInt();
			// 여기에 리스트 추가 코드를 작성
			
		} while (input != 0);
		// 입력된 정수 리스트 출력
		
		// 홀수만 추출하여 새로운 리스트에 저장 
		
		// 홀수 리스트 출력
		
		in.close();

	}

}
