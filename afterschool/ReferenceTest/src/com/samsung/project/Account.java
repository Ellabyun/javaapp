package com.samsung.project;

public class Account {
	//속성: 계좌번호(122-01-12222), 잔액, 이름
	
	private String account;
	private int balance;
	private String name;
	
	//기본생성자
	
	public Account(String account, int balance, String name) {
		super();
		this.account = account;
		this.balance = balance;
		this.name = name;
	}
	

	//기능: 입금한다.(입력값: 입금액, 반환값: 없음) => 현재잔액 +=입금액
	public void saving(int amount) {
		 balance += amount;
	}
	

	public int withdraw(int amount) {
		if(balance > amount) {
		  balance -= amount;
		}
		return balance;
	}
	//		출금한다.(입력값: 출금액, 반환값:현재잔액) => 현재잔액 -= 출금액

}
