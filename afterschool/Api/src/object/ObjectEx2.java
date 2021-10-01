package object;

public class ObjectEx2 {

	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();	
		
		//toString=> 객체를 문자열로 표현
		//object가 상속하는 문자열은 package명 class명.. 주소값을 돌려줌
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		// String이 사용하는 toString을 오버라이딩 적용 => 객체가 가지고 있는 값 출력
		String str1 ="홍길동";
		String str2="홍길동";
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		//toString() => object가 넘겨준대로 => 10값을 출력하도록 오버라이딩
		System.out.println(value1.toString());
		System.out.println(value2.toString());
	}
}
