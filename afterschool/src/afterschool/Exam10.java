package afterschool;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// intŸ���� 5�� �����ϴ� �迭 ����
		
		//�迭�� �ʱ�ȭ�� ���� ����ڷκ��� �ޱ�
		
		//�Է¹��� �� ���
		int arr[];
		arr = new int[5];
		
		// int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ���");

		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"��° ���� �Է�: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.printf("���� : %d, ��� : %.1f", sum, (double)sum/arr.length);
	}

}
