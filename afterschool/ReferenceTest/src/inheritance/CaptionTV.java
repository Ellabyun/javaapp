package inheritance;

public class CaptionTV extends TV {
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) { //caption == true�� �ǹ�
			System.out.println(text);
		}
	}
}
