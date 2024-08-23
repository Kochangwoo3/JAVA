package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// 정적(static)변수 연습
		Student studentLee = new Student();
		studentLee.setStudentName("이순신");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++; 
		System.out.println(studentLee.serialNum);
		
		
		Student studentHong = new Student();
		studentHong.setStudentName("홍길동");
		System.out.println(studentHong.serialNum);
	}

}
