package test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		// 사용자한테 피연산자 2개 입력 받기
		// let the user input 2 numbers
		// let the user input the operator(+,-,*,/,%)
		// switch(operator)
		// print out the result
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int b = sc.nextInt();

		System.out.print("연산자 입력(+,-,*,/,%) : ");
		// + / * => '+' or "+"
		String c = sc.next();
		
		int result = 0;
		
		switch (c) {
		case "+":	
			result = a + b;
			//System.out.println(a+c+b+"="+(a+b));
			break;
		case "-":			
			result = a - b;
			//System.out.println(a+c+b+"="+(a-b));
			break;
		case "*":			
			result = a * b;
			//System.out.println(a+c+b+"="+(a*b));
			break;
		case "/":			
			result = a / b;
			//System.out.println(a+c+b+"="+(a/b));
			break;
		case "%":			
			result = a % b;
			//System.out.println(a+c+b+"="+(a%b));
			break;
	//	default:
	//		System.out.println("연산자를 확인해 주세요.");
	//		break;		
			
		}
		System.out.printf("%d %s %d = %d", a, c, b, result);

	}

}
