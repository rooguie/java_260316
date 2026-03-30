package day11;

public class Super01 {

	public static void main(String[] args) {
		// 상속: 부모의 멤버를 자식에게 물려주는 것.
		/*
		 * -멤버변수/ 멤버 메서드만 상속가능
		 * -클래스의 확장 개념
		 * -상속을 하는 이유: 재사용 코드의 중복제거, 유지보수를 쉽게하기 위해
		 * 
		 * class A(자식) extends B(부모){
		 * 구현;
		 * }
		 * 
		 * -상속 키워드: extends
		 * -상속을 받으면 부모의 멤버변수와 부모의 메서드를 사용할 수 있다.
		 * -접근제어자가 private이면 자식도 접근 불가능
		 * -접근제어자를 protected--> 상속받는 자식에게 허용하는 제어자
		 * -상속은 단일 상속이 원칙--> 부모는 여려명일 수 없다.
		 * 
		 */

		B b=new B(); //부모객체
		b.setA(10);
		b.setB(20);
		b.num=30;
		b.print();
		System.out.println("---------------");
		
		A a=new A();//자식객체
		a.setA(100);
		a.setB(200);
		a.setC(300);
		a.setD(400);
		a.setE(500);
		a.setNum(10);
		a.print();
		a.printB();
		
	}

}


class A extends B{
	//자식클래스
	private int c,d,e;

	//내 print를 만들어서 부모 멤버변수를 가져와서 출력
	public void printB() {
		System.out.println("B객체에서 출력");
		System.out.println("c=>"+c+" d=>"+d+" e=>"+e);
		System.out.println("A객체에서 가져오기");
		System.out.println(super.getA());
		System.out.println(super.getB());
		System.out.println(super.num);
	}
	
	//부모 print를 가져와서 내 멤버변수를 추가해서 출력하는 방법
	@Override
	public void print() {
		// super==> 부모의 값을 가져올때 사용하는 키워
		// override(오버라이드): 부모의 메서드를 재정의하여 사용하는 것
		// super: 부모의 값을 가져올 때 사용하는 키워드(부모의 멤버변수, 멤버메서드를 지칭할때 사용)
		// this: 내 멤버, 메서드를 지장할 때 사용하는 키워드
		super.print(); //부모의 a,b,num를 출력
		System.out.println("c=>"+c+" d=>"+d+" e=>"+e);
	}
	
	
	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int b) {
		this.d = b;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}
	
	
	
}

class B{
	//부모 클래스 
	private int a,b; //나만 사용가능
	protected int num; //자식도 사용가능

	
	public void print() {
		System.out.println("a:"+a+"/b:"+b);
		System.out.println("num:"+num);
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
}
























