package singleton;

public class CardCompanyTest {

	public static void main(String[] args) {
		// 카드회사(싱글톤클래스) , 메서드(카드인스턴스)createCard
		CardCompany company = CardCompany.getInstance();
		
		Card newCard = company.createCard();
		System.out.println(newCard.getCardNumber());
		
		Card newCard1 = company.createCard();
		System.out.println(newCard1.getCardNumber());
		
		Card newCard2 = company.createCard();
		System.out.println(newCard2.getCardNumber());
		
	}

}
