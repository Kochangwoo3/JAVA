package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		// ArrayList 활용하기
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		// 새로운 회원 인스턴스 생성
		Member lee = new Member(1001, "이순신");
		Member son = new Member(1002, "손흥민");
		Member park = new Member(1003, "박찬호");
		Member hong = new Member(1004, "홍길동");
		
		memberLinkedList.addMember(lee);
		memberLinkedList.addMember(son);
		memberLinkedList.addMember(park);
		memberLinkedList.addMember(hong);
		// 회원 입력 후 확인리스트
		memberLinkedList.showAllMember();
		
		memberLinkedList.removeMember(hong.getMemberId());
		// 회원 삭제 후 확인리스트
		memberLinkedList.showAllMember();
		
//		// 특정위치 회원 추가
//		memberArrayList.insertMember(2, hong);
//		memberArrayList.showAllMember();
	}

}
