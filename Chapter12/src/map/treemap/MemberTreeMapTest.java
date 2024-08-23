package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		// 새로운 회원 인스턴스 생성
		Member lee = new Member(1001, "이순신");
		Member son = new Member(1002, "손흥민");
		Member park = new Member(1003, "박찬호");
		Member hong = new Member(1004, "홍길동");
		
		memberTreeMap.addMember(son);
		memberTreeMap.addMember(park);
		memberTreeMap.addMember(lee);
		memberTreeMap.addMember(hong);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}

}
