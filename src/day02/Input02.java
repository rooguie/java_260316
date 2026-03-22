package day02;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		// 국어,영어,수학점수를 입력받기
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("국어>");
		int kor=scan.nextInt();

		System.out.println("영어>");
		int eng=scan.nextInt();

		System.out.println("수학>");
		int math=scan.nextInt();
		
		//국어,영어,수학의 값이 0보다 작거나, 100보다 크면
		//잘못된 점수
		
		if((kor<0 || eng<0 || math<0)||(kor>100||eng>100||math>100)) {
			System.out.println("잘못된 점수 입력");
//			return; //나를 실행하는 메서드 종료
		}else {

		int sum=kor+eng+math;
		float avg=(float)sum/3;
		
		System.out.println("합계="+sum+" 평균="+avg);
		
		if (avg>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
		scan.close();
		}
	}

}
