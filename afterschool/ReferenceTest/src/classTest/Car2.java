package classTest;

public class Car2 {
	// �Ӽ� : ����ȸ��, ��, ����, �ִ뽺�ǵ�...
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//������ - Ŭ���� �̸��� ����/���� Ÿ�� ����/�ߺ� ����(������ �����ε�)
	//���� - �ʵ忡 �ʱⰪ�� ����/��ü �����ϸ鼭 �غ��ؾ� �ϴ� �۾� ����
	Car2(){
		System.out.println("Car2 �⺻ ������");
	}
	//��ȣ ���� ������ �޶�� ��(Ÿ���� �޶�� ��)
	Car2(String model){
		System.out.println("Car2 �⺻ ������ - model �ʱ�ȭ");
	}
	Car2(String model, String color){
		System.out.println("Car2 �⺻ ������ - model,color �ʱ�ȭ");
	}
	Car2(String company, String model, String color, int maxSpeed){
		System.out.println("Car2 �⺻ ������ - �Ӽ� ��� �ʱ�ȭ");
	}
	
	
	
	// ����: �����ϰ�, �����ϴ�
	void forward() {
		System.out.println("�����ϴ�");
	}
	void backward() {
		System.out.println("�����ϴ�");
	}
}
