import java.util.Scanner;

public class LastWeekMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = k.nextDouble();
		System.out.print("���� : ");
		double depth = k.nextDouble();
		System.out.print("���� : ");
		double height = k.nextDouble();
		System.out.print("���� : ");
		double weight = k.nextDouble();
		
		System.out.println("-----");
		
		double volume = width * depth * height;
		System.out.printf("���� : %.1fcm3\n", volume);
		System.out.printf("���� : %.1fkg\n", weight);
		
		// ���� : cm3
		// ���� : kg
		
		// o o -> X
		// o x -> o
		// x o -> o
		// x x -> x
		
		// ���ǰ� 10�̸��̵���, ���԰� 1000�̸��̵��� �ϳ���(XOR)
		boolean d = volume < 10 ^ weight < 1000;
		System.out.println(d);
		
		//���ǰ� 10�̻��̰� ���԰� 1000�̻��̸� 
		boolean a = volume >= 10 && weight >= 1000;
		System.out.println(a);
		
		// �� ���� ���!! ���ǰ� 10 �Ѵ� ���� �������� 1000Ű�� �Ѵ°Ŵ� �平
		// �׷��� �幮 ���(Ȯ���� ���� ���)�� ������ ������ ���� ȿ�����̴�.
		
		//boolean a = weight >= 1000 && volume >= 10;
		//System.out.println(a);
				
		//���ǰ� 10�̸��̰ų�, ���԰� 1000�̸��̸� 
		boolean b = volume < 10 || weight < 1000;
		System.out.println(b);
		
		//or�� ��� �տ��� true�� ������ true, Ȯ���� ���� ���� �տ� ��ġ
		//boolean b = weight < 1000 || volume < 10;
		//System.out.println(b);
		
		//���԰� 20�̻��̰� ���԰� 30�̻��̸� 
		boolean c = weight >= 20 && weight >= 30;
		System.out.println(c);
		
		//��, 30�̻� 
		//boolean c = weight >= 30;
		//System.out.println(c);
		
		// and�� ��� &�� && �� ������, &&�� ��� A�� Ʋ���� ������ ����������
		// ��ǻ���� ���� �ٿ��ش�.
		
	}
}
