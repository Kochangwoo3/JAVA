package exception;

public class AutoCloseObjTest {

	public static void main(String[] args) {
		// try-with-resources문 (java 7) 과 강제예외발생
		
		//java9 에서 추가된 문법
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj){    //
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외부분입니다.");
		}

	}

}
