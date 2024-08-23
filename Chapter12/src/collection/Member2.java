package collection;

import java.util.Comparator;

// Comparable 인터페이스 구현
public class Member2 implements Comparator<Member2>{
	private int memberId;      // 회원 아이디
	private String memberName; // 회원 이름
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개변수로 받은 객체를 회원으로변경해서 
		// 회원아이디 자신의 아이디와 같으면 같다고 true 리턴
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			return (this.memberId == member.memberId);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// 회원아이디로 반환
		return memberId;
	}

	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		// 전달받은 두 매개변수 비교
		return mem1.getMemberId() - mem2.getMemberId();
	}
	
}
