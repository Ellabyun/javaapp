package test;

public class ForTest5 {

	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********
		
		// ���� for statement �������
		// �� int i=0;
		// �� i<3;
		// �� ���� for ���� int j=0;
		// �� j<3;
		// �� System.out.print("*"); *
		// �� j++ => j=1
		// �� j<3;
		// �� System.out.print("*"); **
		// �� j++ => j=2
		// �� j<3;
		// �� System.out.print("*"); *** 
		// �� j++ => j=3 
		// �� j<3; => ���� for�� ����
		// �� System.out.println();
		
		// �� i++; i=1
		// �� i<3;
		// �� ���� or���� int j=0; ~~~~ �� ����
		// ***
		// ***
		// ***
		
		// �� i++; i=3
		// �� i<3; => �ٱ� for �� ����
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=1;i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1;i<=2;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<=3;i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1;i<=4;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
	  }

	}
}	