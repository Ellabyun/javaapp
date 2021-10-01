package classTest;

public class Account2 {
	//속성: 계좌번호(122-01-12222), 잔액, 이름
	
	private String account;
	private int balance;
	private String name;
	
	//생성자 작성
	//[우클릭] - source - generate constructor using fields => 일반생성자
	//[우클릭] - source - generate constructor using super class => default constructor

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
	//외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업시
	// set으로 시작
	
	// 멤버변수 : 계좌번호를 변경하고 싶다면?
	public void setAccount(String account) {
		this.account = account;
	} 
	
	// 이름을 변경하고 싶다면?
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	//멤버변수의 값을 리턴하고 싶다면?
	//get으로 시작하라
	public int getBalance() {
		return balance;
	}
	
	//기능: 입금한다.(입력값: 입금액, 반환값: 없음) => 현재잔액 +=입금액
	void saving(int amount) {
		 balance += amount;
	}
	
	int withdraw(int amount) {
		if(balance > amount) {
		  balance -= amount;
		}
		return balance;
	}
	//		출금한다.(입력값: 출금액, 반환값:현재잔액) => 현재잔액 -= 출금액

}
