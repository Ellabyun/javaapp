package poly;

public class PolyArgumentEx {

	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		
		buyer.buy(new Tv(100));
		buyer.buy(new Computer(150));
		buyer.buy(new Audio(50));
		
		System.out.println("현재남은돈 : " +buyer.money);
		System.out.println("현재보너스 포인트 : " +buyer.bonusPoint);

	}

}
