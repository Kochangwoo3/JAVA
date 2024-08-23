package chapter10;

interface Shape{
	double PI = 3.1415926535; // public static final 생략
	
	double getArea();  //public abstract 생략
	double getCircumference();
}

interface Resizeable{
	void resize(double factor); // public abstract 생략
}
// 동그라미 클래스 
// 인터페이스는 두개이상도 구현이 가능하다.
class Circle implements Shape, Resizeable {
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
	
	@Override
	public void resize(double factor) {
		radius = radius * factor; // radius *= factor;
	}
}
// 사각형 클래스
class Rectangle implements Shape, Resizeable{
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
	
	@Override
	public void resize(double factor) {
		width = width * factor;  // width *= factor
		height *= factor;
	}
	
}

public class _02_Interface {

	public static void main(String[] args) {
		// 인터페이스 연습
		System.out.println("PI = " + Shape.PI);
		// 동그라미
		Shape shape; // 부모의 참조 변수
		shape = new Circle(5); // 부모의 참조변소로 자식 인스턴스를 참조 가능
		System.out.println("원넓이: " + shape.getArea());
		System.out.println("원둘레: " + shape.getCircumference());
		
		// Circle클래스가 Shape와 Resizeable동시에 구현했기때문에
		//  다운캐스팅 할때 Resizeable 형태로 형변환 가능
		Resizeable res = (Resizeable)shape;
		res.resize(8);
		System.out.println("변경된 원넓이: " + shape.getArea());
		System.out.println("변경된 원둘레: " + shape.getCircumference());
		
		System.out.println();
		shape = new Rectangle(3, 5); // 부모의 참조변수 자식 인스턴스를 참조가능
		System.out.println("사각형 넓이: " + shape.getArea());
		System.out.println("사각형 둘레: " + shape.getCircumference());
	
		
		((Resizeable)shape).resize(5);
		System.out.println("변경된 사각형 넓이: " + shape.getArea());
		System.out.println("변경된 사각형 둘레: " + shape.getCircumference());
	
		
	}

}
