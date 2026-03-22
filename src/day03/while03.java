package day03;

public class while03 {

	public static void main(String[] args) {
		// 1~10까지의 합계 while 출력
		
		int num=1;
		int sum=0;
		
		while(num<=10) {
			sum+=num;
			num++;
		}
		
		System.out.println(sum);
		
		System.out.println("-----------------------");
		//짝수들만의 합
		num=1;
		sum=0;
		
		while(num<10) {
			if(num%2==0) {
				sum+=num;
			}
			num++;
		}
		System.out.println(sum);
		
		
		System.out.println("-------------------------");
		//1~50중 짝수만 출력
		
		num=1;
		
		while(num<=50) {
			if(num%2==0) {
				System.out.print(num+" ");
			}
			if(num%10==0) {
				System.out.println();
			}
			num++;
		}
		
		
		
		
	}

	


}
