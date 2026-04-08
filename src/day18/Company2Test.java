package day18;

public class Company2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Company2.KT); //열거 값
		System.out.println(Company2.KT.getValue()); //KT가 가지는 변수의 값
		
		System.out.println("--------------------");
		//values(): 열거 값들=> [] 배열로 리턴
		for(Company2 c: Company2.values()) {
			System.out.println(c);
			System.out.println(c.ordinal()); //순번
			
		}
		
		System.out.println(Company2.LG.ordinal());//순번

	}

}
