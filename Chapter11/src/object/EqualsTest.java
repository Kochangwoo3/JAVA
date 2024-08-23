package object;

class Student{
	int studentID;
	String studentName;
	// 참조변수 출력 시 학생의 이름과 학번이 출력되도록 여기에 코드를 작성해보세요
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentName + "(" + studentID + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
//			if(this.studentID == std.studentID) {
//				return true;
//			}else {
//				return false;
//			}
			return (this.studentID == std.studentID);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;
	}	
	
}

public class EqualsTest {
	public static void main(String[] args) {
		// equals 재정의 연습 : 논리적으로 같게 처리를 하고 싶을때 재정의
		Student lee = new Student(100, "이순신");
		Student lee2 = lee;   // 주소복사
		Student sunsin = new Student(100, "이순신");
		
		System.out.println("lee의 hashCode : " + lee.hashCode());
		System.out.println("sunsin의 hashCode : " + sunsin.hashCode());
		
		System.out.println("lee의 실제주소값 : " + System.identityHashCode(lee));
		System.out.println("sunsin의 실제주소값 : " + System.identityHashCode(sunsin));
		
		
		
//		//동일한 주소의 두 인스턴스 비교
//		if(lee == lee2) {
//			System.out.println("lee와 lee2의 주소는 같습니다.");
//		}else {
//			System.out.println("lee와 lee2의 주소는 다릅니다.");
//		}
//		if(lee.equals(lee2)) {
//			System.out.println("lee와 lee2의 주소는 같습니다.");
//		}else {
//			System.out.println("lee와 lee2의 주소는 다릅니다.");
//		}
//		
//		// 동일인이지만 인스턴스의 주소가 다른 경우
//		if(lee == sunsin) {   // ==
//			System.out.println("lee와 sunsin의 주소는 같습니다.");
//		}else {
//			System.out.println("lee와 sunsin의 주소는 다릅니다.");
//		}
//		if(lee.equals(sunsin)) { 
//			System.out.println("lee와 sunsin의 동일합니다.");  // 재정의
//		}else {
//			System.out.println("lee와 sunsin의 동일하지 않습니다.");
//		}
		
		

	}

	
	
	
	
	
	
	
	
}
