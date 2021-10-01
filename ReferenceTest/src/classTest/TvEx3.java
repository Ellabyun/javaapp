package classTest;

public class TvEx3 {

	public static void main(String[] args) {
		
		//TV3 객체를 3개 생성하고 싶다.
		
//		TV3 tv1 = new TV3();
//		TV3 tv2 = new TV3();
//		TV3 tv3 = new TV3();
		
		// => 배열
		
		TV3 tvArr[] = new TV3[3]; //int arr[] = new int[3];
		
		tvArr[0] = new TV3("빨강",true,5);
		tvArr[1] = new TV3("파랑",false,6);
		tvArr[2] = new TV3("노랑",true,8);
		
		printArr(tvArr);

	}
	
	static void printArr(TV3 tvArr[]) {
		//tvArr에 들어있는 객체의 내용을 출력
		
		for(int i=0;i<tvArr.length;i++) {
			System.out.println("TV색상 "+tvArr[i].getColor());
			System.out.println("TV전원 "+tvArr[i].isPower());
			System.out.println("TV채널 "+tvArr[i].getChannel());
			System.out.println();
			
		}

	}

}
