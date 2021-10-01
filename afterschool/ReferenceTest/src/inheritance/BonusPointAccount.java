package inheritance;

public class BonusPointAccount extends Account2{
//���¹�ȣ, ������, �ܾ�, ���ʽ�����Ʈ / �Ա��ϴ�.(���ʽ� ����Ʈ �߰�) ����ϴ�,
	private int bonusPoint;

	public BonusPointAccount(String account, int balance, String name, int bonusPoint) {
		super(account, balance, name);
		this.bonusPoint = bonusPoint;
	}
	
	@Override
	void saving(int amount) {
		//�����ϴ�.
		super.saving(amount);
		//���ʽ�����Ʈ += ���ݾ��� 0.1% ���ʽ� ����Ʈ
		bonusPoint += amount*0.001;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
}
