package chapter06;

public class Book {
	// 멤버변수
	String title;
	String author;
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	// 생성자
	public Book(String title) {
		this(title, "작자 미상");
//		this.title = title;
//		this.author = "작자 미상";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
		
	public static void main(String[] args) {
		// 생성자 선언 및 활용 연습
		Book littlePrince = new Book("어린왕자", "생텍쥐베리"); // 생성자 이용  멤버변수 초기화
		Book loveStory = new Book("춘향전");
//		System.out.println(littlePrince.title + " " + littlePrince.author);
//		System.out.println(loveStory.title + " " + loveStory.author);
		Book emptyBook = new Book();
		loveStory.show();
		littlePrince.show();
	}

}
