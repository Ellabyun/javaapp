package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// int Ÿ���� �迭 5�� ����
		// 0 10 20 30 40
		int score[] = {0, 10, 20, 30, 40};
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}
		System.out.println();
		
		//���� for��
		for(int idx:score) {
			System.out.println(idx+"\t");
		}
		
		// String Ÿ���� �迭 5�� ����
		// �����̸� �ʱ�ȭ
		String fruit[] = {"apple", "grape", "orange", "cherry", "mango"};
		for(int i=0;i<fruit.length;i++) {
			System.out.print(fruit[i]+"\t");
		}
		System.out.println();
		
		// ���� for��
		for(String f:fruit) {
			System.out.print(f+"\t");
			
		}

	}

}
