package chapter07;

public class _02_MultiTable {

	public static void main(String[] args) {
		// 구구단 값을 저장할 수 있는 이차원 배열
		int[][] table = new int[8][9];
		
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table[i].length; j++) {
				table[i][j] = (i+2) * (j+1);
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}

	}

}
