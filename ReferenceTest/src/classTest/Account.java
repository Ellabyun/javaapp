package classTest;

public class Account {
	//속성: 계좌번호(122-01-12222), 잔액, 이름
	
	String account;
	int balance;
	String name;
	
	//기본생성자
	Account(){
		
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
