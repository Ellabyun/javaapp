import java.util.Scanner;

public class ChangeMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� : ");
		int price = k.nextInt();
		System.out.print("�� ��: ");
		int moneyOut = k.nextInt();
		System.out.println("-------");
		int a = moneyOut - price;
		System.out.printf("�Ž����� : %d\n", a);
		
		if(a >= 10000) {
			int b = a / 10000 ;
			System.out.printf("1���� : %d\n", b);
			a %= 10000;
			System.out.println(a);
		} else if(a >= 5000) {
			int c = a / 5000 ;
			System.out.printf("5õ�� : %d\n", c);
			a %= 5000;
			System.out.println(a);
		}
	}

}
