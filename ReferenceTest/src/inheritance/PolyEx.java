package inheritance;

public class PolyEx {

	public static void main(String[] args) {
		
		Parent2 p2 = new Child3();//업캐스팅, 형변환 필요없음
		
		p2.field1="";
		p2.method1();
		p2.method2();//오버라이딩 된 상태라면 자식 클래스의 메소드가 호출됨
		
		//method3 어떻게 호출?
		
		Child3 c =(Child3) p2;
		c.method3();
		
		Parent2 obj = new Parent2();
		Child3 c2 = (Child3) obj;//java.lang.ClassCastException
		c2.method3();

	}

}
