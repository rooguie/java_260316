package day14;

import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		// Scanner 객체는 메인에서 받고
		// 메서드 호출하여 결과를 출력
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("첫번째 숫자 입력:");
//		int num1 = scan.nextInt();
//
//		System.out.println("두번째 숫자 입력:");
//		int num2 = scan.nextInt();
//
//		System.out.println("연산자 입력:");
//		char op = scan.next().charAt(0);
//
		Exception03 e3 = new Exception03();
//
//		double result = e3.calc(num1, num2, op);
//
//		System.out.println((int) result);
//
//		scan.close();
		
		
		//메서드에서 넘어온 throw 처리
		try {
			System.out.println(e3.calc2(5, 0, '+'));
			System.out.println(e3.calc2(5, 0, '-'));
			System.out.println(e3.calc2(5, 0, '*'));
			System.out.println(e3.calc2(5, 0, '/'));//예외발생 시점
			System.out.println(e3.calc2(5, 0, '%'));
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println(e3.calc2(3, 1, 'd'));
		
	}

	// 예외 떠넘기기: throws
	// method 자체에서 예외처리를 하지 않고, 나를 호출하는 대상에게 예외처리를 넘기는 상태
	// 예외 발생시키기: throw new
	public double calc2(int num1, int num2, char op) throws RuntimeException { // 런타임은 써도 되고 안 써도 됨
		double result = 0;

		if ((op == '/' || op == '%') && num2 == 0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다");
		}

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 + num2;
			break;
		case '*':
			result = num1 + num2;
			break;
		case '/':
			result = num1 + num2;
			break;
		case '%':
			result = num1 + num2;
			break;
		default:
			throw new RuntimeException("산술연산자가 아닙니다.");
		}

		return result;
	}

	// method
	// 두 정수와, 연산자를 입력받아 char
	// + - * / % 연산의 결과를 리턴하는 메서드
	// / % 연산자의 경우 피연산자가 0이면 예외발생 ==> 오류처리

//	public double calc(int num1,int num2, char op) {
//		if(op=='+') {
//			int result=num1+num2;
//			return (double)result;
//		}
//		
//		else if(op=='-') {
//			int result=num1-num2;
//			return (double)result;
//		}
//		
//		else if(op=='*') {
//			int result=num1*num2;
//			return (double)result;
//		}
//		
//		try {
//			
//			if(op=='/') {
//				int result=num1/num2;
//				return (double)result;
//			}
//			
//			if(op=='%') {
//				int result=num1%num2;
//				return (double)result;
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.getStackTrace();
//		}
//		
//		return -1;
//		}

	public double calc(int num1, int num2, char op) {
		double result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			try {
				result = num1 / num2;
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		case '%':
			try {
				result = num1 % num2;
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		default:
		}
		return result;
	}

}
