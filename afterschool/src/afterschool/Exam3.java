package afterschool;

public class Exam3 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		
	

//		int sum = 0;
//		int i = 1;
//		while (i<11) {
//			sum += i;
//			if(i==10) {
//			System.out.print(i+"=");
//			} else {
//			System.out.print(i+"+");
//			}
//			i++;
//		}
//		System.out.print(sum);	
		
// solution
		
		int sum1 = 0;
		int i=1;
		while(i<11) {
			
			sum1 += i;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum1);
			}
			i++;
		}

	}
}
