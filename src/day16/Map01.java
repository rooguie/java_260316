package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		// Map:값을 쌍으로 저장 key/value
		//-key는 중복 불가능,value는 중복 가능==>key가 인덱스, value가 값
		//-hashMap을 가장 많이 사용
		
		Map<String,Integer> map=new HashMap<>();
		
		//put() 추가
		map.put("apple", 1000);
		map.put("orange", 500);
		map.put("banana", 3000);
		System.out.println(map);
		System.out.println("---------------");
		
		map.put("apple", 2000);
		map.put("peach", 4000);
		map.put("kiwi", 2000);
		System.out.println(map);
		
		//get(key) => value 리턴 
		System.out.println(map.get("orange"));
		
		//keySet(): key만 리턴=> set
		//values()
		System.out.println(map.keySet()); //인덱스 없는 set으로 리턴
		System.out.println(map.values()); //인덱스가 있는 리스트로 리턴
		
		System.out.println(map.entrySet());//key와 value를 한 묶음로 set으로 리턴
		
		// cotainsKey(key): 해당 key가 존재하는지 확인 true/false
		System.out.println(map.containsKey("orange"));
		
		//합계출력
		int sum=0;
		for(String key:map.keySet()) {
			sum+=map.get(key);
			System.out.println(key+":"+map.get(key));
		}
		System.out.println(sum);
		
		//Iterator
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		
		
		
		
		
		//remove(key) => value/remove(key,value)==> boolean
		System.out.println(map.remove("orange"));
		System.out.println(map);
		
		System.out.println(map.remove("apple",2000));
		System.out.println(map);
		
		//map.size(): 맵의 길이
		
		System.out.println(map.size());
		
		//clear()
		map.clear();
		System.out.println(map);
		
		
		
		
		
	}

}
