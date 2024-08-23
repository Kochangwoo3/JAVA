package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		// 클래스이름으로 static변수 참조하기
		// static 변수는 클래스 이름으로 직접 참조합니다.
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이순신");
		// serialNum 변수를 직접 클래스이름으로 참조가능
		System.out.println(Student2.getSerialNum());  // 1001
		System.out.println(studentLee.studentName + " 학번:"+ studentLee.studentID);
		
		Student2 studentHong = new Student2();
		studentHong.setStudentName("홍길동");
		System.out.println(Student2.getSerialNum());  // 1002
		System.out.println(studentHong.studentName + " 학번:"+ studentHong.studentID);
		
	}

}
