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
//		Random random =new Random();
//		
//		int user=0;
//		int com=0;
//
//		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("가위바위보 게임");
//		
//		while(true) {
//			System.out.println("0.가위, 1.바위, 2.보 3.종료 셋 중 하나 선택");
//			user=scan.nextInt();
//			
//			com=random.nextInt(3);
//			
//			if(user==0 || user==1 || user==2) {
//				
//				if(user==0) {
//					System.out.println("유저: 가위");
//					if(com==0) {
//						System.out.println("컴퓨터: 가위");
//						System.out.println("비겼습니다.");
//					}
//					if(com==1) {
//						System.out.println("컴퓨터: 바위");
//						System.out.println("졌습니다.");
//					}
//					if(com==2) {
//						System.out.println("컴퓨터: 보");
//						System.out.println("이겼습니다.");
//					}
//					
//				}
//				
//				else if(user==1) {
//					System.out.println("유저: 바위");
//					if(com==0) {
//							System.out.println("컴퓨터: 가위");
//							System.out.println("이겼습니다.");
//					}
//					if(com==1) {
//							System.out.println("컴퓨터: 바위");
//							System.out.println("비겼습니다.");
//					}
//					if(com==2) {
//							System.out.println("컴퓨터: 보");
//							System.out.println("졌습니다.");
//					}
//					
//				}
//				else {
//					System.out.println("유저: 보");
//					if(com==0) {
//						System.out.println("컴퓨터: 가위");
//						System.out.println("졌습니다.");
//					}
//					if(com==1) {
//						System.out.println("컴퓨터: 바위");
//						System.out.println("이겼습니다.");
//					}
//					if(com==2) {
//						System.out.println("컴퓨터: 보");
//						System.out.println("비겼습니다.");
//					}
//				}
//								
//			}
//			
//			else if(user==3){
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//			else {
//				System.out.println("잘못선택하셨습니다.");
//			}
//		}

		String[] choice= {"가위","바위","보"};
		
		//System.out.println(choice[2]);
		
		Scanner scan=new Scanner(System.in);
		
		int comNum=0;
		int myNum=0;
		//결과 값 넣기
		String result="";
		
		//반복 게임코드
		while(true) {
		
			
		//0~2 사이의 값만 가능
		System.out.println("가위바위보 게임 시작>");
		
		comNum = (int)(Math.random()*3); // 0부터 3개의 숫자 랜덤 출력
		
		System.out.println("컴퓨터 결정 완료!!");
		
		System.out.println("가위(0) 바위(1) 보(2) 중 하나 선택>");
		
		myNum=scan.nextInt();
		
		
		//승패 비교
		if(myNum<0 || myNum>2) {
			System.out.println("잘못 입력");
		
		}
		
		if(myNum==3) {
			System.out.println("프로그램 종료");
			break;
		}
		
	
		
		if(comNum==myNum) {
			System.out.println("유저 결정 완료"+myNum+choice[myNum]);
			result="무승부";
			
			//출력
			System.out.println("Com("+choice[comNum]+")"+"User("+choice[myNum]+")"+result);
		}
		
		else {
			System.out.println("유저 결정 완료"+myNum+choice[myNum]);
			if(myNum==0) {
				result = (comNum==2) ? "유저 승" : "유저 패";
			}
			else if(myNum==1) {
				result = (comNum==0) ? "유저 승" : "유저 패";
			}
			else {
				//myNum==2
					result = (comNum==1) ? "유저 승" : "유저 패";	
			}
			
			//출력
			System.out.println("Com("+choice[comNum]+")"+"User("+choice[myNum]+")"+result);
		 }
		
		
		}
	
		
		
		
		
		scan.close();
		
		
	}

}
