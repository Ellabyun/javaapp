package classTest;

public class AccountEx {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.account = "122-01-12222";
		account1.balance = 10000;
		account1.name = "������";
		
		account1.saving(50000);
		
		
		System.out.println("���� �ܾ� : "+account1.withdraw(30000));
		
	
	}

}
