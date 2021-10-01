import java.util.Scanner;

public class BMICheck {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("비만도 검사----");
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키(m단위) : ");
		double height = k.nextDouble();
		
		if (height >= 3) {//사람이 커봐야 3m는 아니겠지
			height /= 100;//cm으로 잘못 썼군..
		}
		
		System.out.print("몸무게 : ");
		double w = k.nextDouble();
		
		System.out.println("----------");
		
		double bmi = (double) w/ (height*height) ;
		System.out.printf("BMI : %.2f\n",bmi);
		
		if(bmi >= 35) {
			System.out.println("고도비만");
		} else if(bmi >=30) {
			System.out.println("중도비만(2단계 비만)");
		} else if(bmi >= 25) {
			System.out.println("경도비만(1단계 비만");
		} else if(bmi >= 23) {
			System.out.println("과체중");
		} else if(bmi >=18.5) {
			System.out.println("정상");
		} else {
			System.out.println("저체중");
		}
		
		// 선생님 답안
		String result = "저체중";
		if (bmi >= 35) {
			result = "고도 비만";
		} else if (bmi >= 30) {
			result = "중도 비만";
		} else if (bmi >= 25) {
			result = "경도 비만";
		} else if (bmi >= 23 ) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		}
		System.out.println("-----");
		Thread.sleep(2000);
		System.out.printf("BMI : %.2f\n", bmi);
		Thread.sleep(3000);
		System.out.printf("%s씨는 %s\n", name, result);
	}	
}
