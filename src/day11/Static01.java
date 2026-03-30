package day11;

public class Static01 {

	public static void main(String[] args) {
		/*
		 * static: 전역변수/전역메서드(클래스 변수/클래스 메서드)
		 * 모든 객체에 공통으로 사용이 가능
		 * 프로그램이 실행되면서 바로 메모리에 올라가서 프로그램이 종료될때 같이 소멸
		 * -객체 생성없이 클래스가 만들어지면서 생성
		 * -클래스만으로 호출이 가능
		 * 클래스명.변수명 / 클래스명.메서드명 => 사용방법
		 * -객체를 생성하고 사용해도 상관은 없으나 굳이 그렇게 사용하지는 않는다.
		 * -클래스의 멤버변수, 메서드는 하나의 멤버변수가 모든 객체에 공유되어야 할때 
		 * 
		 * static이 안붙은 메서드/멤버변수는 객체(인스턴트)의 메서드/ 객체의 멤버변수라고 불림.
		 * -각 객체를 통해 생성되고, 사용된다.
		 * -객체를 생성하지 않으면(new) 생성되지 않고, 사용될 수 없다.
		 * -객체명.변수명 / 객체명.클래스명=사용방법
		 * -각 객체마다 독립적으로 존재
		 * 
		 * 클래스의 멤버와 객체의 멤버는 생성되는 시점이 달라서 메서드와 멤버변수의 사용 시점이 다름
		 * 객체의 멤버는 클래스가 생성되고, 객체 생성 후 사용이 가능
		 * 클래스의 멤버는 클래스가 생서오디면 바로 사용 가능
		 * 
		 * -클래스 멤버는 클래스 멤버변수/클래스 멤버메서드 둘다 사용가능
		 * -객체 멤버는 클래스 멤버에서 사용이 불가능
		 * -static이 붙은 메서드에서 일반 메서드 호출 불가능
		 * 
		 */
		//ProductMain.main(args); //static의 메서드라 객체 생성없이 호출가능

		TV t=new TV();
		t.printBrand();
		t.printBrand2();
		
		TV.printBrand2();
		
		
	}

}


class TV{
	private boolean power;
	static final String Brand="LG";
	
	public void printBrand() {
		//객체의 메서드 안 => static 클래스 변수를 호출 
		System.out.println("Brand: "+Brand);//static
		System.out.println(power); //일반 멤버변수
	}


	public static void printBrand2() {
		//static 클래스 메서드 안 => 객체 변수 호출
		System.out.println("Brand: "+Brand);//static
		//System.out.println(power); //일반 멤버변수=> 호출 불가, 아직 객체가 만들어지지 않아 생성되지 않음
	}







}









