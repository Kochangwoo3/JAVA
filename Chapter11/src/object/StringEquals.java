package object;

public class StringEquals {

	public static void main(String[] args) {
		// String 또는 Integer 과같은 래퍼클래스는 equals 를 재정의 
		String str = null;
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
//		System.out.println(str1 == str2);   // 주소 false
		System.out.println(str1.equals(str2));  // 논리적문자열 같음 true
//		//System.out.println(str.equals("이순신"));
//		System.out.println("이순신".equals(str));  // 실무팁
//		
		System.out.println();
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
//		System.out.println(i1 == i2);   //false
		System.out.println(i1.equals(i2));  // true
		
	}

}
