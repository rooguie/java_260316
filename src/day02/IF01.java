package day02;

public class IF01 {

	public static void main(String[] args) {
		// 조건문 : if문, switch문
		// if문 : 조건식을 주고, 조건식이 참이면 거짓이면 값을 처리하는 구문
		// if(조건식) {실행문;}
		// if문은 실행문이 한줄이면 중괄호 생략가능
		
		int number=1;
		
		if(number>0) {
			System.out.println("양수입니다");
		}else {
			System.out.println("음수입니다.");
		}
		
		if(number>0) {
			System.out.println("양수입니다");
		}else if(number<0){
			System.out.println("음수입니다.");
		}else {
			System.out.println("0");
		}
		
		
		

	}

}
