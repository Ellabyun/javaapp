package test;

public class SwitchEx1 {

	public static void main(String[] args) {
		// dice 
		
		// create a number 1~6 automatically
		// 0.0 <= value < 1.0
		
		int num = (int)(Math.random()*6)+1;
		// if ±¸¹®
		if(num == 1) {
			System.out.println("1¹ø ³ª¿È");
		} else if (num == 2) {
			System.out.println("2¹ø ³ª¿È");
		} else if (num == 3) {
			System.out.println("3¹ø ³ª¿È");
		} else if (num == 4) {
			System.out.println("4¹ø ³ª¿È");
		} else if (num == 5) {
			System.out.println("5¹ø ³ª¿È");
		} else if (num == 6) {
			System.out.println("6¹ø ³ª¿È");
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
			System.out.println("1¹ø ³ª¿È");
			break;
		case 2:
			System.out.println("2¹ø ³ª¿È");
			break;
		case 3:
			System.out.println("3¹ø ³ª¿È");
			break;
		case 4:
			System.out.println("4¹ø ³ª¿È");
			break;
		case 5:
			System.out.println("5¹ø ³ª¿È");
			break;

		default:
			System.out.println("6¹ø ³ª¿È");
		}
	}

}
