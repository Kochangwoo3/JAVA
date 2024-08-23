package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		// 파일 끝까지 읽기 테스트
	
		try(FileInputStream fis = new FileInputStream("reader.txt")) {
			int rtnChk;
			// rtnChk값이 -1이 아닌 동안에 read() 메서드로 반복해서 바이트를 읽음
			while((rtnChk = fis.read()) != -1) { // true
				System.out.println((char)rtnChk);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
