package inheritance;

public class TV2 {
	//속성(멤버변수, 필드, 프로퍼티) => 색상, 전원상태, 채널,...
	private String color; //red,blue,black...
	private boolean power; //on, off
	private int channel;
	
//	public TV2() {
//		super();
		// TODO Auto-generated constructor stub
//	}
	
	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	

	//동작(method) => 채널변경(증가,감소), 전원을 켜다/끄다
	void channelUp() {
		// channelUp가 해야 하는 작업 작성 채널 7 => 8,9,10...
		channel++;
	}
	void channelDown() {
		// channelDown가 해야 하는 작업 작성 채널 7 => 6,5,4...
		channel--;
	}
	void power() {
		// power가 해야 하는 작업 on => off, off => on
		power = !power;
		
	}


	public String getColor() {
		return color;
	}


	public boolean isPower() {
		return power;
	}


	public int getChannel() {
		return channel;
	}
	
	
}
