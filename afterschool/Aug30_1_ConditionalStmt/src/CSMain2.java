import java.util.Scanner;

// �߰���� :
// �⸻��� :
//---------
// ��� :

// ����� �Ҽ��� ���ڸ���

public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("�߰���� : ");
		int midtermTest = k.nextInt();	
		System.out.print("�⸻��� : ");
		int finalTest = k.nextInt();	
		
		System.out.println("---------");
		
		double average = (midtermTest + finalTest)/2.0;
		System.out.printf("��� : %.1f\n", average);
		// ����� 90�� �̻��̸� ����� ���, �ƴϸ� ��!��� ���
		// ��!�� ������, 80�� �̻��̸� �������� ���ض�
		// ���� >= 90 : ��
		// 80 <= ���� <90 : ��
		// 70 <= ���� <80 : ��
		// 60 <= ���� < 70 :��
		// ���� < 60 : ��
		
		//else�� if�� ��ħ
		if (average >= 90) {
			System.out.println("��");
		} else if (average >= 80) {
			System.out.println("��");
		} else if (average >= 70) {
			System.out.println("��");
		} else if (average >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		// if (A) {
		//		A ������������
		// } else if (B) {
		//		A�� ��, B�� ������������
		// } else if (C) {
		//		A�� ��, B�� ��, C�� ������������
		// } ...
		// } else {
		// 		���� �ϳ��� �´°� ������
		// }
		
		// 1st try
		if (average >= 90) {
			System.out.println("��");
		} else {
			if (average >=80) {
				System.out.println("��");
			} else {
				if (average >= 70) {
					System.out.println("��");
				} else {
					if (average >= 60) {
						System.out.println("��");
					} else {
						System.out.println("��");
						
					}
				}
			}
		}
	}
}
