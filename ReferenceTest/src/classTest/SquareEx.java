package classTest;

public class SquareEx {

	public static void main(String[] args) {
		
		Square square1 = new Square();
		square1.length=4;
		
		System.out.println("���簢��1 ����: "+square1.getArea());

		Square square2 = new Square();
		square2.length=5.64;
		
		System.out.println("���簢��2 ����: "+square2.getArea());
	}

}
