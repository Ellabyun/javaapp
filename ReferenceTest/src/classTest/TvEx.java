package classTest;

public class TvEx {

	public static void main(String[] args) {
		
		// ��ü ����, ����
		TV tv = new TV();
		System.out.println(tv);
		
		// ��ü ����
		tv.power = true;//on
		tv.channel = 2;
		
		tv.channelUp();//3
		System.out.println("ä�λ��� : "+tv.channel);
		

	}

}
