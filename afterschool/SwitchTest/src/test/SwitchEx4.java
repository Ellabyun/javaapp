package test;

public class SwitchEx4 {

	public static void main(String[] args) {
		// 8: go to work
		// 9: set a meeting
		// 10: routine job
		// etc: business trip
		
		// output number between 8~11
		// (int)(Math.random()*6) => 0~5 
		// (int)(Math.random()*4) => 0~3 
		int time = (int)(Math.random()*4)+8;
		
		switch (time) {
		case 8:
			System.out.println("go to work");			
			break;
		case 9:
			System.out.println("set a meeting");			
			break;
		case 10:
			System.out.println("routine job");			
			break;
		default:
			System.out.println("business trip");
			break;
		}

	}

}
