package classTest;

public class Account {
	//�Ӽ�: ���¹�ȣ(122-01-12222), �ܾ�, �̸�
	
	String account;
	int balance;
	String name;
	
	//�⺻������
	Account(){
		
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
