package test;

public class SwitchEx2 {
	public static void main(String[] args) {
		char grade='B';
		
		// A or a => Diamond
		// B or b => Gold
		// �ƹ��͵� ���� => guest
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Diamond");
			break;
		case 'B':
		case 'b':
			System.out.println("Gold");
			break;
		default:
			System.out.println("Guest");
			break;//ũ�� �ǹ̴� ��� ������ ����
		}
		// if �������� ��ȯ
		if(grade == 'A' || grade == 'a') {
			System.out.println("Diamond");
		} else if (grade == 'B' || grade == 'b') {
			System.out.println("Gold");
		} else {
			System.out.println("Guest");
		}
	}
}
