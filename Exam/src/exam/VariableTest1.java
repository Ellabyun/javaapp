package exam;

/* ������ ��ȿ����(scope)
 * �� ����� ��� �������� ���
 * �� ����(����)����(stack�� ���� �ֵ�)�� �ݵ�� �ʱ�ȭ �ؾ���
 */
public class VariableTest1 {
	
	// ���� => ���ú��� �ƴ�
	private int num1;
	
	// �޼ҵ�
	public static void main(String[] args) {
		int num2 = 0;
		
		if(num2<10) {
			System.out.println(num2);
			
			int num3 = 3;
		}
		for(int i=0;i<10;i++) {
			System.out.println(i+"  ");
		}
		
		System.out.println();
		
	}
	
	public void print() {
		System.out.println(num1);

	}

}
