package singleton;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany(); 
		}
		return instance;
	}
	
	public Card createCard() {
		Card card = new Card();  // 실행할때마다 일련번호 증가
		return card;
	}
	
}
