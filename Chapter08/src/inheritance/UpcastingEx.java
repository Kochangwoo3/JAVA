package inheritance;

public class UpcastingEx {

	public static void main(String[] args) {
		// 업캐스팅 예제 가시성
//		Person person;
//		Student student = new Student("이재문");
//		person = student;  // 업캐스팅
		
		Person person = new Student("이재문");
		
		System.out.println(person.name);  //오류없음
		
		// person.grade = "1학년";   // 컴파일오류
		// person.department = "Computer";  // 컴파일오류
	}

}
