package classTest;

public class Car {
	// �Ӽ� : ����ȸ��, ��, ����, �ִ뽺�ǵ�...
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//Car(){} => �⺻������(default constructor)
	//Ŭ���� ���� ����� �����ڰ� �ϳ��� ������
	//�����Ϸ��� �ڵ����� �⺻ �����ڸ� �������
	
	// ����(method): �����ϰ�, �����ϴ�
	// ����Ÿ�� �޼ҵ��(){}
	// ����Ÿ�� �޼ҵ��(Ÿ�� ������,...){}
	void forward() {
		System.out.println("�����ϴ�");
	}
	void backward() {
		System.out.println("�����ϴ�");
	}
}
