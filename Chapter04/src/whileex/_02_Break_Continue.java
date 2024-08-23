package whileex;

public class _02_Break_Continue {

	public static void main(String[] args) {
		int i = 1;
		while(true) { // 무한 루프
			System.out.print(i + " ");
			i++;
			if(i > 10) {
				break; //반복문 탈출
			}
			if(i > 5) {
				continue;
			}
			System.out.println("@@@@@@@@@@@@@");
		}
	}

}
