package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// 파일 복사하기
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip")){
			millisecond = System.currentTimeMillis();  // 시작시간
			// 작업
			int i;
			while( (i = fis.read()) != -1 ) {
				fos.write(i);
			}
			
			// 소요시간 = System.currentTimeMillis()(종료시간) - millisecond
			millisecond = System.currentTimeMillis() - millisecond;
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("파일복사하는 데 " + millisecond + " milliseconds 소요되었습니다. ");
		// 파일복사하는 데 198463 milliseconds 소요되었습니다.
	}

}
