package array;

public class CharArray {

	public static void main(String[] args) {
		// 알파벳 문자와 아스키 코드 값 출력하기
		char[] alphabets = new char[26];
		char ch = 'A';
		
//		for(int i=0; i<alphabets.length; i++,ch++) {
//			alphabets[i] = ch;
//		}
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
			//ch++;
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}

	}

}
