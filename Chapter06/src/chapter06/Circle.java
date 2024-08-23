package chapter06;

public class Circle {
	// 멤버변수, 필드, 속성
	int radius; 
	String name;
	// 생성자
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;  
		// this: 객체 자신에 대한 레퍼런스
	}
	// 메서드
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle ob1 = new Circle(1);  // ob1: 0x0050   radius : 1
		Circle ob2 = new Circle(2);  // ob2: 0x0077   radius : 2
		Circle s;
		
		s = ob2;   // s: 0x0077      [매우중요]   참조변수 값을 다른 참조변수의 값이 대입되면 
		System.out.println(s.radius);  // 2     객체 가 대입되는게 아니라 주소값이 대입
		
		ob1 = ob2;    //ob1 이 참조하고있는 인스턴스 가비지 가됨
		              // ob1 : 0077(ob2)
		
		System.out.println(ob1.radius);  // 2
		System.out.println(ob2.radius);  // 2
	}
	
	
}
