package afterschool;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// int타입을 5개 저장하는 배열 생성
		
		//배열의 초기화를 위해 사용자로부터 받기
		
		//입력받은 값 출력
		int arr[];
		arr = new int[5];
		
		// int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5명의 점수를 입력하세요");

		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 점수 입력: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.printf("총합 : %d, 평균 : %.1f", sum, (double)sum/arr.length);
	}

}
