package exception;

//Exception(예외사항)
//CheckedException : compile시 나타나는 예외
//UnCheckedException : run time시 나타나는 예외
public class CheckedException {

	public static void main(String[] args) {
		// ClassNotFoundException
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
