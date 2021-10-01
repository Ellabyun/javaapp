package inheritance;

public class TV {
	//속성(멤버변수, 필드, 프로퍼티) => 색상, 전원상태, 채널,...
	String color; //red,blue,black...
	boolean power; //on, off
	int channel;
	
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
}
