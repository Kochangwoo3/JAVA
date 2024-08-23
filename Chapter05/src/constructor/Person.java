package constructor;

public class Person {
	// 멤버변수
	String name;
	float height;
	float weight;
	
	// 기본생성자
	public Person() {}
	
	public Person(String pname) {
		name = pname;  // 초기화
	}
//	public Person(String p) {
//		name = p;  // 초기화
//	}
//	
	
	public Person(float pheight) {
		height = pheight;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	
}
