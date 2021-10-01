package classTest;

public class TriangleEx {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		triangle1.baseLine = 4;
		triangle1.height = 6;
		System.out.println("≥–¿Ã :"+triangle1.getArea());

		Triangle triangle2 = new Triangle();
		triangle2.baseLine = 90;
		triangle2.height = 80;
		System.out.println("≥–¿Ã :"+triangle2.getArea());
	}

}
