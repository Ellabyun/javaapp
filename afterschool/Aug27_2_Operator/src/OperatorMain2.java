import java.util.Scanner;

// ����ó����� �� ���ÿ�

// ��������
//		>	>=	==	!=		<=	<	
//		�ʰ�	�̻�	����	�ٸ���	����	�̸�

// �����տ�����
//		&&		||		!			^
//		��/and	�ų�/or	�ݴ�/not		xor
//
// XOR(=exclusive or) - ��Ÿ�� or
//
// 2��¥�� : �ߴܵǴ� ���� - v
//		&& - �� Ȯ�� �����Ÿ� ������ ��ġ
//		|| - �� Ȯ�� �����Ÿ� ������ ��ġ
// 1��¥�� : ������ ���� ����

public class OperatorMain2 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = k.nextDouble();
		System.out.print("���� : ");
		int age = k.nextInt();
		
		System.out.println("--------");
		System.out.printf("Ű %.1fcm, %d��\n", height, age);
		
		// Ű�� 150 �ѳ�
		boolean a = height > 150;
		System.out.println(a);
		
		// ���̰� 10�� ����
		boolean b = age <= 10;
		System.out.println(b);
		
		// �����ø��ǾƵ� ���⹮��
		
		// ���ǹ�
		// �ݺ���
		// �÷���(�迭)
		
		// �� ���� Ư¡ - ��ü, ���̺귯�� �� Ȱ��
				
		// ���̱ⱸ ���̰� 5�� �̻��̰�, Ű�� 200cm �̻��̸� ����
		boolean c = age >= 5 && height >=200;
		System.out.println(c);
		
		// Ű�� 2���� �Ѵ� ��찡 �� Ȯ���� ����
		// boolean c = height >=200 && age >= 5;
		
		// Ű�� 200cm�̻��̰ų� ���̰� 5�� �̻��ΰ� 
		boolean d = height >=200 || age >=5; 
		System.out.println(d);
		
		// d�� true�� e�� false
		// d�� false�� e�� true
		
		boolean e = !d;
		System.out.println(e);
	}
}
