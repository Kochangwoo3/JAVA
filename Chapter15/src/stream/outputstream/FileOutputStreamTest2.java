package stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		// 파일에 한 바이트씩 출력하기
		FileOutputStream fos = new FileOutputStream("output2.txt");
		
		try(fos){   //java 9부터
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i=0; i<bs.length; i++) {  // A ~ Z
				bs[i] = data;
				data++;
			}
			
			fos.write(bs);  // A ~ Z
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");

	}

}
