package day06;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// 배열
		//숫자 5개의 값을 가지는 배열을 생성
		//1,2,3,4,5 입력 후 출력
		
//		int[] numList= {1,2,3,4,5};
//		
//		for(int tmp:numList) {
//			System.out.println(tmp);
//		}
//		
//		System.out.println("-------------------");
//		for(int i=0;i<numList.length;i++) {
//			System.out.println(numList[i]);
//		}
//		
//		System.out.println("--------------------");
//		System.out.println(Arrays.toString(numList));
		
		int arr[]=new int[5];
		int arr2[]=new int[] {1,2,3,4,5};
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		arr[0]=10; //값을 덮어쓰기
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int tmp:arr) {
			System.out.println(tmp);
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
