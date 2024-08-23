package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// ArrayList 에서 스트림 활용하기
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();  // 스트림 생성
		stream.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		// 스트림 중간연산과 최종연산을 같이 도트연산자 사용 : 체이닝 기법
		sList.stream().sorted().forEach(s->System.out.print(s + " "));;
		

	}

}
