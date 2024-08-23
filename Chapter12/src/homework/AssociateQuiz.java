package homework;

import java.util.HashMap;
import java.util.Scanner;

public class AssociateQuiz {

	public static void main(String[] args) {
		HashMap<String, String> wordMap = new HashMap<>();
		
        wordMap.put("바늘",    "실");
        wordMap.put("라면",    "김치");
//        wordMap.put("피노키오", "제페토");
//        wordMap.put("우주", "빅뱅");
//        wordMap.put("연필", "지우개");
//        wordMap.put("책상", "의자");
//        wordMap.put("봄", "벗꽃");
//        wordMap.put("여름", "바다");
//        wordMap.put("가을", "은행");
//        wordMap.put("겨울", "고구마");
//        
        runAssociateQuiz(wordMap);

	}
	
	public static  void runAssociateQuiz(HashMap<String, String> wordMap) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;  // 맞춘 개수 
		System.out.println("당신이 생각하는 연상 단어를 입력하세요. (총 문제 수: "+ wordMap.size() + "문제)");
		
		for (String key : wordMap.keySet()) {
			System.out.print(key + "=> " );
			String answer = scanner.nextLine();
			
			// 여기에 코드를 작성하세요  ====  힌트 : equals 랑  get 활용 
			if(  answer.equals(wordMap.get(key))   ){
				System.out.println("[정답]입니다");
				score++;
			} else {	
				System.out.println("[오답]입니다. 정답은 [" + wordMap.get(key)  + "]입니다"  );
			}
			// ==================================================================	
			
		}
		
		System.out.println("총 "+ wordMap.size() +"문제 중 정답 [" + score + "]개");
		scanner.close();
	}
	

}
