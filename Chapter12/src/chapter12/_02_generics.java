package chapter12;

//class BoxInteger{   // 정수를 담을 수 있는 Box 클래스
//	int data;
//	public void setData(int data) {
//		this.data = data;
//	}
//	public int getData() {
//		return data;
//	}
//}
//
//class BoxString {
//	String data;
//	public void setData(String data) {
//		this.data = data;
//	}
//	public String getData() {
//		return data;
//	}
//}

// 모든 자료형을 담을수 있는 Box 클래스
class Box<T> {
	T data;
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
}

public class _02_generics {

	public static void main(String[] args) {
		// 클래스 제네릭스 연습
//		BoxInteger iBox = new BoxInteger();
//		iBox.setData(3);
//		//System.out.println(iBox.data);
//		
//		BoxString sBox = new BoxString();
//		sBox.setData("안녕");
		
		Box<Integer> iBox = new Box<Integer>();
		iBox.setData(3);
		System.out.println(iBox.data);
		
		Box<String> sBox = new Box<>();
		sBox.setData("안녕");
		System.out.println(sBox.data);

	}

}
