package afterschool;

public class Exam8 {

	public static void main(String[] args) {
		// array => heap(new)
		
		// array declare �迭 ����
		int arr[] ;
		// create ����
		arr = new int [10];
		// �ʱ�ȭ 1~10 ���� ����
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]+" ");
			arr[i]=i+1;
		}
		// ���
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println(arr[10]);
	}

}
