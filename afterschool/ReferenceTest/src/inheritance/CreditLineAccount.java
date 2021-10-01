package inheritance;

public class CreditLineAccount extends Account2 {
	//���¹�ȣ, ������, �ܾ�, ���̳ʽ��ѵ�/�Ա��ϴ�, ����ϴ�
	private int creditLine; //���̳ʽ� �ѵ�

	public CreditLineAccount(String account, int balance, String name, int creditLine) {
		super(account, balance, name);
		this.creditLine = creditLine;
	}

	
	// ����ϴ� �������̵�
	// �����(�θ���): �ܾ�=�ܾ�-��ݾ�
	// �ڽ� : �ܾ�(�����ܾ�+���̳ʽ� �ѵ�) - ��ݾ�
	@Override
	int withdraw(int amount) {
		// �����ܾ�+���̳ʽ��ѵ��ʵ庸�� ���ݾ��� ������ ����Ұ�, 0�� ����
		if(amount > getBalance()+creditLine) {
			System.out.println("������ �Ұ��մϴ�");
			return 0;
		}
		setBalance(getBalance()-amount);
		//�ܾ�(�����ܾ�+���̳ʽ� �ѵ�) - ��ݾ�
		return getBalance();
	}
}
