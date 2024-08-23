package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		// 새로운 회원 인스턴스 생성
		Member lee = new Member(1001, "이순신");
		Member son = new Member(1002, "손흥민");
		Member park = new Member(1003, "박찬호");
		Member hong = new Member(1004, "홍길동");
		
		memberHashMap.addMember(lee);
		memberHashMap.addMember(son);
		memberHashMap.addMember(park);
		memberHashMap.addMember(hong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
		
	}

}
