package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		int i = 100;  // 지역변수
		
		StringConcat concat2 = (s, v) -> {
			// i = 200;
			System.out.println(i);
			System.out.println(s + ", " + v); 
		};
		// 람다식은 객체를 생성해줌
		concat2.makeString(s1, s2);
		
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2); 
			}
		};
		concat3.makeString(s1, s2);
		
	}

}
