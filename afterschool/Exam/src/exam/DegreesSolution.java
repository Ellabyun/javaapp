package exam;

import java.util.Scanner;

public class DegreesSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȭ���µ� �Է� : ");
		
		int fahr = sc.nextInt();
		double cels = (fahr-32)*5/9.0;
		System.out.println("�����µ� : "+cels);
		System.out.printf("�����µ� : %.4f",cels);
	}
}
