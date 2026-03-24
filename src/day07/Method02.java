package day07;

public class Method02 {
	
	//메서드 생성위치
	/*
	 * 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	 * 
	 */
	public int Sum(int num1,int num2) {
		return num1+num2; //리턴은 한개만 존재해야함, 결과를 다른 메서드에 줄 수 있음
	}
	
	/*
	 * 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	 */
	
	public void Sum2(int num1,int num2) {
		int result=0;
		int result2=0;
		
		result=num1+num2;
		result2=Sum(num1,num2); //같은 클래스 안에 있는 메서드는 다른 메서드를 바로 호출가능
		System.out.println(result); //출력만 가능
		System.out.println("------------");
		System.out.println(result2);
	}
	
	//두 수의 합을 출력하는 리턴O 메서드(매개변수X),
	public int Sum3() { //메서드 내부에서 새로운 값을 생성 후 리턴
		int num1=100;
		int num2=200;
		return num1+num2; 
	}
	
	public static void main(String[] args) {
		
		int num1=100; //지역변수
		int num2=200;
		int result=0;
		
		Method02 me2=new Method02(); //객체변수 or 참조변수
		
		result=me2.Sum(num1, num2); //num1,num2-> 매개변수
		
		System.out.println(result);
		
		System.out.println("------------");
		
		me2.Sum2(num1, num2);
		
		
		
	}

}
