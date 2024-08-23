package whileex;

public class _01_While {

	public static void main(String[] args) {
		// while문과 do~while문
		int i = 1;  // 초기식
		
//		while(조건식) {
//			실행 명령문;
//		}
		while(i <= 100) {   //조건식  ~하는동안 반복
			System.out.print(i + " ");
			i++;   // i = i + 1,   i += 1  증감식
		}
		System.out.println();
//		do { // 해!
//			실행 명령문;
//		}while(조건);
		
		i = 1;
		do {
			System.out.print(i + " ");  // 실행 명령문;
			i++;
		}while(i <= 100);
		

	}

}
