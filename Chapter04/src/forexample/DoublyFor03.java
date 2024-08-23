package forexample;
/*==========================
규칙성 찾기
        i    j                <= limit
			초기값  조건값(limit)
12345   1    1     5     =  i + 4
23456   2    2     6     =  i + 4
34567   3    3     7     =  i + 4
45678   4    4     8
56789   5    5     9
        i    j시작  j끝
56789   5    i     i+4
45678   4
34567   3
23456   2
12345   1
       
*=============================*/
public class DoublyFor03 {

	public static void main(String[] args) {
		int limit = 9;
		
        for(int i=5; i>=1; i--) {
			limit =  i + 4;   // 9, 8, 7, 6, 5
			for(int j=i; j<=limit; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}		
//		int limit = 5;
//	
//        for(int i=1; i<=5; i++) {
//			limit =  i + 4;   //5, 6, 7, 8, 9 
//			for(int j=i; j<=limit; j++) {
//				System.out.print(j + " ");
//			}
//			
//			System.out.println();
//		}


	}

}
