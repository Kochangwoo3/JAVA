package homework;

public class Member extends Health {
	// 멤버변수
	private double standardWeight; // 표준체중
	private double bmi;            // 비만도
	private String result;         // 비만도 체크 결과
	
	public Member(char gender, double height, double weight) {
		super(gender, height, weight);
		// 여기에 코드를 작성하세요
		// standardWeight 초기화 로직
		if(gender == 'M' || gender == 'm') {
			standardWeight = (height - 100) * 0.9;
		}else if(gender == 'F' || gender == 'f') {
			standardWeight = (height - 100) * 0.85;
		}else {
			standardWeight = 0;
		}
		
		checkObesity();
	}
	
	private void checkObesity() {
		bmi = weight / standardWeight * 100;
		
		// 여기에 코드를 작성하세요
		if (bmi <= 90) {
			result = "저체중";
		}else if (bmi <= 110) {
			result = "표준체중";
		}else if (bmi <= 120) {
			result = "과체중";
		}else if (bmi <= 130) {
			result = "경도비만";
		}else if (bmi <= 150) {
			result = "중도비만";
		}else {
			result = "고도비만";
		}
	}
	
	public void showObesityResult() {
		System.out.println("*** 비만도 Check ***");
		System.out.println("성별 : " + getGender());
		System.out.println("신장(cm) : " + getHeight());
		System.out.println("체중(kg) : " + getWeight());

		System.out.println("\n=> 표준체중 : " + standardWeight);
		System.out.println("\n=> 당신의 비만도는 " + (int) bmi + "%로 (" + result + ")입니다.\n");
	}
	
	public static void main(String[] args) {
		Member mem1  = new Member('F', 163.78, 52.74);
		Member mem2  = new Member('M', 178, 59);
		Member mem3  = new Member('M', 182, 108.3);
		
		mem1.showObesityResult();
		mem2.showObesityResult();
		mem3.showObesityResult();
	}
	
}
