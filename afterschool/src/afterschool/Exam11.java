package afterschool;

public class Exam11 {

	public static void main(String[] args) {
		// array => heap(new)
		
		// array declare �迭 ����� ����, �ʱ�ȭ
		int arr[]= {100,25,73,54,65,67,79,8,9,10};

		// ���
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		// ���� for��
		for(int j:arr) {
			System.out.println(j+" ");			
		}

	}

}
