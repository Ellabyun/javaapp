package classTest;

public class MethodTest2 {
	
	// 두 개의 숫자(정수, 실수)를 받아서 더한 결과를 보내주는 것
	// 정수형의 두 개의 숫자(입력값)
	int sum(int num1, int num2) {
		//return num1+num2;
		int result = num1+num2;
		return result;//(출력값, 반환값)
	}
	
	//구구단 2~9단 출력
	//입력값 : 없음, 반환값: 없음
	void print99dan() {
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d",i,j,i*j);
				
			}
		}
	}
	
	//두 개의 정수를 받아서(입력값) 곱하기한 결과를 리턴
	int multiply(int x, int y) {
		return x * y;
	}

}
