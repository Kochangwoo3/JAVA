package homework;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import collection.Member;

class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student other) {
		// 1. 여기에 코드를 작성해보세요
		// return this.score - other.score;
		// return other.score - this.score;
		return Integer.compare(this.score, other.score);
	}
	
	@Override
	public String toString() {
		return  name + " " + score;
	}
	
}

public class TreeSetTest {

	public static void main(String[] args) {
		// TreeSet 실습예제
		Scanner in = new Scanner(System.in);
		Set<Student> students = new TreeSet<>(); 
		
		System.out.println("학생 이름과 성적을 입력하세요.");
		// 공백 입력 시 반복문 빠져나옴
		while (true) {
			System.out.print("이름과 성적 입력(공백 구분): ");
			String input = in.nextLine();
			if (input.isEmpty()) {
				break;
			}
			String[] tokens = input.split(" "); 
			// 문자열을 구분자로 나누어 배열을 만들어주는 메서드  
			//ex. 고길동 98 ->    tokens[0] = "고길동"  tokens[1] = "98"
			
			String name = tokens[0];
			int score = Integer.parseInt(tokens[1]);
			// 여기에 학생 TreeSet(students)에 추가
			// 2. 코드를 작성해보세요
			students.add(new Student(name, score));
		
		}
		
		// 3. 출력 [성적순] 하는 코드를 작성하세요
		for(Student student : students) {
			System.out.println(student);
		}
		
		// 4. 특정 성적 범위 출력
		System.out.print("몇 점 이상인 학생만 출력하시겠습니까? ");
		int minScore = in.nextInt();
		
		System.out.println("[ " + minScore + " 점 이상인 학생 출력 ]" );
		for(Student student : students) {
			if(student.getScore() >= minScore) {
				System.out.println(student);
			}
		}
		
		in.close();
		
	}

}
