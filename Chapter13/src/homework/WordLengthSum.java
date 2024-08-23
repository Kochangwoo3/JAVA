package homework;

import java.util.Arrays;
import java.util.List;

public class WordLengthSum {

	public static void main(String[] args) {
		// 중복단어 제거 후 문자열 리스트에서 각단어의 길이의 합을 출력하시요.
		List<String> words = Arrays.asList("cat", "dog", "elephant", "cat", "lion");
		
		// 중복 제거 후 단어 길이 합산을 스트림을 활용하여 작성
		int totalLength = 0;
		
		// 여기 코드 작성하세요
		//words.stream().distinct().forEach(s -> System.out.print(s + " ")); 
		
		
		totalLength = words.stream().distinct()  // 중복제거
               .mapToInt(word -> word.length()) // 단어 길이 추출
               .sum();// 길이 합산				

		
		// 결과 출력
		System.out.println("중복 제거 후 각 단어 길이의 합: " + totalLength);
		

	}

}
