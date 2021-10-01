package afterschool;

public class Exam7 {

	public static void main(String[] args) {
		// a~z 까지 출력
		
		char i = 'a';
		// 실행문을 우선 실행하고 조건 검사하여
		// 다음 반복을 수행할지 결정 
		do {
			System.out.print(i+" ");
			i++;
		} while(i <= 'z');
		System.out.println();
		
		//while statement
		char ch='a';
				while(ch <='z') {
					System.out.print(ch+" ");
					ch++;
				}

	}

}
