package classTest;

public class SubscriberInfoEx {

	public static void main(String[] args) {
		
		SubscriberInfo subscriber1 = new SubscriberInfo("홍길동", "hong", "1234");
		SubscriberInfo subscriber2 = new SubscriberInfo("성춘향", "spring", "1234", "010-0989-5858", "남원" );
		
		
		//전화번호 변경
		subscriber1.setTelNo("010-4566-3423");
		
		//주소변경
		subscriber2.setAddr("서울");

	}

}
