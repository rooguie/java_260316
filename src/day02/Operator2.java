package day02;

public class Operator2 {

	public static void main(String[] args) {
		// 변수의 기본 자료형 8개
		/*
		 * 정수-->byte, short, int, long, char
		 * 실수-->float, double
		 * 논리-->boolen
		 * 
		 * 연산자
		 * 산술:+ - * / %(나머지)
		 * 대입: = += -= ...
		 * =을 기준으로 오른쪽에 있는 값을 왼쪽 변수에 저장
		 * 왼쪽 값은 반드시 변수여야함
		 * 
		 * int a=1;
		 * a=b;
		 * 1=a; (에러)
		 * a=a+b --> a+=b;
		 */
		
		int a=1;
		int b=5;
		
		System.out.println(a);
		System.out.println(b);
		
		a=b;
		System.out.println(a); //5
		
		a+=b;
		System.out.println(a); //10
		
		//중검 연산자 : ++(1증가) --(1감소)
		a++; //현재 a에 1증가 (+1)
		System.out.println(a); //11
		
		System.out.println(a+b);
		System.out.println(a);//11
		
		
		System.out.println(a++);//11 a를 출력 후 그 후에 1 증가
		System.out.println(a); //12
		
		System.out.println(++a);//13 1증가 후 a출력
		
		
		// 산술:+ - * / %(나머지)
		/*
		 * 나누기(/,%)
		 * 정수/정수 = 정수 ex) 10/3=3
		 * 정수/실수 = 실수 ex) 10/3.0 = 3.3333
		 * 실수/정수 = 실수
		 * 실수/실수 = 실수
		 * 
		 * 정수/0 --> 예외발생
		 * 실수/0 --> infinity
		 */
		
		System.out.println(10/3);
		System.out.println(10/3.0);
//		System.out.println(10/0); //0으로 나눌 수 없어서 오류 발생
		System.out.println(10.0/0);
		
		/*비교연산자 : 비교 연산의 결과는 반드시 true/false
		 * >=,<=,>,<,==,!=
		 * 
		 * 논리연산자 : &&,||,!
		 * 
		 */
		
		System.out.println(3>1);
		System.out.println(3<1);
		System.out.println(3>1 && 5<2);
		System.out.println(3>1 || 5<2);
		System.out.println(!(3>1));
		
		
		//연결 연산자 : +(데이터의 결과가 문자일 경우에만 가능)
		int num1=90;
		int num2=80;
		System.out.println(num1+num2); //170
		
		System.out.println("num1+num2="+num1+num2); //num1과 num2를 문자로 인식해서 붙여버림

		System.out.println(num1+"+"+num2+"="+(num1+num2));
		
		//조건선택연산자 : 조건식 ? true : false
		System.out.println(num1>num2 ? "num1이 큽니다" : "num2가 큽니다");
		
		//조건식 ? true : 조건식 ? true : false 사용가능
		
		
		/*
		 * number 변수를 선언하고, 값을 입력한 후
		 * number의 수가 짝수인지 홀수인지 판별
		 * % 조건 선택연산자
		 */
		int number=19;
		System.out.println(number%2==0 ? "짝수 입니다" : "홀수 입니다");
		

	}

}
