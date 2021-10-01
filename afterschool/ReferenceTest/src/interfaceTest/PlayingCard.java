package interfaceTest;

public interface PlayingCard {
	int SPADE = 4;//public static final을 안 붙여도 상수가 됨
	final int DIAMOND = 3; //public static final을 안 붙여도 상수가 됨
	static int HEART = 2;//public static final을 안 붙여도 상수가 됨
	
	public abstract String getCardNumber();//public abstract 생략가능
	String getCardKind();//public abstract 생략가능

}
