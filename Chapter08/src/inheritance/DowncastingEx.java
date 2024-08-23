package inheritance;

public class DowncastingEx {

	public static void main(String[] args) {
		Person person  = new Student("이재문");  // 업캐스팅
		Student student = (Student)person;  // 다운 캐스팅
		
		System.out.println(student.name);
		student.grade ="1학년";
		
	}

}
