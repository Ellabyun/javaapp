// ���� 1.8.0-302 
// 1: major
// 8.0-302 : minor
// ���ڸ��� �ٲ���� ���� �ٲ����
// major������ �ٲ� : �ٸ� ���α׷�
// 1.5�� ũ�� �ٲ�� �� �ڷδ� �� ���̰� ����, 2.0 ������ ���� �޶��� �� ����.

// win 95 - 4.1
// win 98 - 4.5
// win 10 - 9.0(ū����)

public class PrintMain {
	//��� �ڵ�� �� ������
	public static void main(String[] args) {
		//����� ���͸� ����
		
		// �ܼ�â�� ���
		System.out.print("���� ��������!");
		// �ܼ�â�� ����ϰ� �ٹٲ�
		System.out.println("���� ��������!");
		// ������ �����ϸ鼭 �ܼ�â�� ���, ���� ��·�� �Ҽ��� ���ڸ��� ����ϰ� ������
		System.out.printf("%.1f",45.123);
		System.out.println();
		//
		// Ư������ 
		// 	\n - �ٹٲ�, new line
		// 	\r - carriage return(Ŀ�� �� ������)
		// 	\r\n - �ϼ��� �ٹٲ�
		// 		\n�� �־ �˾Ƽ� �ٹٲ��� �ϼ��Ǵ� ���α׷��� ����(�ܼ�â)
		//	\t - tab(tabŰ ����Ʈ ������ ����Ʈ�� �̵�, �������� ���� 5���� �ƴ�, �ٸ��⶧ ��)
		//	\b - back space (1byte�����)
		//	\\ - \
		//	\" "
		System.out.println("����ö1ȣ��");
		System.out.println("\\1350");
		System.out.println("��\n��");
		System.out.println("������\r������");
		System.out.println("�� :\t����");
		System.out.println("���� :\t����");
		System.out.println("������\b");
		System.out.println("\"");
	}
}
