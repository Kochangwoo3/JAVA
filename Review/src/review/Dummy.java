package review;

public class Dummy {
	//멤버변수
	int a;
	int b;
	
	// 생성자
	Dummy(){
		a = 10;
		b = 20;
		System.out.println("1. 생성자: 인스턴스 생성 시 호출");
	}
	
	Dummy(int a1){  // overloading : 이름이 같아도 매개변수 타입이나 갯수 다른경우
		a = a1;
		b = 20;
		System.out.println("2. 생성자");
	}
	
	Dummy(int a1, int b1){
		a = a1;
		b = b1;
		System.out.println("3. 생성자");
	}
	// 메서드
	void display() {
		System.out.println("a = " + a + ", b = " + b);
	}

}
