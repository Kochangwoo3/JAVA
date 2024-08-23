package chapter05;

import java.util.HashMap;
import java.util.Scanner;

public class TempRun {
	 public static void main(String[] args) {
	        // 단어 쌍 저장하는 HashMap 생성
	        HashMap<String, String> wordMap = new HashMap<>();
	        wordMap.put("바늘", "실");
	        wordMap.put("라면", "김치");
//	        wordMap.put("피노키오", "제페토");
//	        wordMap.put("우주", "빅뱅");
//	        wordMap.put("연필", "지우개");
//	        wordMap.put("책상", "의자");
//	        wordMap.put("봄", "벗꽃");
//	        wordMap.put("여름", "바다");
//	        wordMap.put("가을", "은행");
//	        wordMap.put("겨울", "고구마");

	        // 퀴즈 실행 함수 호출
	        runAssociateQuiz(wordMap);
	    }

	    private static void runAssociateQuiz(HashMap<String, String> wordMap) {
	        Scanner scanner = new Scanner(System.in);
	        int score = 0; // 맞춘 개수
	        System.out.println("당신이 생각하는 연상 단어를 입력하세요. (총 문제 수: 10문제)\n");
	        // 모든 단어 쌍 순회하며 퀴즈 진행
	        for (String key : wordMap.keySet()) {
	            System.out.print(key + "=> ");
	            String answer = scanner.nextLine();

	            if (answer.equals(wordMap.get(key))) {
	                System.out.println("[정답]입니다!");
	                score++;
	            } else {
	                System.out.println("[오답]입니다. 정답은 " + wordMap.get(key) + "입니다.");
	            }
	        }

	        // 퀴즈 종료 메시지 출력
	        System.out.println("총 "+ wordMap.size() +"문제 중 정답 [" + score + "]개");
	    }	
//	public static double CelToFah(int celsuis) {
//		double fah;
//		fah=celsuis*1.8+32;
//		return fah;
//	}
//	
//	public static void main(String[] args) {
//		//섭씨를 화씨로 변환 후 리턴하는 메소드
//		
//		int celsuis;
//		Scanner in=new Scanner(System.in);
//		
//		System.out.print("섭씨 입력: ");
//		celsuis=in.nextInt();
//		//CelToFah(celsuis)   섭씨를 화씨로 변환하는 메소드
//		System.out.printf("섭씨 %d도-> %.0f도\n", celsuis, CelToFah(celsuis));
//		in.close();
//	}

}
