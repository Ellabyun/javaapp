package test;

public class ForTest1 {

	public static void main(String[] args) {
		// ; ������ ����
		
		// for �������
		// �� int i = 0;
		// �� i < 10;
		// �� �ݺ��ؾ� �� �۾� ���� => System.out.println("�ȳ��ϼ���");
		// �� i++ (i=i+1) => i=1
		// �� i <10;
		// �� �ݺ��ؾ� �� �۾� ���� => System.out.println("�ȳ��ϼ���");
		// �� i++ (i=i+1) => i=2
		// �� i < 10;
		// �� �ݺ��ؾ� �� �۾� ���� => System.out.println("�ȳ��ϼ���");
		// �ݺ�...
		// i=9
		// i<10;
		// �ݺ��ؾ� �� �۾� ���� => System.out.println("�ȳ��ϼ���");
		// i=10
		// i < 10; ���� �Ҹ��� => for ������ �������� => for ����
		
		for(int i=0; i<10; i++) {
			// �ݺ��ؾ����۾�
			System.out.println("�ȳ��ϼ���");

		}
		
		System.out.println();
		
		// 1~10���� ���
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 0~10 only even number
		for(int i=0; i<=10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		// 3 6 9 12 ...3�� ����� ��� 100����
		
		for(int i=3; i<=100; i+=3) {
			System.out.print(i+"   ");
		}
	
		
		
		for(int i=1; i<300; i++) {
			if(i%3 == 0) {
				System.out.print(i+"  ");
			}
		}
			
			System.out.println();
		// 1~100 ���� ���� �߿��� 3�� ������� ���ϴ� ���α׷� �ۼ�
		// ��, 9�� ����� ������ �ʱ�
		
		int sum = 0;
		for(int i=1; i<101; i++) {
			if (i % 3 == 0 && i % 9 != 0) {
				sum += i;
			} 
		}
		System.out.println("3�� ����̰� 9�� ����� �ƴ� �� : "+sum);
		System.out.println();
		
		// 1~100 ���� ���� �߿��� 3�� ����̰ų�, 5�� ����� ���� ��

		sum = 0;
		for(int i=1; i<101; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			} 
		}
		System.out.println("3�� ����ų� 5�� ����� �� : "+sum);
			
		
	}
}
