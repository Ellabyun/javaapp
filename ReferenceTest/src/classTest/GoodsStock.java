package classTest;

public class GoodsStock {
	//�Ӽ� : ��ǰ�ڵ�(p12345), ������(100)
	String code;
	int stockNum;
	
	//���: ������ ����(�Է°� ����, ��°��� ����), 
	//		������ ����(�Է°� ����, ��°��� ���� ������)
	
	void addStock(int amount) {
		stockNum+=amount;
	}
	
	int subtrackStock(int amount) {
		if(stockNum > amount) {
			stockNum-=amount;
		}
		return stockNum;
	}

}
