package test;

public class Exam1 {
	public static void main(String[] args) {
		//�ֻ��� 2�� ������
		//������ �ֻ��� �� ���(1,4)
		
		//�ֻ��� ���� �հ谡 5�� �ƴϸ� �ֻ����� ��� ������
		//5�� �Ǹ� ������ ���߱�
		
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
