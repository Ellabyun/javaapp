package classTest;

public class SubscriberInfo {
	//속성 - 이름, 아이디, 패스워드, 전화번호, 주소
	private String name;
	private String id;
	private String password;
	private String telNo;
	private String addr;
	
	//생성자 - 이름, 아이디, 패스워드만 초기화를 한 후 객체 생성
	//		- 이름, 아이디, 패스워드, 전화번호, 주소를 초기화 한 후 객체 생성
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public SubscriberInfo(String name, String id, String password, String telNo, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.telNo = telNo;
		this.addr = addr;
	}

	//기능 - 비밀번호 변경, 전화번호 변경, 주소변경
	//setter 메소드

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	

	
	
	
}
