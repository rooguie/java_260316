package day08;

public class Method04 {
	/*
	 * 정수 하나를 매개변수로 받고
	 * 해당 정수의 구구단을 출력
	 * 매개변수:
	 * 리턴:
	 * 메서드명:
	 */
	
	public void Dan(int num) {
		for(int i=1;i<=9;i++) {
			System.err.printf("%dX%d=%02d\n",num,i,num*i);
		}
	}
	

	public static void main(String[] args) {
		//구구단 출력
		int num=9;
		
		Method04 me04=new Method04();
		
		me04.Dan(num);
	}

}
