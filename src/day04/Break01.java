package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// break; :반복문을 빠져나오는 키워드
		/*
		 * 반복문에서 조건문(if)을 동반하여 조건이 맞을때 빠져나오는 역할
		 * 
		 * for,while,do~while
		 * 
		 * continue: pass,skip 개념
		 *
		 */
		
		//break;
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("-------------------");
		
		//continue;
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue; //조건에 맞다면 실행문을 실행하지 않기
			}
			System.out.println(i);
		}
		
		
		System.out.println("----------------");
		
		//1~10까지 중 짝수만 출력
		//홀수면 continue
		
		for(int i =1 ;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
		
		//한글자 입력받아 한글자 출력
		//char => y는 종료
		
		Scanner scan=new Scanner(System.in);
		
		for(;;) {
			System.out.println("한글자 입력");
			char ch=scan.next().charAt(0);
			System.out.println(ch);
			if(ch=='y') {
				break;
			}
			
		
		}
	
		
		scan.close();
		
		
		//반복문이 중첩일 경우 break는 나를 감싸고 있는 가장 안쪽 for만 벗어남
		//반복문에 이름을 줄 수 있음
		int i=0,j=0,k=0;
		
		a: for(;;) {
			i++;
			for(;;) {
				j++;
				for(;;) {
					k++;
					System.out.println("i:"+i+", j:"+", k:"+k);
					if(k==10) {
						break a;
					}
				}
					
			}
		}
		
		
		
		
		
	}

}
