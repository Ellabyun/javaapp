package interfaceTest;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Search in Oracle DB");
		
	}

	@Override
	public void insert() {
		System.out.println("Inset in Oracle DB");
		
	}

	@Override
	public void update() {
		System.out.println("Edit in Oracle DB");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete in Oracle DB");
		
	}


	
}
