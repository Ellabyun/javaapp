package inheritance;

public class CaptionTV2 extends TV2 {
	boolean caption;
	
	public CaptionTV2(String color, boolean power, int channel) {
		super(color, power, channel);
		// TODO Auto-generated constructor stub
	}

	
	void displayCaption(String text) {
		if(caption) { //caption == true¿« ¿«πÃ
			System.out.println(text);
		}
	}
}
