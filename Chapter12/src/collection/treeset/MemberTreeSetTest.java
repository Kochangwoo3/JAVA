package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TreeSet 활용 테스트
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		Member park = new Member(1003, "박지원");
		Member lee = new Member(1001, "이지원");
		Member kang = new Member(1002, "강감찬");
		
		memberTreeSet.addMember(lee);
		memberTreeSet.addMember(kang);
		memberTreeSet.addMember(park);
		memberTreeSet.showAllMember();

	}

}
