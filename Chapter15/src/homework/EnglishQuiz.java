package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EnglishQuiz {
	
	public static List<String> readWordsFromFile(String fileName) {
		List<String> words = new ArrayList<>();
		try(FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader)) {
			
			String line;
			while((line = br.readLine()) != null) {
				words.add(line);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		return words;
	}
	
	
	public static void main(String[] args) {
		// 영단어 퀴즈 프로그램
		Scanner scanner = new Scanner(System.in);
		List<String> words = readWordsFromFile("meaning.txt");
		
		int questionCount = 0;  // 문항수
		int correctCount = 0;
		
		while (true) {
			if(words.isEmpty()) {
				break;
			}
			// 1. 단어와 뜻을 랜덤하게 추출하는 코드를 작성하세요
			Random random = new Random();
			int index = random.nextInt(words.size());
			String word = words.get(index);   // 랜덤 라인 word = 영단어, 뜻
			String meaning = word.split(",")[1].trim(); //정답
			
			// 2. 문제출력
			System.out.println("단어: " + word.split(",")[0].trim());
			System.out.print("뜻을 입력하세요: ");
			String answer = scanner.nextLine();
			
			// 3. 정답 판별 및 출력
			questionCount++;
			if (answer.equals(meaning)) {
				System.out.println("정답입니다!");
				correctCount++;
			} else {
				System.out.println("틀렸습니다. 정답은 " + meaning + "입니다.");
			}
			
			// 리스트에서 해당문제 인덱스로 삭제
			words.remove(index);
		}
		
			
		// 결과 출력
		System.out.println("===========================");
		System.out.println("총 문제 수: " + questionCount);
		System.out.println("정답 수: " + correctCount);
		System.out.println("===========================");
		scanner.close();

	}

}
