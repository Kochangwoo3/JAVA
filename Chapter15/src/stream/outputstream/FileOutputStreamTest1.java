package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		// 파일에 한 바이트씩 출력하기
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
			fos.write(65);  //A
			fos.write(66);  //B
			fos.write(67);  //C
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");

	}

}
