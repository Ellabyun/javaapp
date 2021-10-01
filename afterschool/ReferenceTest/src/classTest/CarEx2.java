package classTest;

public class CarEx2 {

	public static void main(String[] args) {
		//첫번쨰 차
		//객체 생성시 생성자 자동 호출됨
		Car2 car = new Car2();
		// 기본 속성값은 String => null, int=>0, 
		// boolean => false, double => 0.0
		
		// 두번쨰 차
		Car2 car2 = new Car2("kona");
		
		//세번째 차
		Car2 car3 = new Car2("kona","black");
		
		//네번째 차
		Car2 car4 = new Car2("현대","kona","black",250);
		
		
		//The field Car2.company is not visible(private으로 해서)	
//		car.company = "Kia";
//		car.model = "seltos";
//		car.color = "Dark Grey";
//		car.maxSpeed = 200;
		
//		car.forward();
		//두번쨰 차
		//객체 생성시 생성자 자동 호출됨
//		Car2 car2 = new Car2();
		
//		car2.company = "hyundai";
//		car2.model = "sant fe";
//		car2.color = "white";
//		car2.maxSpeed = 250;
		
//		car.forward();
		
	}

}
