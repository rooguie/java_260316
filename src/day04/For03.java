package day04;

public class For03 {

	public static void main(String[] args) {
		// 약수: 나누어서 떨어지는 수의 집합
		/*
		 * 6의 약수 : 1~6까지 나누어서 떨어지는 수
		 * 
		 */

		int num1=6;
		int num2=12;
				
		int gcd=0;
		
		for(int i=1;i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.println(i);
				gcd=i;
			}
			
		}
		
		//최대 공약수 출력
		System.out.println("최대공약수>"+gcd);
		
		//num1부터 1씩 감소 첫 조건에 맞으면 출력 
		for(int i=num1;;i-- ) {
			if(num1%i==0 && num2%i==0) {
				System.out.println("최대공약수:"+i);
				break;
			}
		}
		
		
		
		
	}

}
