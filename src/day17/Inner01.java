package day17;

public class Inner01 {

	public static void main(String[] args) {
		// innerClass: 내부 클래스

		Test outClass=new Test();
		outClass.usingClass();
		outClass.getInClass().innerTest();
		
		//innerClass에 직접 접근
		Test.TestInner inClass=outClass.new TestInner();
		inClass.innerNum=1000;
	}

}

class Test{
//	void test() { //메서드는 내부에 메서드가 있을 수 없다
////		void test2();
//}

	private int num=10;
	private static int sNum=20;
	private TestInner inClass;
	
	public Test() {//test 클래스의 생성자
		//내부 클래스의 객체를 생성
		inClass=new TestInner();
	}
	
	class TestInner{
		//가능, 내부 클래스
		int innerNum=100;
		//static int innerSNum=200; 불가능
		
		void innerTest(){
			System.out.println("testClass Num:"+num);
			System.out.println("testClass sNum:"+sNum);
			System.out.println("testClass innerTestNum:"+innerNum);
		}
	}
	
	//TestInner 클래스의 내부에 메서드를 호출하는 메서드
	public void usingClass() {
		inClass.innerTest();
	}
	
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getsNum() {
		return sNum;
	}

	public static void setsNum(int sNum) {
		Test.sNum = sNum;
	}

	public TestInner getInClass() {
		return inClass;
	}

	public void setInClass(TestInner inClass) {
		this.inClass = inClass;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}