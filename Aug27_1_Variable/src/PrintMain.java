import java.util.Scanner;

public class PrintMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("제품명: ");
		String name = k.next();
		System.out.print("가격: ");
		int price = k.nextInt();
		System.out.print("무게: ");
		double weight = k.nextDouble();
		
		double pct = 88.6;
		System.out.println("----------");
		// 형식지정
		//		%s 	: String들어올 자리
		//		%d 	: 정수들어올 자리
		//		%05d: 자릿수 맞추기 
		//		%f 	: 실수 들어올 자리
		//		%.3f: 소수점 3자리 반올림
		//		%%	: %출력
		//		%b	: boolean
	
		System.out.printf("-품명 : %s-\n", name);
		System.out.printf("-가격 : %d-\n", price);
		System.out.printf("-가격 : %05d-\n", price);
		System.out.printf("-무게 : %f-\n", weight);
		System.out.printf("-무게 : %.3f-\n", weight);
		System.out.printf("-%.2f%%-\n", pct);
		System.out.printf("%s[%d원] - %fg", name, price, weight);
	}
}
