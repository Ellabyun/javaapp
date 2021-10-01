package test;

public class TypeTest1 {

	public static void main(String[] args) {
		// 타입 - 1) 기본타입  2) 참조타입
		// 변수의 메모리 사용되는 방식이 달라짐
		
		//기본타입 => stack에 생성
		int age = 25;
		double price = 200.3;
		
		
		//참조타입 => heap에 생성 / null로 초기화 / 
		//문자열 생성 : String name1 = new String("java");
		String name = "java";
		String name1 = new String("java");
		String hobby = null;// 아직 힙 영역이 할당되지 않은것
		
		// 값 비교 ==, !=
		//			equals()
		System.out.println(name == name1 ? "동일함" : "다름");
		//=> stack에 입력된 주소를 비교하는 것일뿐임
		System.out.println(name.equals(name1) ? "동일함" : "다름");
		//=> heap으로 가서 컨텐츠 비교
		System.out.println(hobby);
		// java.lang.NullPointerException
		System.out.println(hobby.length());
	}

}
