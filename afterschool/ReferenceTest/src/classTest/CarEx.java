package classTest;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car);
		
		car.company = "Kia";
		car.model = "seltos";
		car.color = "Dark Grey";
		car.maxSpeed = 200;
		
		car.forward();
		
	}

}
