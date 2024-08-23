package chapter2;

public class Variable1 {

	public static void main(String[] args) {
//		int level;  // 정수형 변수 level을 선언
//		level = 10; // level변수에 값 10을 대입 : 초기화
		int level = 10;  // 선언과 동시에 초기화(값을 대입)
		
		short sNum = (short)level;
		System.out.println(sNum);
		
		double sum = (float)level / 3.0; 
		
		System.out.println(level);
	}

}
