package homework;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 로또 당첨번호 출력하기
		int[] lotto = new int[6];
		
		System.out.println("=== 이번주 당첨 번호 ===");
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int) ((Math.random() * 45) + 1); // (0 ~ 44) + 1
			
			// 여기에 중복되지 않는 수를 생성되게 작성해보세요
			boolean chk = true;
			for (int j = 0; j < i; j++) {
				if ( lotto[j] == 21 ) {
					i -= 1;
					chk = false;
				}
			}
			if(chk == true) {
				System.out.print(lotto[i] + " ");
			}
		}
		
	}

}
