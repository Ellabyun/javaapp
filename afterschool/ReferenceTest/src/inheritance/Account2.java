package inheritance;

public class Account2 {

	
	private String account;
	private int balance;
	private String name;
	

	public Account2() {
		super();
		
	}
	
	public Account2(String account, int balance, String name) {
		super();
		this.account = account;
		this.balance = balance;
		this.name = name;
	}
	public Account2(String account, String name) {
		super();
		this.account = account;
		this.name = name;
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
