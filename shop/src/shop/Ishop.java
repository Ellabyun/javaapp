package shop;

// 완전추상화 => 상수필드만 가진다. 추상메소드만 가짐
// jdk8 => default, static 메소드 가질 수 있기는 함.

public interface Ishop {
	void setTitle(String title); // public abstract 부분이 생략됨
	void genUser();
	void genProduct();
	void start();

}
