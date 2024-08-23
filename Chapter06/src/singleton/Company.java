package singleton;

public class Company {
	// 인스턴스 1개만 생성 사용
	// 클래스변수
	private static Company instance = new Company();
	// 생성자
	private Company() {}
	// 클래스메서드
	public static Company getInstance() {
		if(instance == null) {
			instance =  new Company();
		}
		return instance;
	}
	
}
