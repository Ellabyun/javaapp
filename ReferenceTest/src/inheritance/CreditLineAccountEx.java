package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		CreditLineAccount credit = new CreditLineAccount("123-12",10000,"Andrew",1000000);

		credit.withdraw(1500000);//사용금액 한도 초과
		System.out.println(credit.withdraw(800000));//-790000
		
	}

}
