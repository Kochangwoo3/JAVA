package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _01_FilterAndMap {

	public static void main(String[] args) {
		// 숫자 리스트에서 3의 배수만 필터링하고, 
		// 각각의 수를 2배로 변환한 후 리스트에 저장하여 출력하세요
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> filteredNumbers = numbers.stream()
				.filter(n -> n%3 == 0)  // 3의배수  true인것 필터링
				.map(number -> number * 2)  // 각 수를 2배로 변환
				.collect(Collectors.toList());  // 결과를 리스트로 변환
		// List<Integer> filterNums = numbers.stream().filter(n -> n%3 == 0).map(number -> number * 2)
		// 결과 출력
		System.out.print("3의배수를 2배변환한 리스트: " + filteredNumbers);
				

	}

}
