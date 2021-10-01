package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)
		// partner- computer
		// create random 1~3 => 3
		
		// I input 1~3
		
		// you lost/you won/same same
		// use switch
		
		int compt = (int) (Math.random()*3+1);
		System.out.println(compt);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 1,2,3 : ");
		int me = sc.nextInt();
		
		int result = compt - me;
		
		switch (result) {
		case 1:
		case -2:
			System.out.println("loser");			
			break;
		case 2:
		case -1:
			System.out.println("winner");			
			break;
		default:
			System.out.println("tie");			
			break;
		}

	}

}
