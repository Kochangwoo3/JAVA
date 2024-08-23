package chapter07;

public class _01_MultiArray {

	public static void main(String[] args) {
		// 다차원배열 3행 4열
		int[][] a = new int[3][4];
		
//		System.out.println("행갯수: " + a.length); //3
//		System.out.println("열갯수: " + a[0].length);//4
		a[1][2] = 99;
		a[2][0] = 123;
		a[2][3] = a[1][2] + a[2][0];
//		System.out.println(a[2][3]);
		for(int i=0; i<a.length; i++) {      // 행 첨자
			for(int j=0; j<a[i].length; j++) {  // 열 첨자
				System.out.print(a[i][j] + " ");				
			}
			System.out.println();
		}
//		
		

	}

}
