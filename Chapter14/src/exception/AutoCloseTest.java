package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// try-with-resources문 사용하기 
		try(AutoCloseObj obj = new AutoCloseObj()){
			
		}catch(Exception e) {
			System.out.println("예외부분입니다.");
		}

	}

}
