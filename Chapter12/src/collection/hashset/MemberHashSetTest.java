package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// HashSet 활용하기
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member lee = new Member(1001, "이순신");
		Member kim = new Member(1002, "김유신");
		Member kang = new Member(1003, "강감찬");
		Member hong = new Member(1004, "홍길동");

		memberHashSet.addMember(lee);
		memberHashSet.addMember(kim);
		memberHashSet.addMember(kang);
		memberHashSet.addMember(hong);
		memberHashSet.showAllMember();  //
		
		Member memberKang = new Member(1003, "강감찬");
		memberHashSet.addMember(memberKang);
		Member memberLee = new Member(1001, "이몽룡");
		memberHashSet.addMember(memberLee);
		memberHashSet.showAllMember();  // 
	}

}
