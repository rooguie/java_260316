package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		//리스트를 생성하여 과일 5가지 정도를 저장하고 출력
		List<String> fruits=new ArrayList<>();
		
		fruits.add("귤");
		fruits.add("배");
		fruits.add("딸기");
		fruits.add("포도");
		fruits.add("자몽");
	
		//일반 for문으로 출력
		for(int i=0; i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		
		
		//향상된 for문으로 출력
		System.out.println("---향상된 for문---");
		for(String tmp:fruits) {
			System.out.println(tmp);
		}
		
		
		//iterator 출력
		System.out.println("--iterator 출력--");
		Iterator<String> it=fruits.iterator();
		while(it.hasNext()) {
			String tmp=it.next();
			System.out.println(tmp);
		}
		
		
		
		
		//내 리스트에 사과가 있으면 사과판매/ 없으면 재고 없음 출력
		
		System.out.println("--재고 체크--");
		if(fruits.contains("사과")) {
			System.out.println("판매");
		}
		else {
			System.out.println("재고 없음");
		}
	}
	
}
