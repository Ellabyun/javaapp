package test;

public class SwitchEx1 {

	public static void main(String[] args) {
		// dice 
		
		// create a number 1~6 automatically
		// 0.0 <= value < 1.0
		
		int num = (int)(Math.random()*6)+1;
		// if ����
		if(num == 1) {
			System.out.println("1�� ����");
		} else if (num == 2) {
			System.out.println("2�� ����");
		} else if (num == 3) {
			System.out.println("3�� ����");
		} else if (num == 4) {
			System.out.println("4�� ����");
		} else if (num == 5) {
			System.out.println("5�� ����");
		} else if (num == 6) {
			System.out.println("6�� ����");
		}
		/* switch statement(int, double, float, char, String, enum){
		* case value1:
		* 		to do;
		* 		break;
		* case value2:
		* 		to do;
		* 		break;
		* default:
		* 		to do;
		* }
		* 
		* if ~else if ~else alternative
		* 
		*/
		
		switch (num) {
		case 1:
			System.out.println("1�� ����");
			break;
		case 2:
			System.out.println("2�� ����");
			break;
		case 3:
			System.out.println("3�� ����");
			break;
		case 4:
			System.out.println("4�� ����");
			break;
		case 5:
			System.out.println("5�� ����");
			break;

		default:
			System.out.println("6�� ����");
		}
	}

}
