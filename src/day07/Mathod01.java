package day07;

public class Mathod01 {

	// 메서드 선언 가능위치
	// 두 정수를 주면(매개변수) 합을 리턴하는 메서드
	// 매개변수: int num1,int num2
	// 메서드명: Sum
	// 리턴타입: int

	public static int Sum(int num1, int num2) {
		return num1 + num2;
	}

	public int sumNoStatic(int num1, int num2) {
		return num1 + num2;
	}

	// 두 정수를 주면 두 정수의 차를 리턴하는 메서드
	public int Sub(int num1, int num2) {
		if (num1 >= num2) {
			return num1 - num2;
		} else {
			return num2 - num1;
		}
	}

	public static void main(String[] args) {

		// static 메서드 호출 => 메서드가 static
		int num1 = 100;
		int num2 = 200;
		int resultSum = 0;
		int resultSub = 0;
		int resultNoStatic = 0;

//		resultSum = Sum(num1, num2);
//
//		System.out.println(resultSum);

		// 메서드가 static이 아닌데 static메서드를 호출할려면
		// 1. 클래스를 객체화 => new 클래스명();
		// 2. 객체로 메서드 접근

		Mathod01 me01 = new Mathod01();

//		resultNoStatic = me01.sumNoStatic(num1, num2);
//
//		System.out.println(resultNoStatic);
//
//		System.out.println("-------------");
		System.out.println("============");
		resultSub = me01.Sub(num1, num2);
		System.out.println(resultSub);
 
		/*
		 * class:변수(가지는 요소),메서드(해야하는 기능) main : 컴파일러가 실행을 하기 위해 가장 먼저 찾는 메서드
		 * 
		 * method 구조 접근제어자(public) 리턴타입(void) 메서드명(매개변수){ 구현 return 리턴타입과 일치하는 변수값; };
		 * 
		 * -접근제어자 : 접근할 수 있는 주체의 제한범위 -리턴타입: 메서드가 실행된 후 반환 값(반환할 값의 자료형)=> 반드시 1개 -void:
		 * 리턴할 값이 없음을 의미 -메서드명: 소문자로 시작(여러의미를 붙여서 사용할 경우 카멜케이스 사용) -매개변수: 파라미터 기능을 하기 위해
		 * 외부에서 반드시 들어와야 하는 값 => 여러개 가능, 없어도 가능 -return: 리턴타입과 일치하는 변수값을 주고 메서드 종료
		 * 
		 * 
		 * 메서드는 중복선언 안됨, 메서드 안에 또 다른 메서드가 존재할 수 없음 메서드 단위는 위치가 상관없음. 메서드 선언 위치-> 클래스 안에
		 * 다른 메서드 밖에 메서드는 독립적 가능. 메서드의 순서는 아무 상관이 없음 메서드는 호출로 실행
		 * 
		 */

	}

}
