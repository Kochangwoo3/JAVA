package innerclass;

//class Person {
//	//메서드
//	public void introduce() {
//		System.out.println("사람입니다.");
//	}
//}

interface Personable {
	void introduce();
}

public class _01_AnonymousClass {

	public static void main(String[] args) {
//		Person person = new Person();
		Personable person = new Personable() {
			
			@Override
			public void introduce() {
				System.out.println("사람입니다.");
			}
		};
		
		person.introduce();
	}
	
/*
   public int add(int x, int y) {
   		return x + y;
   }
   // 간소한 식으로 표현 : 람다식	
 	
   (x, y) -> x + y;	
 */
	
	

}
