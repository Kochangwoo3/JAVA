package collection.linkedlist;


import java.util.Iterator;
import java.util.LinkedList;

import collection.Member;

public class MemberLinkedList {
	// ArrayList 활용하기
	// 멤버변수
	private LinkedList<Member> linkedList; // 선언
	
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		linkedList.add(member);
	}
	
	// 회원 삭제
	public boolean removeMember(int memberId) {
//		for(int i=0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		Iterator<Member> ir = linkedList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId(); //
			if(tempId == memberId) {       // 멤버아이디 가 매개변수와 일치하면
				linkedList.remove(member);  // 해당 맴버를 삭제
				return true;               // true 반환
			}
		}
			
		System.out.println(memberId + "아이디가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(int position, Member member) {
		if(position < 1 || position > linkedList.size()+1) {
			System.out.println("지정 된 자리에 추가할 수 없습니다.");
			return;
		}
		// 여기에 코드를 작성하세요
		linkedList.add(position-1, member);
	}
}

