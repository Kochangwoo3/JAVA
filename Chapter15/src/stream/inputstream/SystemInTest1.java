package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		// 문자 하나를 입력받기
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);  //문자로 변환 출력   
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
