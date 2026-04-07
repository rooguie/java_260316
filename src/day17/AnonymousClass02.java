package day17;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class AnonymousClass02 {

	public static void main(String[] args) {
		// List의 sort
		/*
		 * 리스트 생성 1~100까지 랜덤수를 10개 만들어 리스트에 채우기 출력
		 * 
		 */

		List<Integer> randomNum = new ArrayList<>();
		int count = 0;
		while (true) {
			count++;
			int tmp = (int) (Math.random() * 100 + 1);
			randomNum.add(tmp);

			if (count == 10) {
				System.out.println(randomNum);
				break;
			}

		}

		// Collections.sort(list); //Collections 클래스에서 제공하는 메서드
		// list.sort(comparator를 구현한 구현객체): 정렬이 가능
		// Comparator 인터페이스를 구현한 구현체를 넣어야함(익명클래스 사용)
		// compareTo: 사전상으로 앞에 있으면 - 같으면 0 뒤에 있으면 +

		randomNum.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}

		});
		
		System.out.println(randomNum);
		
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("ap");
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// compareTo:사전상으로 앞에 있으면- 같으면 0 뒤에 있으면 +
				//o1.compareTo(o2):오름차순
				//o2.compateTo(o1):내림차순
				return o1.compareTo(o2);
			}
			
		});

	}
}
