package classTest;

public class Triangle3 {
	//�ﰢ�� ���� ���ϱ�
	//�غ�*����/2
	
	//�Ӽ�:�غ�, ����
	private int baseLine;
	private int height;
	
	//������ �����ε�
	Triangle3(int baseLine, int height) {
		this.baseLine = baseLine;
		this.height = height;
	}
	
	//���(�޼ҵ�): �غ�*����/2 ��� ����
	int getArea() {
		return baseLine * height /2;
	}
	

}
