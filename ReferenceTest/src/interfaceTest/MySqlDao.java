package interfaceTest;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Search in Oracle MySql");
		
	}

	@Override
	public void insert() {
		System.out.println("Insert in Oracle MySql");
		
	}

	@Override
	public void update() {
		System.out.println("Edit in Oracle MySql");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete in Oracle MySql");
		
	}



}
