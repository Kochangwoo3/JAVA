package finalex;

// 열거형  : 자료형
enum DayType {
	SUN, MON, TUE, WED, THU, FRI, SAT
}

public class UsingDefine {
	private DayType datatype;
	
	public UsingDefine(DayType dType) {
		this.datatype = dType;
	}
	

	public static void main(String[] args) {
		// 상수 클래스 사용하기
		System.out.println(Define.GOOD_MORNING);
		System.out.println("최소값: " + Define.MIN);
		System.out.println("최대값: " + Define.MAX);
		System.out.println("수학 코드는 " + Define.MATH );
		System.out.println("영어 코드는 " + Define.ENG );
		
		System.out.println(DayType.THU);  //Thursday
		
		UsingDefine ud = new UsingDefine(DayType.THU);
		
		
	}

}
