package classTest;

public class Car {
	// 속성 : 제조회사, 모델, 색상, 최대스피드...
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//Car(){} => 기본생성자(default constructor)
	//클래스 내에 선언된 생성자가 하나도 없으면
	//컴파일러가 자동으로 기본 생성자를 만들어줌
	
	// 동작(method): 전진하고, 후진하다
	// 리턴타입 메소드명(){}
	// 리턴타입 메소드명(타입 변수명,...){}
	void forward() {
		System.out.println("전진하다");
	}
	void backward() {
		System.out.println("후진하다");
	}
}
