package day07;

import java.util.Scanner;

public class Method03 {
	/*
	 * 메서드 정의 => 기능을 정의하는 역할(함수)
	 * 접근제어자 리턴타입 메서드명(매개변수){
	 * 구현;
	 * }
	 * 
	 * -public: 누구나 접근가능
	 * -리턴타입: 기능을 구현 후 결과로 반환할 값의 타입
	 * -매개변수: 기능을 구현하기 위해 외부에서 받아와야 하는 값
	 * -메서드명: 의미있게 소문자로 작성
	 * 
	 */
	
	public int sum(int num1,int num2) {
		int result=0;
		result=num1+num2;
		return result;
	}
	
	public int sub(int num1,int num2) {
		int result=0;
		
		
		result=num1-num2;
		
		return result;
	}
	
	public int mul(int num1,int num2) {
		int result=0;
		result=num1*num2;
		return result;
	}
	
	public double div(int num1,int num2) {
		double result=0;
		if(num2==0) {
			return -1.0; //오류 시 체크할 수 있는 값을 리턴
		}
		else{
			result=(double)num1/num2;
			return result;
		}
	}
	
	public int remain(int num1,int num2) {
		int result=0;
		
		if(num2==0) {
			return 1; //오류 시 체크할 수 있는 값을 리턴
		}
		else{
			result=num1%num2;
			return result;
		}
	}

	public static void main(String[] args) {
		/*
		 *메서드 실행
		 *1. 클래스로 객체를 정의 클래스명 객체명 = new 클래스명();
		 *2. 객체명으로 메서드 호출 
		 */
		
		Method03 me03 =new Method03();
		
		//다른 클래스에 있는 메서드 호출
		//Method02 me02=new Method02();
		
		//두 수의 + - * / % 의 결과를 메서드로 호출하여 출력
		int num1=0,num2=0;
		int choice=0;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("첫번째 숫자>");
		num1=scan.nextInt();
		System.out.println("두번째 숫자>");
		num2=scan.nextInt();
		
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
		choice=scan.nextInt();
		
		scan.close();
		
		if(choice==1) {
			System.out.println(me03.sum(num1,num2));
		}
		
		if(choice==2) {
			System.out.println(me03.sub(num1,num2));
		}
		
		if(choice==3) {
			System.out.println(me03.mul(num1,num2));
		}
		
		if(choice==4) {
			System.out.println(me03.div(num1,num2));
		}
		
		if(choice==5) {
			System.out.println(me03.remain(num1,num2));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
