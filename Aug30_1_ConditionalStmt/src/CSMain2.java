import java.util.Scanner;

// 중간고사 :
// 기말고사 :
//---------
// 평균 :

// 평균은 소수점 한자리만

public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("중간고사 : ");
		int midtermTest = k.nextInt();	
		System.out.print("기말고사 : ");
		int finalTest = k.nextInt();	
		
		System.out.println("---------");
		
		double average = (midtermTest + finalTest)/2.0;
		System.out.printf("평균 : %.1f\n", average);
		// 평균이 90점 이상이면 수라고 출력, 아니면 야!라고 출력
		// 야!는 했지만, 80점 이상이면 다음에는 잘해라
		// 점수 >= 90 : 수
		// 80 <= 점수 <90 : 우
		// 70 <= 점수 <80 : 미
		// 60 <= 점수 < 70 :양
		// 점수 < 60 : 가
		
		//else와 if를 합침
		if (average >= 90) {
			System.out.println("수");
		} else if (average >= 80) {
			System.out.println("우");
		} else if (average >= 70) {
			System.out.println("미");
		} else if (average >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		// if (A) {
		//		A 만족시켰으면
		// } else if (B) {
		//		A는 땡, B를 만족시켰으면
		// } else if (C) {
		//		A는 땡, B도 땡, C를 만족시켰으면
		// } ...
		// } else {
		// 		위에 하나도 맞는거 없으면
		// }
		
		// 1st try
		if (average >= 90) {
			System.out.println("수");
		} else {
			if (average >=80) {
				System.out.println("우");
			} else {
				if (average >= 70) {
					System.out.println("미");
				} else {
					if (average >= 60) {
						System.out.println("양");
					} else {
						System.out.println("가");
						
					}
				}
			}
		}
	}
}
