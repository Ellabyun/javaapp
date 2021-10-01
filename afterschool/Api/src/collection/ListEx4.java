package collection;

import java.util.LinkedList;
import java.util.List;

/* ArrayList vs LinkedList
 * - 순차적으로 추가/삭제 시 ArrayList가 좀 더 빠름
 * - 중간 데이터를 추가/삭제 시 LinkedList가 좀 더 빠름
 * 
 */

public class ListEx4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		//추가
		list.add("apple");
		list.add("strawbery");
		list.add("cherry");
		list.add("mango");
		list.add("banana");
		list.add("peach");
		
		System.out.println(list);
	}
}
