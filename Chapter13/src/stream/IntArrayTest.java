package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		// 정수 배열에서 스트림 활용하기
		int[] arr = {1, 2, 3, 4, 5};
		
//		IntStream obj = Arrays.stream(arr); // obj 를 여러번 사용못함
//		int sumVal = obj.sum();
//		int count = (int)obj.count();
		
		int sumVal = Arrays.stream(arr).sum();  // 배열 스트림 생성
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
		
	}

}
