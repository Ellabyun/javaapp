package test;

public class WhileTest2 {

	public static void main(String[] args) {
		// 1~100까지 합
		
		int sum=0, i=1 ;
		while(i<101) {
			sum = sum+i;
			i++;
		}
		System.out.println("1~100 합 : "+sum);
		System.out.println();
		
		i=1;
		while(1<10) {
			System.out.printf("2 * %d = %d\t",i,(2*i));
			i++;
		}

	}

}
