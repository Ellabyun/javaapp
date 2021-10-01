package exception;

public class LoginEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			login("white","12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		//id가 "blue"가 아니라면 NotExistIDException 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIDException("ID가 존재하지 않습니다.");
		}
		//password가 "12345"가 아니라면 WrongPasswordException 발생
		if(!password.contentEquals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다");
		}
	}
}
