package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		// ���� ����
		// ����Ÿ�� => byte(1byte=8bit)<short(2byte)<int(4byte) < long(8byte)
		// �Ǽ�Ÿ�� => float(4byte)<double(8byte)
		
		byte byteValue = 10;
		
		// �ڵ� ����ȯ(���θ��)
		int intValue = byteValue;
		System.out.println(intValue);
		
		// ���θ��
		intValue = 500;
		long longValue = intValue;
		
		char charValue = 'A';//�ƽ�Ű�ڵ忡�� 65
		char charValue2 = 1;
		
		int charValue3 = charValue+charValue2;
		
		System.out.println(charValue3);//66
		
		// ���� ����ȯ(casting)
		System.out.println((char)charValue3);//B
		
	}
}
