package day03;

public class For01 {

	public static void main(String[] args) {
		/*
		 * 반복문:규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while
		 * -for, while은 동작 방식이 같음
		 * => 조건에 따라 조건이 맞지 않으면 실행하지 않음
		 * 
		 *  do~while문 : 먼저 실행 후 조건을 나중에 비교, 무조건 한번은 실행
		 *  
		 *  for(1초기화;2조건식;4증감식){
		 *  3실행문;
		 *  }
		 *  
		 *  -초기화: 실행문을 반복하기 위한 변수를 초기화(처음 1번만 실행) : 생략가능
		 *  -조건식: 반복을 결정하는 기능(true=반복) : 생략가능
		 *  -증감식: 조건식에서 사용하는 변수를 증가/ 감소시켜 반복 횟수를 결정: 생략가능
		 *
		 */
	
		
		for(int i=0 ;i<=5;i++) {
			System.out.println(i);
			System.out.println("hello");
		}
		
		System.out.println("---------------------");
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		};
		System.out.println();//줄바꿈
		
		
		//1~10까지 중 짝수만 출력
		for(int i=2;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//1~10까지의 합계
		
		int sum=0;
		
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
//		
//		System.out.println(sum);
		
		//1~10까지 짝수의 합계
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				System.out.print(i+" ");
				sum+=i;
			}
			
		}
		
		System.out.println(sum);
		
	}

}
