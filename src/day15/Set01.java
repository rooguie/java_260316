package day15;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		// Set: index가 없음-> 순서보장이 안되고, 중복이 안됨, 정렬도 안됨
		//HashSet/TreeSet
		
		Set<String> set= new HashSet<String>();
		
		//add(): set에 추가
		set.add("사과");
		set.add("배");
		set.add("귤");
		set.add("포도");
		
		System.out.println(set);
		
		//get(i)/set(i,value): index가 없어서 index 사용 메서드는 없음.
		
		//contains() clear() equals() isEmpty()
		
		//set 출력->향상된 for문, Iterator 출력
		
		for(String s:set) {
			System.out.println(s);
		}
		
		
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			String t=it.next();
			System.out.println(t);
		}
		
		
		
		
		//set은 중복 제거를 위해 사용한 후에 list로 변경해서 사용
		List<String> list=new ArrayList<String>(set);
		System.out.println(list);
		
		list.add("배");
		System.out.println(list);

	}

}
