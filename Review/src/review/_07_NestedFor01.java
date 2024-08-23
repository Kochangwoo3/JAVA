package review;

public class _07_NestedFor01 {
	// 별삼각형 출력하기
	public static void main(String[] args) {
		int lineCnt = 7;   // 라인수  4-> 7   삼각형  에서 마름모
		int spaceCnt = 3;  // 공백수
		int starCnt = 1;
		
		for(int i=0; i<lineCnt; i++) {  // 4줄  0, 1, 2, 3
			for(int j=0; j<spaceCnt; j++) {
				System.out.print(' ');
			}
			for(int k=0; k<starCnt; k++) {
				System.out.print('*');
			}
			if(i < 3) {
				spaceCnt = spaceCnt - 1;
				starCnt = starCnt + 2;
			} else {  // 중간라인 지나면서
				spaceCnt = spaceCnt + 1;
				starCnt = starCnt - 2;
			}
			System.out.println();  // 개행처리
		}
	}
}
