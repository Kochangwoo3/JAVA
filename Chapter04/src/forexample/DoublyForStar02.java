package forexample;
/*==========================
규칙성 찾기
        i    j   <= starCnt = 6 - i
                          i
*****   1    5    5 = 6 - 1
****    2    4    4 = 6 - 2
***     3    3    3 = 6 - 3
**      4    2
*       5    1

        i   별카운트
*****   5    5        starCnt = i
****    4    4   
***     3    3    
**      2    2
*       1    1       
     
       
       
       
*=============================*/
public class DoublyForStar02 {

	public static void main(String[] args) {
		int starCnt = 1;
	
//      for(int i=1; i<=5; i++) {
//			starCnt = 6 - i;
//			for(int j=1; j<=starCnt; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println(i);
//		}
		
		for(int i=5; i>=1; i--) {
			starCnt = i;
			for(int j=1; j<=starCnt; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
