package afterschool;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// 정수를 입력하고 마지막에 0을 입력하세요
		// 10 30 -20 40 0
		// 입력한 수의 개수는 4개이며 평균은 15.0입니다.
		

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		
//		int input;
		
//		while((input = sc.nextInt())!=0) {
//			System.out.println(input+" ");

//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		
		int num;
		int count = 0;	
		int sum = 0;
		// 사용자한테 int값을 입력받고, num이라는 변수에 담고,
		// num이 0이 아니어야 한다.
		while((num = sc.nextInt())!=0) {
			count++;
			sum += num;
		}
		System.out.printf("입력한 수의 개수는 %d이며 평균은 %.1f입니다.",count,(double)sum/count);
	}

}
