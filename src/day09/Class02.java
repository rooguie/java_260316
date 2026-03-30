package day09;

public class Class02 {

	public static void main(String[] args) {
		// Test2 객체 생성 -> 출력
		// (x,y) 값을 저장 후 출력
		Test2 t2 = new Test2();
		
		t2.setX(12);
		t2.setY(12);
		
		System.out.println(t2);
		
		//메서드 호출시 객체명.메서드명()
		//toString()
		//System.out.println(객체명); => toString()을 찾아서 알아서 출력
		
	}

}

//default 접근제어자는 나+패키지
//패키지별로 같은 이름의 클래스명을 가질 수 없음
class Test2 {
	private int x;
	private int y;

	// toString() => print() 메서드를 String으로 리턴하는 형식
	// (x,y) --> String으로 리턴하는 메서드

	// private의 멤버변수를 다른 클래스에서 사용하기 위해서는
	// getter/setter 메서드 필요

	public String toString() {

		// "문자"와 숫자의 조합일 경우
		// =>+는 더하기가 아닌 연결연산자로 됨.
		// 숫자+숫자+문자
		// 이 경우에는 숫자를 먼저 연산하고 문자랑 연ㅕㄹ
		return "(" + this.x +","+ this.y + ")";
	}
	
	//private의 멤버변수를 다른 클래스에서 사용하기 위해서는
	//getter / setter 메서드 필요
	//getter: 외부에서 내 멤버변수에 접근하기 위해서 필요(저장은 안됨)
	//setter: 외부에서 내 멤버변수의 값을 변경하기 위해 필요(저장)
	//매개변수가 필요

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
