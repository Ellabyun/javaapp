import java.util.Scanner;

public class Delivery {
	public static void main(String[] args) {
		
		
		System.out.println("---������ �ù�---");
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = k.nextDouble();
		System.out.print("���� : ");
		double depth = k.nextDouble();
		System.out.print("���� : ");
		double height = k.nextDouble();
		System.out.print("���� : ");
		double weight = k.nextDouble();
		
		System.out.println("-----------------");
		
		double xx = width * depth * height;
		System.out.printf("����(��*��*��) : ", xx);
		System.out.printf("���� : ", weight);
		
		
	}

}
