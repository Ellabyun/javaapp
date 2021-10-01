import java.util.Scanner;

public class LastWeekMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = k.nextDouble();
		System.out.print("세로 : ");
		double depth = k.nextDouble();
		System.out.print("높이 : ");
		double height = k.nextDouble();
		System.out.print("무게 : ");
		double weight = k.nextDouble();
		
		System.out.println("-----");
		
		double volume = width * depth * height;
		System.out.printf("부피 : %.1fcm3\n", volume);
		System.out.printf("무게 : %.1fkg\n", weight);
		
		// 부피 : cm3
		// 무게 : kg
		
		// o o -> X
		// o x -> o
		// x o -> o
		// x x -> x
		
		// 부피가 10미만이든지, 무게가 1000미만이든지 하나만(XOR)
		boolean d = volume < 10 ^ weight < 1000;
		System.out.println(d);
		
		//부피가 10이상이고 무게가 1000이상이면 
		boolean a = volume >= 10 && weight >= 1000;
		System.out.println(a);
		
		// 더 좋은 경우!! 부피가 10 넘는 경우는 흔하지만 1000키로 넘는거는 드뭄
		// 그러니 드문 경우(확률이 낮은 경우)를 앞으로 보내는 것이 효율적이다.
		
		//boolean a = weight >= 1000 && volume >= 10;
		//System.out.println(a);
				
		//부피가 10미만이거나, 무게가 1000미만이면 
		boolean b = volume < 10 || weight < 1000;
		System.out.println(b);
		
		//or인 경우 앞에서 true가 나오면 true, 확률이 높은 것을 앞에 배치
		//boolean b = weight < 1000 || volume < 10;
		//System.out.println(b);
		
		//무게가 20이상이고 무게가 30이상이면 
		boolean c = weight >= 20 && weight >= 30;
		System.out.println(c);
		
		//즉, 30이상 
		//boolean c = weight >= 30;
		//System.out.println(c);
		
		// and의 경우 &나 && 다 되지만, &&인 경우 A가 틀리면 연산을 끝내버려서
		// 컴퓨터의 일을 줄여준다.
		
	}
}
