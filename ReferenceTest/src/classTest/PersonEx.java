package classTest;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234566", "ȫ�浿");
		
		//The final field Person.nation cannot be assigned
		p1.nation = "USA";

	}

}
