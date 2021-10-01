package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount("122-12",200000,"홍길동","122-12-133");
	
		//카드번호 안 맞는 경우
		//System.out.println(checkingAccount.pay("322-12", 20000));
		
		//카드번호 맞는 경우
		System.out.println(checkingAccount.pay("122-12-133", 20000));
		
	
	}

}
