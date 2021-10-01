package afterschool;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// there are 3 students, they have test for 3 curiculum
		// 2차원 배열
		
		
		int student[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("각 학생의 과목별 점수를 입력해 주세요");
		for(int i=0;i<student.length;i++) {
			System.out.printf("%d번\n",i+1);
			for(int j=0;j<student[i].length;j++) {
				student[i][j]=sc.nextInt();
			}
		}

		// 출력
		// 각 학생의 과목 총합과 평균 출력
		System.out.println("------------- 학생별 점수 현황 --------------");
		System.out.println("번호\t java\t html\t spring\t 총합 \t 평균");
		System.out.println("---------------------------------------");
		for(int i=0;i<student.length;i++) {
			System.out.printf("%d번\t",i+1);
			for(int j=0;j<student[i].length;j++) {
				System.out.print(student[i][j]+"\t");
				sum+=student[i][j];
			}
			System.out.printf("%d\t%.1f\n",sum,(double)sum/student[i].length);
			sum=0;
		}
	}

}
