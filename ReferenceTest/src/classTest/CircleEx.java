package classTest;

public class CircleEx {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.radius = 4;
		
		System.out.println("원1면적: "+circle1.getSurface());

		Circle circle2 = new Circle();
		circle2.radius = 19;
		
		System.out.println("원2면적: "+circle2.getSurface());
	}

}
