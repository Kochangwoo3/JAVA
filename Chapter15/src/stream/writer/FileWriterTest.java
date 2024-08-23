package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// FileWriter 테스트

		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);                   // 문자배열 출력
			fw.write("안녕하세요. 잘 써지네요");  // 문자열
			fw.write(buf, 1, 2);             // 문자배열 일부
			fw.write("65");                  // 숫자를 그대로
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");

	}

}
