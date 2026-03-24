package day07;

import java.util.Scanner;

public class MultiArray03_1 {

	public static void main(String[] args) {
		// 성적표
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("성적 산출 인원:");
		int tester =scan.nextInt();// 인원수
		int subject=3; // 과목수
		
		String[] name=new String[tester];
		int[][] scores=new int[tester][subject];
		int[] total=new int[tester];
		double[] avg=new double[tester];
		int[] ranking=new int[tester];
		
			
		//이름 입력 받기
		for(int i=0;i<tester;i++) {
			System.out.println((i+1)+"번째 학생>");
			name[i]=scan.next();
			System.out.println(name[i]+"의 성적입력:");
			
			for(int j=0;j<scores[i].length;j++) {
				scores[i][j]=(int)(Math.random()*70)+30; //랜덤 성적입력
				total[i]+=scores[i][j];
			}
			avg[i]=total[i]/(double)subject;
		}
		
		
		

	}

}
