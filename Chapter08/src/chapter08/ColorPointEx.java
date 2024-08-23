package chapter08;

public class ColorPointEx {

	public static void main(String[] args) {
		// 점 x,y를 갖는 Point클래스와 
		// 상속받아 색을 가진 점을 표현하는 ColorPoint 클래스 테스트
//		Point p = new Point(); // Point 객체 생성
//		p.set(1, 2); 
//		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); // 하위객체
		cp.set(3,4);  //상위클래스 메서드 
		cp.setColor("red");
		cp.showColorPoint();

	}

}
