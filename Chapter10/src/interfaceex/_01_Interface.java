package interfaceex;


interface Shape{
	double PI = 3.1415926535; // public static final 생략
	
	double getArea();  //public abstract 생략
	double getCircumference();
}

class Circle implements Shape {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return PI * radius * radius ;
	}

	@Override
	public double getCircumference() {
		return 2 * PI * radius;
	}
}

class Rectangle implements Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}
	
}

public class _01_Interface {

	public static void main(String[] args) {
		// Shape shape = new Shape();  인터페이스는 인스턴스 생성 불가
		// 인터페이스 연습
//		Circle cle = new Circle(5);
//		System.out.println("원 넓이는 " + cle.getArea());
//		
//		Rectangle rec = new Rectangle(3, 5.6);
//		System.out.println("사각형 넓이는 " + rec.getArea());
//		
		Shape sha;  // 상위 인터페이스 타입 선언
	
		sha = new Circle(5);
		System.out.println("원 넓이는 " + sha.getArea());
		System.out.println("원 둘레는 " + sha.getCircumference());
		
		sha = new Rectangle(3, 5.6);
		System.out.println("사각형 넓이는 " + sha.getArea());
		System.out.println("사각형 둘레는 " + sha.getCircumference());
	}

}
