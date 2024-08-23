package thisex;

class Person {
	// 멤버변수 = 필드
	String name;
	int age;
	// 생성자 
	Person() {
		//System.out.println(); //반드시 생성자 코드의 제일 처음에 this 수행
		this("이름 없음", 1);   // 2. this 다른 생성자 호출가능: 메서드호출 시
	}
	Person(String name, int age) {
		// 1. this : 자신의 메모리 주소 참조 : 매개변수 이름과 멤버변수 이름이 동일할때
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		// 3. 자신의 주소를 반환하는 this : 자신의 레퍼런스를 반환할때
		return this;  // 6504e3b2
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// this로 다른 생성자 호출하기
//		Person noName;
//		noName = new Person();
		
		Person noName = new Person();      // this: 6504e3b2
		System.out.println(noName.name);  //이름 없음
		System.out.println(noName.age);   // 1
		
		Person person = noName.returnItSelf();   // 6504e3b2
		System.out.println(person);
		
		System.out.println(noName);
		
		
	}

}
