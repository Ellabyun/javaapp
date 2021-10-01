package classTest;

public class Account3 {
	//�Ӽ�: ���¹�ȣ(122-01-12222), �ܾ�, �̸�
	
	private String account;
	private int balance;
	private String name;
	
	//������ �ۼ�
	//[��Ŭ��] - source - generate constructor using fields => �Ϲݻ�����
	//[��Ŭ��] - source - generate constructor using super class => default constructor

	public Account3() {
		super();
		
	}
	
	public Account3(String account, String name) {
		super();
		this.account = account;
		this.name = name;
	}
	
	public Account3(String account, int balance, String name) {
//		super();
//		this.account = account;
//		this.name = name;
		this(account,name); //this() : �ٸ� ������ ȣ��
		this.balance = balance;
	}
	
	//�ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾���
	// set���� ����
	
	// ������� : ���¹�ȣ�� �����ϰ� �ʹٸ�?
	public void setAccount(String account) {
		this.account = account;
	} 
	
	// �̸��� �����ϰ� �ʹٸ�?
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	//��������� ���� �����ϰ� �ʹٸ�?
	//get���� �����϶�
	public int getBalance() {
		return balance;
	}
	
	public String getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}
	
	//���: �Ա��Ѵ�.(�Է°�: �Աݾ�, ��ȯ��: ����) => �����ܾ� +=�Աݾ�
	void saving(int amount) {
		 balance += amount;
	}
	
	int withdraw(int amount) {
		if(balance > amount) {
		  balance -= amount;
		}
		return balance;
	}
	//		����Ѵ�.(�Է°�: ��ݾ�, ��ȯ��:�����ܾ�) => �����ܾ� -= ��ݾ�

}
