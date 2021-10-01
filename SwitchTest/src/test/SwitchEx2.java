package test;

public class SwitchEx2 {
	public static void main(String[] args) {
		char grade='B';
		
		// A or a => Diamond
		// B or b => Gold
		// 아무것도 없음 => guest
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Diamond");
			break;
		case 'B':
		case 'b':
			System.out.println("Gold");
			break;
		default:
			System.out.println("Guest");
			break;//크게 의미는 없어서 생략은 가능
		}
		// if 구문으로 변환
		if(grade == 'A' || grade == 'a') {
			System.out.println("Diamond");
		} else if (grade == 'B' || grade == 'b') {
			System.out.println("Gold");
		} else {
			System.out.println("Guest");
		}
	}
}
