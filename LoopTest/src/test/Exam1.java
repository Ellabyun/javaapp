package test;

public class Exam1 {
	public static void main(String[] args) {
		//주사위 2개 던지기
		//나오는 주사위 눈 출력(1,4)
		
		//주사위 눈의 합계가 5가 아니면 주사위를 계속 던져라
		//5가 되면 실행을 멈추기
		
		while(true) {
			
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			
			System.out.printf("(%d, %d)\n",dice1,dice2);
			
			if(dice1+dice2==5) {
				break;
			}
		}
	}

}
