package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		// 정적(static)변수 연습
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이순신");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " 학번:"+ studentLee.studentID);
		
		Student1 studentHong = new Student1();
		studentHong.setStudentName("홍길동");
		System.out.println(studentHong.serialNum);
		System.out.println(studentHong.studentName + " 학번:"+ studentHong.studentID);
		
	}

}
