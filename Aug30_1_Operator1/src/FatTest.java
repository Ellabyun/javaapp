import java.util.Scanner;

public class FatTest {
	public static void main(String[] args) throws InterruptedException {
		//Ű���� �Է¹��� �غ�
		
		// �����ϳ�
		// �̸��ޱ�
		// Ű�ޱ�
		// �����Թޱ�
		// ���ϳ�
		// ǥ��ü�߰��
		// �񸸵����
		// �������
		// ������
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("�񸸵� �˻�----");
		System.out.print("�̸� : ");
		String name = k.next();
		System.out.print("Ű : ");
		double h = k.nextDouble();
		System.out.print("������ : ");
		double w = k.nextDouble();
		
		System.out.println("----------");
		
		double standardWeight = (h - 100) * 0.9;
		System.out.printf("ǥ��ü�� : %.2fkg\n",standardWeight);
		double fatRate = (w / standardWeight) * 100;
		System.out.printf("�񸸵� : %.2f%%\n",fatRate);
		String say = (fatRate>=120) ? "%s���� ��":"%s���� ����";
		System.out.printf(say,name);
		// ������ ���
		// String result = (fatRate >120) ? "��" : "����";
		// System.out.printf("%s���� %s\n, name, result);
		// 
		Thread.sleep(5000);
		
		//�Ǵ�
		// System.out.println("��������� ���� �Ŀ�");
		// String t = k.next()
	
	}

}
