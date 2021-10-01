import java.util.Scanner;

public class Delivery {
	public static void main(String[] args) {
		
		
		System.out.println("---편의점 택배---");
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = k.nextDouble();
		System.out.print("세로 : ");
		double depth = k.nextDouble();
		System.out.print("높이 : ");
		double height = k.nextDouble();
		System.out.print("무게 : ");
		double weight = k.nextDouble();
		
		System.out.println("-----------------");
		
		double xx = width * depth * height;
		System.out.printf("부피(가*세*높) : ", xx);
		System.out.printf("무게 : ", weight);
		
		
	}

}
