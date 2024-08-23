package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	// 입력값 Validation 체크
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자이상 20자 이하로 쓰세요");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		// 사용자 정의 예외 테스트
		IDFormatTest test = new IDFormatTest();

		// 아이디값이 null인경우
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

		// 아이디값이 7자인경우
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	
	
	
	
	
	
}
