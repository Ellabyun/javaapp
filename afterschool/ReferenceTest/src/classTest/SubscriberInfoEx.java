package classTest;

public class SubscriberInfoEx {

	public static void main(String[] args) {
		
		SubscriberInfo subscriber1 = new SubscriberInfo("ȫ�浿", "hong", "1234");
		SubscriberInfo subscriber2 = new SubscriberInfo("������", "spring", "1234", "010-0989-5858", "����" );
		
		
		//��ȭ��ȣ ����
		subscriber1.setTelNo("010-4566-3423");
		
		//�ּҺ���
		subscriber2.setAddr("����");

	}

}
