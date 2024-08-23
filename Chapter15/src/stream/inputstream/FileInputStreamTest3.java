package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		// 파일 끝까지 읽기 테스트
	
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int rtnChk;
			// rtnChk값이 -1이 아닌 동안에 read() 메서드로 반복해서 바이트를 읽음
			while((rtnChk = fis.read(bs)) != -1) { // true
				// 중요: 배열을 인자로 넘겨서 read 그 배열에 값이 넣어줌
//				for(byte b : bs) {
//					System.out.print((char)b);
//				}
				for(int k=0; k<rtnChk; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(" : " + rtnChk + "바이트 읽음");
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
