package afterschool;

public class Exam4 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		for(int i=1;i<11;i++) {
			sum+=i;
			if (i==10) {
				System.out.print(i+"=");
			} else {
			System.out.print(i+"+");
			}
		}
		System.out.print(sum);
		
		System.out.println();
		System.out.println();
		
		//solution
		int sum1 = 0;
		for(int i=1;i<11;i++) {
			
			sum1 += i;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum1);
			}
		}
	}

}
