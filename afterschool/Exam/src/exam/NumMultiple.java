package exam;

public class NumMultiple {

	public static void main(String[] args) {
		// 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num
		// 의 값을 뺸 나머지를 구하시오
		// ex) if num is 24, the big and close 10 multiple number is 30
		// ex) num = 18, 20
		int num = 56;
		int a = num%10 ;
		if (a>=1) {
			int b = num + (10-num%10);
					System.out.printf("변수 num의 값보다 크면서도 가장 가까운 10의 배수 : %d\n", b);
					int c = b - num;
					System.out.printf("num의 값을 뺸 나머지 : %d", c);
		}

		
	}

}
