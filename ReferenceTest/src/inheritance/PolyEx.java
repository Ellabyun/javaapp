package inheritance;

public class PolyEx {

	public static void main(String[] args) {
		
		Parent2 p2 = new Child3();//��ĳ����, ����ȯ �ʿ����
		
		p2.field1="";
		p2.method1();
		p2.method2();//�������̵� �� ���¶�� �ڽ� Ŭ������ �޼ҵ尡 ȣ���
		
		//method3 ��� ȣ��?
		
		Child3 c =(Child3) p2;
		c.method3();
		
		Parent2 obj = new Parent2();
		Child3 c2 = (Child3) obj;//java.lang.ClassCastException
		c2.method3();

	}

}