package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// RandomAccessFile Test
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);  // 4
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());  // 4
		
		rf.writeDouble(3.14);  // 4 + 8
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());  //  12
		
		rf.writeUTF("안녕하세요");  // 3 * 5 + null 문자(2byte) = 17byte
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());   // 29
		
		rf.seek(0);   // 파일포인터 위치 변경
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());  // 0
		
		int i = rf.readInt();     //4
		double d = rf.readDouble(); // 12
		String str = rf.readUTF(); // 29
		
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());  // 29
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
