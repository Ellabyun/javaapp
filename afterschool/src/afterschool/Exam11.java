package afterschool;

public class Exam11 {

	public static void main(String[] args) {
		// array => heap(new)
		
		// array declare 배열 선언과 생성, 초기화
		int arr[]= {100,25,73,54,65,67,79,8,9,10};

		// 사용
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		// 향상된 for문
		for(int j:arr) {
			System.out.println(j+" ");			
		}

	}

}
