package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		// hashCode() 확인, equals() =>둘 다 같다면 저장하지 않는다.
		set.add(new Member("hong123", "hong123", "홍길동"));
		set.add(new Member("hong124", "hong123", "홍길동"));
		set.add(new Member("hong125", "hong123", "홍길동"));
		set.add(new Member("hong123", "hong123", "홍길동"));

		for(Member member:set) {
			System.out.println(member+" "+member.hashCode());
		}
	}

}
