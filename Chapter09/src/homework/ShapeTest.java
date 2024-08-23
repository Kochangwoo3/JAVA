package homework;

abstract class Shape {
	public abstract double calculateArea();
}
/*
 *  Rectangle :  length * width;
 *  Circle:  Math.PI * radius * radius;
 *  Trapezoid: 0.5 * (base1 + base2) * height;
 */
/*2. Shape를 상속받는 **사각형 클래스, 원 클래스, 사다리꼴 클래스**를 각각 설계한다.
    각 도형 클래스는 추상 클래스의 메서드를 오버라이드해서 해당 도형의 면적을 계산한다.
*/
class Rectangle extends Shape {
	double length;
	double width;
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	@Override
	public double calculateArea() {
		// 사각형 면적 재정의
		return length * width;
	}

}

class Circle extends Shape {
	double radius;

	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		// 원 면적 재정의
		return Math.PI * radius * radius;
	}

}

class Trapezoid extends Shape {
	double base1;
	double base2;
	double height;
	
	Trapezoid(double base1, double base2, double height){
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		// 사다리꼴 면적 재정의
		return 0.5 * (base1 + base2) * height;
	}

}


public class ShapeTest {

	public static void main(String[] args) {
		// Shape shape = new Shape();
		Shape rectangle = new Rectangle(5.0, 3.0);
		Shape circle = new Circle(4.0);
		Shape trapezoid = new Trapezoid(6.0, 8.0, 4.0);

		System.out.printf("Rectangle area: %.2f\n", rectangle.calculateArea());
		System.out.printf("Circle area: %.2f\n", circle.calculateArea());
		System.out.printf("Trapezoid area: %.2f\n", trapezoid.calculateArea());
	}

}
