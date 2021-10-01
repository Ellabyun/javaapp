package exam;

import java.util.Scanner;

public class DegreesSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("È­¾¾¿Âµµ ÀÔ·Â : ");
		
		int fahr = sc.nextInt();
		double cels = (fahr-32)*5/9.0;
		System.out.println("¼·¾¾¿Âµµ : "+cels);
		System.out.printf("¼·¾¾¿Âµµ : %.4f",cels);
	}
}
