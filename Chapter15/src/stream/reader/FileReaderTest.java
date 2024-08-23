package stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// 파일 끝까지 읽기 테스트
	
		try(FileReader fr = new FileReader("reader.txt")) {
			int rtnChk;
			// rtnChk값이 -1이 아닌 동안에 read() 메서드로 반복해서 바이트를 읽음
			while((rtnChk = fr.read()) != -1) { // true
				System.out.print((char)rtnChk);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
