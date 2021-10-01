import java.util.Scanner;

public class FatTest {
	public static void main(String[] args) throws InterruptedException {
		//키보드 입력받을 준비
		
		// 제목하나
		// 이름받기
		// 키받기
		// 몸무게받기
		// 줄하나
		// 표준체중계산
		// 비만도계산
		// 결과판정
		// 결과출력
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("비만도 검사----");
		System.out.print("이름 : ");
		String name = k.next();
		System.out.print("키 : ");
		double h = k.nextDouble();
		System.out.print("몸무게 : ");
		double w = k.nextDouble();
		
		System.out.println("----------");
		
		double standardWeight = (h - 100) * 0.9;
		System.out.printf("표준체중 : %.2fkg\n",standardWeight);
		double fatRate = (w / standardWeight) * 100;
		System.out.printf("비만도 : %.2f%%\n",fatRate);
		String say = (fatRate>=120) ? "%s씨는 비만":"%s씨는 정상";
		System.out.printf(say,name);
		// 선생님 답안
		// String result = (fatRate >120) ? "비만" : "정상";
		// System.out.printf("%s씨는 %s\n, name, result);
		// 
		Thread.sleep(5000);
		
		//또는
		// System.out.println("끄고싶으면 뭐라도 쳐요");
		// String t = k.next()
	
	}

}
