package classTest;

public class AccountEx {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.account = "122-01-12222";
		account1.balance = 10000;
		account1.name = "변선정";
		
		account1.saving(50000);
		
		
		System.out.println("현재 잔액 : "+account1.withdraw(30000));
		
	
	}

}
