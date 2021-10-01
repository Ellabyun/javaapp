package classTest;

public class DataEx {

	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("data:"+data);
		//x의 값 10으로 지정
//		data.x = 10;
//		change(data.x);//data 객체 안의 x멤버변수가 가지는 값(10)을 보냄
//		System.out.println("after Change() x = "+data.x);
		System.out.println();
		change(data);

		System.out.println("after Change() x = "+data.x);
	}
	
	static void change(int x) {
		x=10000;
		System.out.println("Change() x = "+x);
		
	}
	
	static void change(Data d) {
		System.out.println(d);
		d.x=10000;
		
	}

}
