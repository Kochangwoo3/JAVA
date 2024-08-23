package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// ArrayList 활용하기
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 새로운 회원 인스턴스 생성
		Member lee = new Member(1001, "이순신");
		Member son = new Member(1002, "손흥민");
		Member park = new Member(1003, "박찬호");
		Member hong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(lee);
		memberArrayList.addMember(son);
		memberArrayList.addMember(park);
		memberArrayList.addMember(hong);
		// 회원 입력 후 확인리스트
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(hong.getMemberId());
		// 회원 삭제 후 확인리스트
		memberArrayList.showAllMember();
		
//		// 특정위치 회원 추가
//		memberArrayList.insertMember(2, hong);
//		memberArrayList.showAllMember();
	}

}
