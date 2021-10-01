import java.util.Scanner;

// 조건문
// 반복문
// 컬렉션
// 특징
// -> 집 날씨

// 마트
// 가격:
//-----------
// xxxx원어치 구매함
// 적립 포인트 : 

// 1%

// 흐름 제어
//		조건문
//		반복문


// 조건문 : 특정 조건때만 흐름이 넘어오도록
//		if 
//		switch
// 
public class CSMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("마트");
		System.out.print("가격 : ");
		int price = k.nextInt();	
		
		System.out.println("---------");
		System.out.printf("%d원어치 구매함\n", price);
		
		int point = price/100;
		
		if (price >= 10000) {
			point += 50;			
		}
		// 2만원이상이고 10원짜리 안 받는 상황이면 포인트 100점 더 아니면 10점 추가
		if (price > 20000 && price < 50000 ) {
			point += 100;
		}else {
			point += 10;
		}
		System.out.printf("적립 포인트 : %d\n", point);
	}
}
