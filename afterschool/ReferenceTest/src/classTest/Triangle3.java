package classTest;

public class Triangle3 {
	//삼각형 넓이 구하기
	//밑변*높이/2
	
	//속성:밑변, 높이
	private int baseLine;
	private int height;
	
	//생성자 오버로드
	Triangle3(int baseLine, int height) {
		this.baseLine = baseLine;
		this.height = height;
	}
	
	//기능(메소드): 밑변*높이/2 결과 리턴
	int getArea() {
		return baseLine * height /2;
	}
	

}
