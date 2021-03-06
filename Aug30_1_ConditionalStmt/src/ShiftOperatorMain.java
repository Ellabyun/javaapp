// 24시간 = 1 << 0 	: 1
// 주차 = 1 << 1 		: 2
// 흡연실 = 1 << 2		: 4
// 와이파이 = 1 << 3	: 8
// 배달 = 1 << 4 		:16

// 실행 : ctrl (왼쪽) + f11
// 디버그 : f11

// 점찍고, f11
public class ShiftOperatorMain {
	public static void main(String[] args) {
		int value = 30;
		
		// break point
		// 배열, 컬렉션
		if (value >= (1<<4)) {
			System.out.println("배달");
			value -= (1<<4);
		}
		System.out.println(value);
		
		if (value >= (1<<3)) {
			System.out.println("와이파이");
			value -= (1<<3);
		}
		System.out.println(value);
		
		if (value >= (1<<2)) {
			System.out.println("흡연실");
			value -= (1<<2);
		}
		System.out.println(value);
		
		if (value >= (1<<1)) {
			System.out.println("주차");
			value -= (1<<1);
		}
		System.out.println(value);
		
		if (value >= (1<<0)) {
			System.out.println("24시간");
			value -= (1<<0);
		}
		System.out.println(value);
	}
}
