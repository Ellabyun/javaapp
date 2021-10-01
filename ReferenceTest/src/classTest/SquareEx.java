package classTest;

public class SquareEx {

	public static void main(String[] args) {
		
		Square square1 = new Square();
		square1.length=4;
		
		System.out.println("정사각형1 면적: "+square1.getArea());

		Square square2 = new Square();
		square2.length=5.64;
		
		System.out.println("정사각형2 면적: "+square2.getArea());
	}

}
