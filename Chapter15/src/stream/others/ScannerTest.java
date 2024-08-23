package stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// Scanner 클래스
		Scanner sc = new Scanner(System.in); 
		// new Scanner(File source);
		// Scanner(InputStream source);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("직업 : ");
		String job = sc.nextLine();
		System.out.print("사번 : ");
		int num = sc.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		sc.close();

	}

}
