package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		
		Employee e1=new Employee();
		e1.setName("ȫ�浿");
		e1.setPosition("���");
		worker.work(e1);
		
		Ceo ceo = new Ceo();
		ceo.setName("�ں���");
		ceo.setPosition("����");
		worker.work(ceo);
		
		Mannager mannager = new Mannager();
		mannager.setName("�����");
		mannager.setPosition("������");
		worker.work(mannager);
		
		PartTime partTime = new PartTime();
		partTime.setName("������");
		partTime.setPosition("�Ƹ�����Ʈ");
		worker.work(partTime);

	}

}
