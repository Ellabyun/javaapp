package classTest;

public class DataEx {

	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("data:"+data);
		//x�� �� 10���� ����
//		data.x = 10;
//		change(data.x);//data ��ü ���� x��������� ������ ��(10)�� ����
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
