package test;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		// ����ڿ��� �������� �ܼ��� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �ܼ� �Է� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
			//System.out.printf("%d * %d = %d\t",num,i,(num*i));
		}
	}

}
