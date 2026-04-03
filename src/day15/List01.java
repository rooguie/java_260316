package day15;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// List => ArrayList
		List<Integer> list = new ArrayList<>();
		
		//add(): 요소를 추가
		list.add(1); //0번지에 1이 추가 오토박싱 int => Integer
		list.add(new Integer(2)); //직접 객체 생성 후 저장, 잘 안씀
		list.add(3);
		
		System.out.println(list); //자체 toString() 호출
		
		//get(index): 배열의 인덱스 값을 가져오기
		//int[a]=arr[0] 같은 의미
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		//set(index,값): 인덱스 번지에 값을 저장하기
		list.set(1, 100);
		System.out.println(list);
		
		
		//remove(index):인덱스 번지의 요소 삭제
		//remove(object):object 값을 삭제
		list.remove(0);
		System.out.println(list);
		
		//object를 만들어서  넣어줘야함
		Integer r = 100;
		list.remove(r);
		System.out.println(list);
		
		//size(): list의 총 개수=> 배열의 길이 length
		System.out.println(list.size());
		
		//배열의 값을 3개 추가하고 for문을 이용하여 출력
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//리스트를 생성 1~10까지 반복문을 이용하여 추가하고 출력
		System.out.println("---------------");
		List<Integer> list2=new ArrayList<Integer>();
		
		//추가하기 전까지는 인덱스 번호도 존재하지 않음
		for(int i=1;i<=10;i++) {
			list2.add(i);
			System.out.println(list2.get(i-1));
		}
		
		System.out.println("-------------");
		System.out.println(list2);
		
		System.out.println("-----set-----");
		//index 4번을 11로 변경
		list2.set(4, 11);
		
		System.out.println(list2);
		
		//contains(object): list에 object가 있는지 체크
		list2.contains(1);
		System.out.println(list2.contains(20));
		
		//clear(): 리스트 비우기(요소를 전부 삭제)
		list2.clear();
		System.out.println(list2);
		
		//isEmpty(): 리스트가 비었는지 확인
		System.out.println(list2.isEmpty());
		System.out.println(list.isEmpty());
		
		
	
		
	}

}
