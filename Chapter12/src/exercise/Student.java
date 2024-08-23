package exercise;

public class Student extends Object {
	String id;
	String name;
 	
	// 생성자
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
//	// equals, hashCode 재정의
//	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return (this.id == std.id);
		}
		return false;
	}
//	
	@Override
	public int hashCode() {
		return Integer.parseInt(this.id);
	}


	@Override
	public String toString() {
		return id + ":" + name;
	}
}
