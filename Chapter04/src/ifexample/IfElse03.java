package ifexample;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		// 나이와 내공을 입력받아 고스톱 게임의 초보 채널 입장 여부 판별 프로그램
		// [입장 가능 조건] 나이 : 18세 이상, 내공 : 1400 ~ 1600
		// 이 조건이 맞지 않는 경우는 입장이 불가능하다
		Scanner in = new Scanner(System.in);
		int age, level;
		System.out.println("나이: ");
		age = in.nextInt();
		
		System.out.println("내공: ");
		level = in.nextInt();
		in.close();
		
		if( age >= 18 && level >= 1400 && level <= 1600) {
			System.out.println("입장 가능");
		}else {
			System.out.println("입장 불가능");
		}
	}

}
