package day04;

public class For06 {

	public static void main(String[] args) {
		// 배수
		
		int num1=10;
		int num2=15;
		
		for(int i=num1;;i+=num1) {
			//10 20 30 ... 
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
