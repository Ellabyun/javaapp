package test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		// ��������� �ǿ����� 2�� �Է� �ޱ�
		// let the user input 2 numbers
		// let the user input the operator(+,-,*,/,%)
		// switch(operator)
		// print out the result
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� �Է� : ");
		int a = sc.nextInt();
		
		System.out.print("�ι�° �� �Է� : ");
		int b = sc.nextInt();

		System.out.print("������ �Է�(+,-,*,/,%) : ");
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
	//		System.out.println("�����ڸ� Ȯ���� �ּ���.");
	//		break;		
			
		}
		System.out.printf("%d %s %d = %d", a, c, b, result);

	}

}
