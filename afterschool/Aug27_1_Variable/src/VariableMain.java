//본인이 판단하기에 xx가 필요하다면 그때 쓰는거


//	어디다 저장? 

// CPU - 연산장치 => 좋으면 빠름

// RAM - 저장장치 => 좋으면 많이 저장(변수를 많이 만들 수 있음)
//		변수형태, 임시저장(자동삭제, 재부팅하거나..)
//		static - ???
//		stack - 프로그램 종료시 자동 반납 -> 종료안됐으면? 수동 반납 불가
//		heap - 자동 반납되지 않음 -> 개바자 수동으로 반납처리해야
//			Java에는 GarbageCollection기능이 있음
//				heap영역 자동정리 시스템 - 언제?

//16GB - 15.9GB남았음
//		다 썼으면 그 공간 반납

// SSD/HDD - 저장장치 => 좋으면 많이 저장
//		파일형태, 영구저장 -> 발전 -> DB
	//eclipse : ssd
	//.java : hdd
// GPU - 그래픽카드, 그래픽 표현하는데 필요한(CPU+RAM+HDD)

// 블록체인, 인공지능 

//변수(Variable)
//  데이터 담는 그릇 
//	프로그램 진행중에 만들어진 데이터를 저장할 때

// 문법
//		그릇종류 			그릇이름;
//		어떤데이터저장		그릇이름;
//		자료형(data type)	변수명;

// 알고리즘의 시대: 최대한 아낄 전략을 짜내는데 주력
// 지금은 유지보수의 시대

// 딥러닝, 인공신경망 - 옛날에 이미 만들어짐, 다만 하드웨어 부족으로 실현 불가

// 1bit = 0/1
// 1byte = 8bit

// 자료형
//		기본형
//			정수 - byte(1byte:-100~100), 
//					short(2 : -6만~6만), 
//					int(4 : -21억~21억) - 주력, 
//					long(8 : 큼)
//			실수 - float(4), double(8)- 주력
//			한글자 - char(2)
//			논리 - boolean(1)
//			없다 - void
//		참조형
//			문자열(여러글자) - String
//			기타등등...

// RAM: 16G 16000000000byte - 1byte

// 변수명
// 		마음대로
//			숫자로 시작불가 - IT전반적인 규칙
//			특수문자 불가(_ $는 괜찮음)
//			자바문법 불가

//			소문자로 시작
//			영어+숫자 조합으로
//			뜻을 알기 좋게
//				-> 근데 띄어쓰기는 못쓰니
//					korScore : 낙타체
//					kor_score : 뱀체

// = 같다X
// = 오른쪽에 있는것을 왼쪽에 넣어라.

// 기본자료형 
//		아무 처리도 안하고 값만 있으면 뭘로 인식?

// 컴 32bit/64bit -> 참조형 변수사이즈
public class VariableMain {
	public static void main(String[] args) {
		//국어점수가 80점인 것을 임시로 저장할 수 있게
		int kor; // 변수 만들기
		kor = 70; // 변수에 값 저장
		// variable 이름 한꺼번에 바꿀때: Refactor->Rename
		System.out.println("korScore"); 
		System.out.println(kor); //korScore변수에 들어있는 값 출력
		System.out.println(kor); //korScore변수에 들어있는 값 출력
		System.out.println(kor); //korScore변수에 들어있는 값 출력
		System.out.println(kor); //korScore변수에 들어있는 값 출력
		System.out.println(kor); //korScore변수에 들어있는 값 출력
		
		// 기온이 24.38도인거슬 임시로 저장할 수 있게
		// 변수 만들기
		// 변수에 값 저장
		
		// 그 변수에 들어있는 값 출력
		double temp;
		temp = 24.38;
		System.out.println(temp);
		
		float tempa;
		tempa = (float) 24.38;
		System.out.println(tempa);
		
		// 형변환(casting)
		//		(자료형)값
		
		// ㅋ라는 글자를 임시로 저장할 수 있게
		char laugh;
		laugh = 'ㅋ';
		System.out.println(laugh);
		
		// ㅋㅋ라는 글자를 임시로 저장할 수 있게
		String laugh2;
		laugh2 = "ㅋㅋ";
		System.out.println(laugh2);
		
		// 배고픈가를 임시로 저장할수 있게
		boolean isHungry;
		isHungry = true;
		System.out.println(isHungry);
		
		//각각의 기본형에 대응하는 참조형이 존재함
		
		//java에서 지역변수를 만들고 값을 안 넣으면 사용이 불가능
//		int age; 
//		System.out.println(age);
		
		int age = 35;
		System.out.println(age);
		

		
	}
}
