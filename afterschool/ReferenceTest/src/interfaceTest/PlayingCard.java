package interfaceTest;

public interface PlayingCard {
	int SPADE = 4;//public static final�� �� �ٿ��� ����� ��
	final int DIAMOND = 3; //public static final�� �� �ٿ��� ����� ��
	static int HEART = 2;//public static final�� �� �ٿ��� ����� ��
	
	public abstract String getCardNumber();//public abstract ��������
	String getCardKind();//public abstract ��������

}
