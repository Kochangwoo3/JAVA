package review;

public class MyDateTest {

	public static void main(String[] args) {
		// 정보은닉 실습
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		
		MyDate date2 = new MyDate(30, 4, 2024);
		System.out.println(date2.isValid());

		
		
	}

}
