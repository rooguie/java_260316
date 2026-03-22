package day02;

public class Casting {

	public static void main(String[] args) {
		// Casting : 자료형 변환
		// a=b : 두 변수의 자료형이 맞지 않다면 오류
		/*
		 * 자동 자료형 변환: auto casting
		 * btye < short < char < int < long
		 * float < double
		 * 
		 * 명시적 형변환: 리터럴 값 앞에 (타입)
		 * 
		 */
		int a=1000;
//		String b ="111";
//		a=b; // 형이 맞지 않아 오류
		
		byte b =11;
		//a=b; // int <- byte --> 자동 형변환
		
		//b=a; //byte <- int
		
		b=(byte)a; //byte <- int 
		System.out.println(b);
		
		long l;
		l=a; //long <- int --> 자동 형변환
		
		char ch ='a';//아스키 코드의 문자로 표시
		System.out.println((int)ch); // int로 형변환 하면 아스키 코드값을 볼 수 있음.
		
		double d = 3.14159;
		System.out.println((int)d); // 소수점 날아감
		
		int num=100;
		System.out.println((double)num);//소수점 생김
		
		//---------------------------------
		
		//문자를 숫자로: String --> int
		String str = "123";
		//int 기본 자료형 --> 추가 기능을 제공하는 클래스 자료형 제공(래퍼클래스)
		//int -> Integer /long->Long / boolen --> Boolean
		
		int strNumber=Integer.parseInt(str);
		System.out.println(strNumber);
		
		
		//숫자를 문자로: int --> String
		int numberStr=12345;
		String numberStr2=String.valueOf(numberStr);
		System.out.println(numberStr2);
	}
	

}
