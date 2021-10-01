package inheritance;

public class CheckingAccount extends Account2 {
	// ���¹�ȣ, ������, �ܾ� => �θ�
	//�Ա��ϴ�, ����ϴ� => �θ�,
	
	//ī���ȣ
	private String cardNo;

	public CheckingAccount(String account, int balance, String name, String cardNo) {
		super(account, balance, name);
		this.cardNo = cardNo;
	}
	
	//�Է°� : ī���ȣ, ���ݾ�
	//��ȯ�� : ����(int)
	//ī�尪�� �����Ѵ�.(�Ѿ�� ī���ȣ�� ���� �߱޵� ī���ȣ�� ������, 
	//				���޾��� ���� �ܾ׺��� ������ Ȯ���� ��)
	int pay(String cardNo, int amount) {
		
		if(!cardNo.equals(this.cardNo) || getBalance() < amount) {
			System.out.println("ī���ȣ�� ���ݾ��� Ȯ���� �ּ���");
			return 0;
		}
		//�ܾ� = �����ܾ� = ī�����
		//setBalance(getBalance()-amount);
		//�θ��� withdraw�� ������ ��ɰ� ����
		//���� �ٽ� ������ ���� �θ��� withdraw�� ȣ��
		return withdraw(amount);
	}
}
