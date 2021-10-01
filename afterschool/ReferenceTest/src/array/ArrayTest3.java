package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// int 타입의 배열 5개 생성
		// 0 10 20 30 40
		int score[] = {0, 10, 20, 30, 40};
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}
		System.out.println();
		
		//향상된 for문
		for(int idx:score) {
			System.out.println(idx+"\t");
		}
		
		// String 타입의 배열 5개 생성
		// 과일이름 초기화
		String fruit[] = {"apple", "grape", "orange", "cherry", "mango"};
		for(int i=0;i<fruit.length;i++) {
			System.out.print(fruit[i]+"\t");
		}
		System.out.println();
		
		// 향상된 for문
		for(String f:fruit) {
			System.out.print(f+"\t");
			
		}

	}

}
