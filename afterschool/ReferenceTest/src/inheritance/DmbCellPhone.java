package inheritance;

public class DmbCellPhone extends Cellphone {
	int channel;
	void turnOnDmb() {
		System.out.println("ä�� "+channel+"�� dmb ��� ����");
	}
	void turnOffDmb() {
		System.out.println("ä�� "+channel+"�� dmb ��� ����");
	}	
	void changeChannelDmb() {
		System.out.println("ä�� "+channel+"�� ����");
	}	
}
