package classTest;

public class SubscriberInfo {
	//�Ӽ� - �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ�
	private String name;
	private String id;
	private String password;
	private String telNo;
	private String addr;
	
	//������ - �̸�, ���̵�, �н����常 �ʱ�ȭ�� �� �� ��ü ����
	//		- �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּҸ� �ʱ�ȭ �� �� ��ü ����
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public SubscriberInfo(String name, String id, String password, String telNo, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.telNo = telNo;
		this.addr = addr;
	}

	//��� - ��й�ȣ ����, ��ȭ��ȣ ����, �ּҺ���
	//setter �޼ҵ�

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	

	
	
	
}
