package com.samsung.project;

public class Account {
	//�Ӽ�: ���¹�ȣ(122-01-12222), �ܾ�, �̸�
	
	private String account;
	private int balance;
	private String name;
	
	//�⺻������
	
	public Account(String account, int balance, String name) {
		super();
		this.account = account;
		this.balance = balance;
		this.name = name;
	}
	

	//���: �Ա��Ѵ�.(�Է°�: �Աݾ�, ��ȯ��: ����) => �����ܾ� +=�Աݾ�
	public void saving(int amount) {
		 balance += amount;
	}
	

	public int withdraw(int amount) {
		if(balance > amount) {
		  balance -= amount;
		}
		return balance;
	}
	//		����Ѵ�.(�Է°�: ��ݾ�, ��ȯ��:�����ܾ�) => �����ܾ� -= ��ݾ�

}
