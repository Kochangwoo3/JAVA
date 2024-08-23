package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// HashSet Test하기
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("이순신"));
		boolean k = hashSet.add(new String("김유신"));
		System.out.println(k);  // true
		hashSet.add(new String("신사임당"));
		hashSet.add(new String("이율곡"));
		hashSet.add(new String("강감찬"));
		boolean s = hashSet.add(new String("김유신"));
		System.out.println(s);  // false
		
		System.out.println(hashSet);
	}

}
