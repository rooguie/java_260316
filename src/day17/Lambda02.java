package day17;

import java.util.HashMap;
import java.util.Map;

public class Lambda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map =new HashMap();
		
		map.put("hong", 89);
		map.put("kim", 8);
		map.put("lee", 9);
		map.put("choi", 81);
		map.put("park", 812);
		
		map.forEach((a,b)->{
			System.out.println(a+":"+b);
		});
		//함수형 인터페이스 구현
		Number sum=(a,b)->{
			return a+b;
		};
		
		int s=sum.add(12, 12);
		System.out.println(s);
		
		Number max=(a,b)->{
			return(a>=b)?a:b;
		};
		
		

}


//람다용 함수형 인터페이스 생성=>@FunctionalInterface
//메서드 1개만 가능
@FunctionalInterface
interface Number{
	//메서드 한개만 추가 가능
	int add(int a, int b);
//	int max(int a, int b); //두개부터는 에러 발생
}






















