import java.util.Scanner;
// alt ��/�� : ��������/��������

// error
// warning
// exception

// �ܼ� �Է¹޴� ���α׷� ����ÿ�

public class ConsoleInputMain {
	public static void main(String[] args) {
		// Ű���� �Է¹��� �غ��ؼ� k�� ������
		Scanner k = new Scanner(System.in);
		
				
		// �Ĵ� �̸� �Է¹ޱ�
		System.out.print("�Ĵ� �̸� : ");
		
		// �ֿܼ� �Է��� ������ name�� ����
		String name = k.next();

		System.out.print("�Ĵ� ũ��: ");
		double size = k.nextDouble();
		
		System.out.print("���̺� ��: ");
		int table = k.nextInt();
			
		System.out.print("��������: ");
		boolean restOpen = k.nextBoolean();
		
		k.close();
		
		System.out.println("************");
		System.out.println(name);
		System.out.println(size);
		System.out.println(table);
		System.out.println(restOpen);
		System.out.println("************");	
	}

}
