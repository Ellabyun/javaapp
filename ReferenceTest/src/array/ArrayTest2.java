package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// int 타입의 변수 10개 선언 
		// 담으려고하는타입 배열명[] = new 담으려고하는타입 [갯수] 
		
		// 배열의 선언과 생성(힙)
		int scores[] = new int[10];
		
		int arr[]; //선언
		arr = new int[10];//생성
		
		
		// 배열의 선언과 생성 및 초기화
		int arr2[] = {35,95,65,75,25,33};//가장 유용한 방법, 때에 따라 나눠서 하기도 함
		System.out.println("배열 길이"+arr2.length);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
