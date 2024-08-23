package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		// 상속받은 인터페이스 구현한 MyClass 실습
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		System.out.println();
		
		Y yClass = mClass;
		yClass.y();
		System.out.println();
		
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		

	}

}
