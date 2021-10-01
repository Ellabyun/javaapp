package array;

public class test2 {

	public static void main(String[] args) {
		// 3개 쓰다가
		int oldArr[] = {10,20,30};
		
		// 4개의 공간 선언
		int newArr[] = new int[4];
		
		//기존 값 새로운 곳으로 복사
//		for(int i=0;i<oldArr.length;i++) {
//			newArr[i]=oldArr[i];
//		}
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		//1개 추가
		newArr[3] = 40;
		
		for(int i:newArr) {
			System.out.print(i+" ");
		}

	}

}
