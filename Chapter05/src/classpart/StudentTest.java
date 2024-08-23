package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// A a = new A();
//		studentLee.studentName = "이순신";
//		studentLee.address = "통영";
		studentLee.setStudentName("이순신");
		System.out.println(studentLee.getStudentName());
		
		Student studentKim = new Student();
		studentKim.setStudentName("김유신");
		System.out.println(studentKim.getStudentName());
	
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}
}
