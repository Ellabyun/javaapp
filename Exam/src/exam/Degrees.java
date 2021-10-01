package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// 화씨온도 => 섭씨온도
		
		//조건
		//화씨온도 입력받기(정수)
		//받은 화씨온도 =>섭씨온도로 변환 후 출력하기
		// (F-32)*5/9=C
		
		Scanner k = new Scanner(System.in);
		
		int f = k.nextInt();
		System.out.print("Fahrenheit : ");
		
		int c = (f-32)*5/9;
		System.out.printf("Celsius : %d", c );

	}

}
