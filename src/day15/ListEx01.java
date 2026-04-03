package day15;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListEx01 {

	public static void main(String[] args) {
		// 배열의 값을 리스트로 생성
		String[] arr = { "a", "y", "t", "s", "r" };
		String[] arr2 = { "b", "c", "p", "w", "d" };
		
		//배열을 list로 가져오기
		//배열의 값을 연결하여 리스트로 가져오기
//		List<String> list=new ArrayList<>();//얕은 복사
//		list=Arrays.asList(arr); 
		
		//깊은 복사: 복사하여 가져오기
		List<String> list1=new ArrayList<>(Arrays.asList(arr));
		List<String> list2=new ArrayList<>(Arrays.asList(arr2));
		
		//addAll(list):모든 요소 추가
		list1.addAll(list2);
		System.out.println(list1);
		
		
		
		
		// 2개의 배열을 하나의 리스트로 생성=> 출력
//		List<String> arrList=new ArrayList<>();
//		
//		for(int i=0;i<arr.length;i++) {//==for(String s:arr){
//										//arrList.add[s];
//			arrList.add(arr[i]);
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			arrList.add(arr2[i]);
//		}
//		
//		for(String tmp:arrList) {
//			System.out.println(tmp);
//		}
//
//		// 정렬 => 출력
//		System.out.println("----정렬----");
//		Collections.sort(arrList);
//		
//		for(String tmp:arrList) {
//			System.out.println(tmp);
//		}
		
		
		
		
		

	}
}