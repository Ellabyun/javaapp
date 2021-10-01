package afterschool;

public class Exam2 {

	public static void main(String[] args) {

		int i=1;
		if (i<10) {
			System.out.println(i);
			System.out.println("안녕하세요");
		}
		
		//한줄이면 안 묶어도 되지만 헷갈릴 수 있으니 블록 설정하는 것이 좋음
		
		for(i=0;i<10;i++) {
			System.out.println(i);
		}
		
		
		switch (i) {
		case 1:

			break;

		default:
			break;
		}
	}
}
