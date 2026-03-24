package day07;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표 만들기
		/*
		 * 성적산출인원 > 입력받기
		 * 이름 국어 영어 수학 합계 평균 등수 \t
		 * hong 89 85  78  00  00  0  
		 * kim  89 85  78  00  00  0  
		 * lee  89 85  78  00  00  0  
 		 *
 		 *이름 국어 영어 수학 받기
 		 *
		 */

		
		//이름, 각 과목 입력 받기
		//{이름,국어,영어,수학}
		//점수는 숫자로 변환 후 계산
		
		
		int student=0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("학생 수 입력:");
		student=scan.nextInt();
		
		String[][] score= new String[student][4];
		
		for(int i=0; i<student;i++) {
			for(int j=0; j<4; j++) {
				if(j==0) {
					System.out.println("이름 입력:");
					score[i][j]=scan.next();
				}
				if(j==1) {
					System.out.println("국어 입력:");
					score[i][j]=scan.next();
				}
				if(j==2) {
					System.out.println("수학 입력:");
					score[i][j]=scan.next();
				}
				if(j==3) {
					System.out.println("영어 입력:");
					score[i][j]=scan.next();
				}
				
				
			}
			System.out.println(Arrays.deepToString(score));
			System.out.println();
		
		}
		
		//성적표 출력
		int sum=0;
		double avg=0;
		int[] totalSum=new int[student]; //ai
		int[] rank=new int[student]; //ai
		
		//합계,평균
		for(int i=0;i<student;i++) {
			sum=0;
			for(int j=1;j<4;j++) {
				sum+=Integer.parseInt(score[i][j]);
			}
			
			totalSum[i]=sum;
			
		}
		
		//ai도움 받음
		for(int i=0; i<student;i++) {
			int cnt=1;
			for(int j=1; j<student;j++) {
				if(totalSum[j]>totalSum[i]) {
					cnt++;
				}
				rank[i]=cnt;
			}
		}
		
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		
		for(int i=0;i<student;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(score[i][j]+"\t");
			}
			avg=totalSum[i]/3.0;
			System.out.print(totalSum[i]+"\t");
			System.out.printf("%.2f\t", avg);
			System.out.print(rank[i]);
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
