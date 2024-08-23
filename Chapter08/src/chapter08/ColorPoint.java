package chapter08;
//Point 를 상속받은 ColorPoint 선언
public class ColorPoint extends Point {
	private String color;  // 점의 색 멤버변수
	
	public ColorPoint() {}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
