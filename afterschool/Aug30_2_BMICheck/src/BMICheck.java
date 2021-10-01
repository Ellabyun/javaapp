import java.util.Scanner;

public class BMICheck {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("�񸸵� �˻�----");
		
		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("Ű(m����) : ");
		double height = k.nextDouble();
		
		if (height >= 3) {//����� Ŀ���� 3m�� �ƴϰ���
			height /= 100;//cm���� �߸� �豺..
		}
		
		System.out.print("������ : ");
		double w = k.nextDouble();
		
		System.out.println("----------");
		
		double bmi = (double) w/ (height*height) ;
		System.out.printf("BMI : %.2f\n",bmi);
		
		if(bmi >= 35) {
			System.out.println("����");
		} else if(bmi >=30) {
			System.out.println("�ߵ���(2�ܰ� ��)");
		} else if(bmi >= 25) {
			System.out.println("�浵��(1�ܰ� ��");
		} else if(bmi >= 23) {
			System.out.println("��ü��");
		} else if(bmi >=18.5) {
			System.out.println("����");
		} else {
			System.out.println("��ü��");
		}
		
		// ������ ���
		String result = "��ü��";
		if (bmi >= 35) {
			result = "�� ��";
		} else if (bmi >= 30) {
			result = "�ߵ� ��";
		} else if (bmi >= 25) {
			result = "�浵 ��";
		} else if (bmi >= 23 ) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		}
		System.out.println("-----");
		Thread.sleep(2000);
		System.out.printf("BMI : %.2f\n", bmi);
		Thread.sleep(3000);
		System.out.printf("%s���� %s\n", name, result);
	}	
}
