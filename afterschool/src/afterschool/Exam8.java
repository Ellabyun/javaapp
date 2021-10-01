package afterschool;

public class Exam8 {

	public static void main(String[] args) {
		// array => heap(new)
		
		// array declare 배열 선언
		int arr[] ;
		// create 생성
		arr = new int [10];
		// 초기화 1~10 값을 대입
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]+" ");
			arr[i]=i+1;
		}
		// 사용
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println(arr[10]);
	}

}
