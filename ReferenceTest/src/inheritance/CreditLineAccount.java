package inheritance;

public class CreditLineAccount extends Account2 {
	//계좌번호, 계좌주, 잔액, 마이너스한도/입금하다, 출금하다
	private int creditLine; //마이너스 한도

	public CreditLineAccount(String account, int balance, String name, int creditLine) {
		super(account, balance, name);
		this.creditLine = creditLine;
	}

	
	// 출금하다 오버라이딩
	// 원기능(부모기능): 잔액=잔액-출금액
	// 자식 : 잔액(현재잔액+마이너스 한도) - 출금액
	@Override
	int withdraw(int amount) {
		// 현재잔액+마이너스한도필드보다 사용금액이 많으면 인출불가, 0을 리턴
		if(amount > getBalance()+creditLine) {
			System.out.println("인출이 불가합니다");
			return 0;
		}
		setBalance(getBalance()-amount);
		//잔액(현재잔액+마이너스 한도) - 출금액
		return getBalance();
	}
}
