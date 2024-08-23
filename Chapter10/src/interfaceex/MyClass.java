package interfaceex;

public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()재정의");
	}

	@Override
	public void y() {
		System.out.println("y()재정의");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()구현");
	}

}
