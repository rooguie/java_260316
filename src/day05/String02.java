package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method
		
		//toLowerCase() / toUpperCase() : 소문자변환/대문자변환
		System.out.println("--toLowerCase/toUpperCase");
		System.out.println("abc".toUpperCase()); //대문자로
		System.out.println("ABC".toLowerCase()); //소문자로
		
		//isEmpty() : 값이 비어있는지 확인(공백도 값으로)
		System.out.println("--isEmpty()--");
		System.out.println(" ".isEmpty());
		
		//isBlank() : 값이 비었는지 확인(공백은 빈 것으로)
		System.out.println("--isBlank()--");
		System.out.println("1".isBlank());
		
		// trim(): 불필요한 공백제거
		System.out.println("--trim()--");
		System.out.println("      abc         ".trim());
		
		// replace() : 글자를 치환(변환)
		System.out.println("--replace()--");
		String str="apple,banana,kiwi,orange";
		// ,->/
		System.out.println(str.replace(",", "/"));
		
		//split : 특정 값을 기준으로 나누기 -> 배열로 리턴
		System.out.println("--split--");
		String[] strArr=str.split(",");
		System.out.println(Arrays.toString(strArr));
		
		for(String tmp:strArr) {
			System.out.println(tmp);
		}
		
		//=
		/*
		 * for(int i=0; i<strArr.length;i++){
		 * 	System.out.println(strArr[i]);
		 * }
		 */
		
		//문자를 숫자로 Integer.parseInt()
		String num="123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2);
		
		//숫자를 문자로 String.valueOf()
		String num3=String.valueOf(num2);
		System.out.println(num3);
		
		//instanceof: 같은 클래스가 맞는지 확인하는 연산자(클래스만 가능)
		System.out.println(num3 instanceof String);
		
		
		
		
	}

}
