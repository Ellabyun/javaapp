package classTest;

public class CarEx2 {

	public static void main(String[] args) {
		//ù���� ��
		//��ü ������ ������ �ڵ� ȣ���
		Car2 car = new Car2();
		// �⺻ �Ӽ����� String => null, int=>0, 
		// boolean => false, double => 0.0
		
		// �ι��� ��
		Car2 car2 = new Car2("kona");
		
		//����° ��
		Car2 car3 = new Car2("kona","black");
		
		//�׹�° ��
		Car2 car4 = new Car2("����","kona","black",250);
		
		
		//The field Car2.company is not visible(private���� �ؼ�)	
//		car.company = "Kia";
//		car.model = "seltos";
//		car.color = "Dark Grey";
//		car.maxSpeed = 200;
		
//		car.forward();
		//�ι��� ��
		//��ü ������ ������ �ڵ� ȣ���
//		Car2 car2 = new Car2();
		
//		car2.company = "hyundai";
//		car2.model = "sant fe";
//		car2.color = "white";
//		car2.maxSpeed = 250;
		
//		car.forward();
		
	}

}
