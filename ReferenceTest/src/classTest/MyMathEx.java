package classTest;

public class MyMathEx {

	public static void main(String[] args) {
		//static메소드(클래스 메소드) 호출 => 객체 생성 없음
		System.out.println(MyMath.add(200L, 100L));
		System.out.println(MyMath.subtract(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200.0, 100.0));
		
		System.out.println();
		//멤버메소드 호출
		MyMath math = new MyMath();
		
		math.a = 600L;
		math.b = 300L;
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());

	}

}
