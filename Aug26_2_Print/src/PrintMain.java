// 버전 1.8.0-302 
// 1: major
// 8.0-302 : minor
// 뒷자리가 바뀔수록 조금 바뀐것임
// major버전이 바뀜 : 다른 프로그램
// 1.5때 크게 바뀌고 그 뒤로는 별 차이가 없음, 2.0 나오면 문법 달라질 수 있음.

// win 95 - 4.1
// win 98 - 4.5
// win 10 - 9.0(큰차이)

public class PrintMain {
	//모든 코드는 이 영역에
	public static void main(String[] args) {
		//여기다 쓴것만 실행
		
		// 콘솔창에 출력
		System.out.print("오늘 수업시작!");
		// 콘솔창에 출력하고 줄바꿈
		System.out.println("오늘 수업시작!");
		// 형식을 지정하면서 콘솔창에 출력, 값이 어쨌건 소수점 한자리만 출력하고 싶을때
		System.out.printf("%.1f",45.123);
		System.out.println();
		//
		// 특수문자 
		// 	\n - 줄바꿈, new line
		// 	\r - carriage return(커서 맨 앞으로)
		// 	\r\n - 완성된 줄바꿈
		// 		\n만 있어도 알아서 줄바꿈이 완성되는 프로그램도 존재(콘솔창)
		//	\t - tab(tab키 포인트 정해진 포인트로 이동, 절대적인 띄어쓰기 5번이 아님, 줄맞출때 씀)
		//	\b - back space (1byte지우기)
		//	\\ - \
		//	\" "
		System.out.println("지하철1호선");
		System.out.println("\\1350");
		System.out.println("ㅋ\nㅎ");
		System.out.println("ㅋㅋㅋ\rㅎㅎㅎ");
		System.out.println("집 :\t서울");
		System.out.println("직업 :\t무직");
		System.out.println("ㅋㅋㅋ\b");
		System.out.println("\"");
	}
}
