package day05;

import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 가위바위보
		 * 가위=0 바위=1 보=2
		 * 컴퓨터는 랜덤
		 * 유저는 입력
		 */
		Random random =new Random();
		
		int user=0;
		int com=0;

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("가위바위보 게임");
		
		while(true) {
			System.out.println("0.가위, 1.바위, 2.보 3.종료 셋 중 하나 선택");
			user=scan.nextInt();
			
			com=random.nextInt(3);
			
			if(user==0 || user==1 || user==2) {
				
				if(user==0) {
					System.out.println("유저: 가위");
					if(com==0) {
						System.out.println("컴퓨터: 가위");
						System.out.println("비겼습니다.");
					}
					if(com==1) {
						System.out.println("컴퓨터: 바위");
						System.out.println("졌습니다.");
					}
					if(com==2) {
						System.out.println("컴퓨터: 보");
						System.out.println("이겼습니다.");
					}
					
				}
				
				else if(user==1) {
					System.out.println("유저: 바위");
					if(com==0) {
							System.out.println("컴퓨터: 가위");
							System.out.println("이겼습니다.");
					}
					if(com==1) {
							System.out.println("컴퓨터: 바위");
							System.out.println("비겼습니다.");
					}
					if(com==2) {
							System.out.println("컴퓨터: 보");
							System.out.println("졌습니다.");
					}
					
				}
				else {
					System.out.println("유저: 보");
					if(com==0) {
						System.out.println("컴퓨터: 가위");
						System.out.println("졌습니다.");
					}
					if(com==1) {
						System.out.println("컴퓨터: 바위");
						System.out.println("이겼습니다.");
					}
					if(com==2) {
						System.out.println("컴퓨터: 보");
						System.out.println("비겼습니다.");
					}
				}
								
			}
			
			else if(user==3){
				System.out.println("프로그램 종료");
				break;
			}
			
			else {
				System.out.println("잘못선택하셨습니다.");
			}
		}

		

		
		
		
	}

}
