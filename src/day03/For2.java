package day03;

public class For2 {

	public static void main(String[] args) {
		// 1~100까지의 합계 출력 5050
		
		//지역변수는 반드시 초기화를 해주어야 사용가능
		int num=0;
		int sum=0;
		
		for(num=1;num<=100;num++) {
			sum+=num;
		}
		
		System.out.println(sum);

	}

}
