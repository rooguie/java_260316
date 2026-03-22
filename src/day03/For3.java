package day03;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		// 1~10까지의 수 중 랜덤 수를 5개 출력
		//중복 가능
		//for=반복문 (랜덤 수 출력 5번)
		//랜덤수 :1~10 범위 중 랜덤 수
		
//		int i=0;
//		int num=0;
//		for(i=1;i<=5;i++) {
//			num=(int)(Math.random()*10)+1;
//			System.out.println(num);
//		}
//		System.out.println();
		
		//구구단 2단 출력
		int i=0;
//		int dan=2;
//		for(i=1;i<=9;i++) {
//			System.out.println(dan+"X"+i+"="+(dan*i));
//		}
		
		//내가 입력한 단을 출력
		Scanner scan=new Scanner(System.in);
		
		System.out.println("단 입력:");
		
		int dan=scan.nextInt();
		for(i=1;i<=9;i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
		}
		
		scan.close();
	}

}
