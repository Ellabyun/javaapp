package array;

public class test2 {

	public static void main(String[] args) {
		// 3�� ���ٰ�
		int oldArr[] = {10,20,30};
		
		// 4���� ���� ����
		int newArr[] = new int[4];
		
		//���� �� ���ο� ������ ����
//		for(int i=0;i<oldArr.length;i++) {
//			newArr[i]=oldArr[i];
//		}
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		//1�� �߰�
		newArr[3] = 40;
		
		for(int i:newArr) {
			System.out.print(i+" ");
		}

	}

}
