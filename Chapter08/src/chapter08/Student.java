package chapter08;

public class Student extends Person {
	//메서드
	public void set() {
		//weight = 75; //private은 외부 접근불가 
		setWeight(99);
		age = 30; // 같은폴더 디폴트는 접근가능
		name = "홍길동"; // public 모두 접근가능
		height = 175; // 상위 클래스 접근가능 
		              // protected는 같은폴더, 자식
	}
}
