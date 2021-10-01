package collection;

import java.util.LinkedList;
import java.util.List;

/* ArrayList vs LinkedList
 * - ���������� �߰�/���� �� ArrayList�� �� �� ����
 * - �߰� �����͸� �߰�/���� �� LinkedList�� �� �� ����
 * 
 */

public class ListEx4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		//�߰�
		list.add("apple");
		list.add("strawbery");
		list.add("cherry");
		list.add("mango");
		list.add("banana");
		list.add("peach");
		
		System.out.println(list);
	}
}
