package review;

public class _01_TypeConversion {

	public static void main(String[] args) {
		// 타입 변환 이해를 위한 예제
		System.out.println(10/4);
		System.out.println(10/4.0);
		System.out.println((char)0x12340041);  //4byte -> 2byte   0x0041 -> 65 -> A
		byte b = 0;  // -128 -127 -126  ....-29.  ~ 127  [128(1) 129(2) 130(3)
		b = (byte)128;// 128  129  130
		              // 1     2   3
		System.out.println(b);
		System.out.println((int)2.9 + 1.8);  // 2 + 1.8 = 3.8
		System.out.println((int)(2.9 + 1.8));  // (int)4.7  = 4
	}

}
