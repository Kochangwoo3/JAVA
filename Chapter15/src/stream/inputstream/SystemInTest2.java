package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// 문자 여러개를 입력받기
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			//  값이 없을때 -1을 리턴 :  각 함수 리턴값 확인 필요
			while(  (i = System.in.read()) != -1  ) {
				System.out.print((char)i);  //문자로 변환 출력 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
