package test;

public class ForTest2 {

	public static void main(String[] args) {
		// 1~10까지의 합
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);//55
		
		System.out.println();
		
		//1~100까지 합
		sum = 0;
		for(int i=1;i<=100;i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지 합 : "+sum);
	}
}
