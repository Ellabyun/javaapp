package classTest;

public class Car2 {
	// 속성 : 제조회사, 모델, 색상, 최대스피드...
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//생성자 - 클래스 이름과 동일/리턴 타입 없음/중복 가능(생성자 오버로딩)
	//목적 - 필드에 초기값을 저장/객체 생성하면서 준비해야 하는 작업 실행
	Car2(){
		System.out.println("Car2 기본 생성자");
	}
	//괄호 안의 내용이 달라야 함(타입이 달라야 함)
	Car2(String model){
		System.out.println("Car2 기본 생성자 - model 초기화");
	}
	Car2(String model, String color){
		System.out.println("Car2 기본 생성자 - model,color 초기화");
	}
	Car2(String company, String model, String color, int maxSpeed){
		System.out.println("Car2 기본 생성자 - 속성 모두 초기화");
	}
	
	
	
	// 동작: 전진하고, 후진하다
	void forward() {
		System.out.println("전진하다");
	}
	void backward() {
		System.out.println("후진하다");
	}
}
