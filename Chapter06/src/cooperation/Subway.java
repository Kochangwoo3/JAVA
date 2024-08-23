package cooperation;

public class Subway {
	// 멤버 변수
	String lineNumber; // 노선
	int passengerCount;  //승객수
	int money;   //버스 수입	
	
	//생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}	
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println( lineNumber + "의 승객은 " + 
			passengerCount + "명이고, 수입은 "  + money + "입니다.");
	}
}
