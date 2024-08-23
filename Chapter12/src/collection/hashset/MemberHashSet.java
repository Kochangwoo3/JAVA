package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.*;
import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;  // 멤버변수 선언

	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);  // 회원추가
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId ==  memberId) { // 같은 아이디인경우
				hashSet.remove(member);  // 회원 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다." );
		return false;
	}
	
	public void showAllMember() {   // 모든 회원 출력
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
