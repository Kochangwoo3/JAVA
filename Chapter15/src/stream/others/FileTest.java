package stream.others;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// File 클래스 테스트하기
		File file = new File("D:\\DEV\\JAVA_LAB\\Chapter15\\newFile.txt");
		// 실제 파일 생성
		file.createNewFile();
		// 파일의 속성을 살펴보는 메서드
		System.out.println(file.isFile());      // true
		System.out.println(file.isDirectory()); // false
		System.out.println(file.getName());     // newFile.txt
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());   // true
		System.out.println(file.canWrite());  // true

		//file삭제
		file.delete();
	}

}
