package classTest;

import java.util.Scanner;

public class MyMath {
	//������� long ���� 2��
	long a, b;
	
	//�޼ҵ� : add, subtract, multiply, divide
	//		: �Է°� ����, ��ȯ���� ������
	long add(){
		return a+b;
	}
	
	long subtract() {
		return a-b;
	}
	
	long multiply() {
		return a*b;
	}
	
	double divide() {
		return a/b;
	}
	
	static long add(long a, long b){
		//Cannot make a static reference to the non-static field a
		return a+b;
	}
	
	static long subtract(long a, long b) {
		return a-b;
	}
	
	static long multiply(long a, long b) {
		return a*b;
	}
	
	static double divide(double a, double b) {
		return a/b;
	}
}
