package array;

public class TwoDimension {

	public static void main(String[] args) {
		// 이차원 배열 초기화하기
//		int[][] arr = {{1, 2, 3}, 
//				       {4, 5, 6}};
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println(); //행출력 후 한줄 띄움
//		}
//		
		// 알파벳 소문자를 13행 2열로 출력하는 프로그램을 이차원 배열로 구현해 보세요
//		char[][] alphabets = new char[13][2];
		char ch = 'a';
//		
//		for(int i=0; i<alphabets.length; i++) {
//			for(int j=0; j<alphabets[i].length; j++) {
//				alphabets[i][j] = ch;
//				System.out.print(alphabets[i][j] + " ");
//				ch++;
//			}
//			System.out.println();
//		}
//		
		
		ch = 'a';  //97 - 32 => A
		char[][] alphabetsTwo = new char[2][26];
		for(int i=0; i<alphabetsTwo.length; i++) {
			for(int j=0; j<alphabetsTwo[i].length; j++) {
				alphabetsTwo[i][j] = ch;
				System.out.print(alphabetsTwo[i][j] + " ");
				ch++;
			}
			ch = (char)(alphabetsTwo[0][0] - 32);
			System.out.println();
		}
	
	}

}
