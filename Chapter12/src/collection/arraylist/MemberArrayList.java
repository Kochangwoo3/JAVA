package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	// ArrayList 활용하기
	// 멤버변수
	private ArrayList<Member> arrayList; // 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
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
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId(); //
			if(tempId == memberId) {       // 멤버아이디 가 매개변수와 일치하면
				arrayList.remove(member);  // 해당 맴버를 삭제
				return true;               // true 반환
			}
		}
			
		System.out.println(memberId + "아이디가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(int position, Member member) {
		if(position < 1 || position > arrayList.size()+1) {
			System.out.println("지정 된 자리에 추가할 수 없습니다.");
			return;
		}
		// 여기에 코드를 작성하세요
		arrayList.add(position-1, member);
	}
}

