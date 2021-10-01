package classTest;

public class Numbers {
	private int num[];

	public Numbers(int[] num) {
		super();
		this.num = num;
	}
	
	//�հ� => ��ȯ���� int, �Է°��� ����
	//	 => ������� num �迭�� ����ִ� ���� �հ� ����
	int getTotal() {
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
		
	}
	//��� => ��ȯ���� double, �Է°��� ����
	//	 => �հ� �޼ҵ带 �̿��ؼ� ��� ���� �� ����
	double getAverage() {
		//
		return (double)getTotal()/num.length;
	}
	
}