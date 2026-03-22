package day03;

public class While01 {

	public static void main(String[] args) {
		// while문
		/*
		 * for: 반복횟수가 정해져 있는 경우 사용
		 * while: 실행 횟수가 정해져 있지 않는 경우 사용
		 */
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		int count=0;
//		while(count<=10) {
//			System.out.println(count);
//			//반복 변수가 종료되기 위한 조건을 포함해야함
//			count++;
//		}
//		
		//while로 짝수만 출력
		
		while(count<=10) {
			count++;
			if(count%2==0) {
				System.out.println(count);
			}
		}

	}

}
