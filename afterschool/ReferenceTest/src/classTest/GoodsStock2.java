package classTest;

public class GoodsStock2 {
	//�Ӽ� : ��ǰ�ڵ�(p12345), ������(100)
	private String code;
	private int stockNum;
	
	//�⺻ ������
	GoodsStock2(){}
	
	//������ �����ε�
	GoodsStock2(String code,int stockNum){
		this.code = code;
		this.stockNum = stockNum;
	}
	
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
	
	//���� �������� �����ϴ� ���
	int getStockNum() {
		return stockNum;
	}

}
