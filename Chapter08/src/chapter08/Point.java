package chapter08;

public class Point {
	private int x, y; // 한점을 구성하는 멤버변수

	public Point() {
		this.x = this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
