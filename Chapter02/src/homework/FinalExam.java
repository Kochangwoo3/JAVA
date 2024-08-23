package homework;

public class FinalExam {

	public static void main(String[] args) {
		// 2번
		/*
		 홍길동군은 기말고사 시험에서 국어 90점, 영어 85점, 수학 75점을 받았다. 
		 등급은 B등급이다.

		 각각의 점수와 등급을 변수에 저장한 후 총점과 평균을 구해 출력하는 프로그램을 작성해보자.
		(단, 평균은 소수점 이하 2자리 출력)
		 */
		int korea = 90;
		int english = 85;
		int math = 75;
		
		int sum;
		double mean;
		char grade = 'B';
		
		sum = korea + english + math;
		mean = sum / 3.0;
		
		System.out.printf("국어: %d점\n영어: %d점\n수학: %d점\n총점: %d점\n평균: %.2f점\n등급: %c", 
				korea, english, math, sum, mean, grade);

	}

}
