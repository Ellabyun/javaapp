package test;

public class TypeTest1 {

	public static void main(String[] args) {
		// Ÿ�� - 1) �⺻Ÿ��  2) ����Ÿ��
		// ������ �޸� ���Ǵ� ����� �޶���
		
		//�⺻Ÿ�� => stack�� ����
		int age = 25;
		double price = 200.3;
		
		
		//����Ÿ�� => heap�� ���� / null�� �ʱ�ȭ / 
		//���ڿ� ���� : String name1 = new String("java");
		String name = "java";
		String name1 = new String("java");
		String hobby = null;// ���� �� ������ �Ҵ���� ������
		
		// �� �� ==, !=
		//			equals()
		System.out.println(name == name1 ? "������" : "�ٸ�");
		//=> stack�� �Էµ� �ּҸ� ���ϴ� ���ϻ���
		System.out.println(name.equals(name1) ? "������" : "�ٸ�");
		//=> heap���� ���� ������ ��
		System.out.println(hobby);
		// java.lang.NullPointerException
		System.out.println(hobby.length());
	}

}
