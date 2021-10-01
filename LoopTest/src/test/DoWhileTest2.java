package test;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		System.out.println("Input Messege");
		System.out.println("if you want to finish the program input q");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println("프로그램 종료");

	}

}
