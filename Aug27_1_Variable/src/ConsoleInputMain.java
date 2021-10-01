import java.util.Scanner;
// alt 왼/오 : 이전파일/이후파일

// error
// warning
// exception

// 콘솔 입력받는 프로그램 만드시오

public class ConsoleInputMain {
	public static void main(String[] args) {
		// 키보드 입력받을 준비해서 k에 저장함
		Scanner k = new Scanner(System.in);
		
				
		// 식당 이름 입력받기
		System.out.print("식당 이름 : ");
		
		// 콘솔에 입력한 정보를 name에 저장
		String name = k.next();

		System.out.print("식당 크기: ");
		double size = k.nextDouble();
		
		System.out.print("테이블 수: ");
		int table = k.nextInt();
			
		System.out.print("영업여부: ");
		boolean restOpen = k.nextBoolean();
		
		k.close();
		
		System.out.println("************");
		System.out.println(name);
		System.out.println(size);
		System.out.println(table);
		System.out.println(restOpen);
		System.out.println("************");	
	}

}
