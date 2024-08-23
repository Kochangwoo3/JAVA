package generics;

import java.util.ArrayList;

public class GenericMethod {

	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		//double left = (double)p1.getX();   // 0
		double bottom = ((Number)p1.getY()).doubleValue(); // 0.0
		
		double right = ((Number)p2.getX()).doubleValue();  // 10
		//double right = (double)p2.getX();
		double top = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = top - bottom;
		
		return width * height;
	}
	
	public static double makeRect(Double p1, Double p2) {
		
		double width = p1;
		double height = p2;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		// 제네릭 메서드 구현하기
		// 왼쪽하단 left bottom
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		// 우측상단 right top
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다." );
		
		ArrayList<String> list = new ArrayList<String>();
		String str = new String("abc");
		list.add(str);
		String s = list.get(0);
		System.out.println(s);
		
		
		
	}

}
