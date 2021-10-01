package string;

// String => Immutable(변하지 않는다)

public class Replace {

	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		
		// 자바 => Java
		// String 자체는 불변하므로, 다시 담아야 한다.
//		str1 = str1.replace("자바", "java");
		
		str1 = str1.replaceFirst("자바", "Java");
		
		System.out.println(str1);

	}

}
