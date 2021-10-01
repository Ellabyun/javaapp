import java.util.Scanner;

// 정보처리기사 꼭 따시오

// 논리연산자
//		>	>=	==	!=		<=	<	
//		초과	이상	같다	다르다	이하	미만

// 논리결합연산자
//		&&		||		!			^
//		고/and	거나/or	반대/not		xor
//
// XOR(=exclusive or) - 배타적 or
//
// 2개짜리 : 중단되는 버전 - v
//		&& - 더 확률 낮은거를 앞으로 배치
//		|| - 더 확률 높은거를 앞으로 ㅐ치
// 1개짜리 : 끝까지 가는 버전

public class OperatorMain2 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print("키 : ");
		double height = k.nextDouble();
		System.out.print("나이 : ");
		int age = k.nextInt();
		
		System.out.println("--------");
		System.out.printf("키 %.1fcm, %d살\n", height, age);
		
		// 키가 150 넘나
		boolean a = height > 150;
		System.out.println(a);
		
		// 나이가 10살 이하
		boolean b = age <= 10;
		System.out.println(b);
		
		// 정보올림피아드 기출문제
		
		// 조건문
		// 반복문
		// 컬렉션(배열)
		
		// 그 언어만의 특징 - 객체, 라이브러리 잘 활용
				
		// 놀이기구 나이가 5살 이상이고, 키가 200cm 이상이면 가능
		boolean c = age >= 5 && height >=200;
		System.out.println(c);
		
		// 키가 2미터 넘는 경우가 더 확률이 낮음
		// boolean c = height >=200 && age >= 5;
		
		// 키가 200cm이상이거나 나이가 5살 이상인가 
		boolean d = height >=200 || age >=5; 
		System.out.println(d);
		
		// d가 true면 e는 false
		// d가 false면 e는 true
		
		boolean e = !d;
		System.out.println(e);
	}
}
