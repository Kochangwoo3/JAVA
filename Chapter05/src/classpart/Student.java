package classpart;

public class Student {
	//멤버 변수  :  속성
	private int studentID;  //학번
	private String studentName;   //학생이름
	private int grade;  //학년
	private String address;
	
//	Student(){}  // 기본 생성자
	
	//메서드 : 기능
	public void showStudentInfo() {
		System.out.println(studentName + "," + address );
	}
	// 메소드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
//	public static void main(String[] args) {
//		Student studentLee = new Student();
//		studentLee.studentName = "이순신";
//		studentLee.address = "통영";
//	
//		studentLee.showStudentInfo();
//	}
}
