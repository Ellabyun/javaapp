package exam;

public class NumMultiple {

	public static void main(String[] args) {
		// ���� num�� ������ ũ�鼭�� ���� ����� 10�� ������� ���� num
		// �� ���� �A �������� ���Ͻÿ�
		// ex) if num is 24, the big and close 10 multiple number is 30
		// ex) num = 18, 20
		int num = 56;
		int a = num%10 ;
		if (a>=1) {
			int b = num + (10-num%10);
					System.out.printf("���� num�� ������ ũ�鼭�� ���� ����� 10�� ��� : %d\n", b);
					int c = b - num;
					System.out.printf("num�� ���� �A ������ : %d", c);
		}

		
	}

}
