package day02;

public class Operator {

	public static void main(String[] args) { //static은 메모리 할당 시 클래스와 다른 메모리 할당
		// 변수와 연산자
		/*
		 * 주석: 프로그램이 읽지 않는 라인 ctrl+/
		 * 여러줄 주석
		 * 
		 * System.out.println() : console 출력 --> 줄바꿈을 포함
		 * System.out.print() --> 줄바꿈이 없는 출력
		 * System.out.printf() --> 형식을 가지는 출력
		 * printf 지시자 : %d(정수) %f(실수) %s(문자) %c(한글자) %n(줄바꿈)
		 * 
		 * 
		 * 문자열 : "" / 한글자 : '' / 숫자는 따옴표 없음
		 */

		
		System.out.println("Hello World~!!");
		System.out.print("abc");
		System.out.print("123");
		System.out.println(); // 줄바꿈 역할
		System.out.printf("내 나이는 %d 입니다.%n",20);
		
		int age=20;
		String name="영이";
		System.out.printf("내 나이는 %d 입니다.%n",20);
		System.out.printf("내 이름은 %s이고, 나이는 %d 입니다.%n",name,20);
		
		System.out.println("내 이름음 "+name+"이고, 나이는 "+age+"살 입니다.");//age--> 문자형 취급
		
		//출력 단축언어 syso ctrl+space --> 자동완성
		System.out.println();
		
		/*
		 * 변수: 리터럴 값을 담을 저장공간을 정의
		 * 타입 변수명; --> 변수 선언만
		 * 타입 변수명 = 값; --> 변수 선언하고 값 저장
		 * 
		 * 변수는 중복선언이 불가능
		 * 값을 바꾸는 건 가능.--> 덮어쓰기
		 * 
		 * 변수의 스코프: 변수가 허용되는 범위 {}
		 * 
		 * 
		 */
		int a=100;
		a=50;//a=50
//		int a= 100 --> 중복선언 오류
		
		
		
		{
			int b=100;
			System.out.println(b);
			System.out.println(a); //중괄호 안에서는 밖에 있는 변수 참조 가능
		}
		//int b=500; 중괄호 밖에서는 한번 더 선언 가능
//		System.out.println(b); 중괄호 밖 범위라 인식 불가
		
	}

}
