package shop;

import java.util.Scanner;

public class ShopEx {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		//���� �̸� ����
		shop.setTitle("Ella Shop");
		//�� ����
		shop.genUser();
		
		//��ǰ ����
		shop.genProduct();
		
		//���� ����
		shop.start();

	}
}
