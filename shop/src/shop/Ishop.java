package shop;

// �����߻�ȭ => ����ʵ常 ������. �߻�޼ҵ常 ����
// jdk8 => default, static �޼ҵ� ���� �� �ֱ�� ��.

public interface Ishop {
	void setTitle(String title); // public abstract �κ��� ������
	void genUser();
	void genProduct();
	void start();

}
