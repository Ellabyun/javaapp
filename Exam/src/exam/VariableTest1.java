package exam;

/* 변수의 유효범위(scope)
 * ① 선언된 블록 내에서만 사용
 * ② 로컬(지역)변수(stack에 들어가는 애들)는 반드시 초기화 해야함
 */
public class VariableTest1 {
	
	// 변수 => 로컬변수 아님
	private int num1;
	
	// 메소드
	public static void main(String[] args) {
		int num2 = 0;
		
		if(num2<10) {
			System.out.println(num2);
			
			int num3 = 3;
		}
		for(int i=0;i<10;i++) {
			System.out.println(i+"  ");
		}
		
		System.out.println();
		
	}
	
	public void print() {
		System.out.println(num1);

	}

}
