package day05;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		//참조변수는 기본값이 세팅이 되어 있어 초기화를 하지 않아두 된다.
		/*
		 * 배열: 같은 타입, 같은 의미를 가지는 변수들의 집합(참조변수)
		 * 기본 타입 8개(기본변수) 뺴고는 전부 참조 변수
		 * new 키워드로 생성
		 * 배열 선언 방법
		 * 타입[] 배열명; //기본값은 null
		 * 타입 배열명[];
		 * 
		 * 타입[] 배열명 = new 타입[길이]; 배열명 = new 타입[길이]
		 * 생성된 배열안의 변수값은 자동으로 초기화가 이루어진다. 
		 * 숫자타입=0; 문자타입 = null
		 * 
		 * int[] arr = new int[5];
		 * int[] arr = new int[]{1,2,3,4,5};
		 * int[] arr = {1,2,3,4,5};
		 * 
		 * 배열의 길이는 0이상이어야한다.
		 * 배열의 인텍스는 0부터 시작
		 * 배열[5] --> 0 1 2 3 4
		 * 배열의 총길이는 => length => 마지막 번지 [length-1]
		 * 
		 */
		
		
		int[] arr; //null
		arr=new int[5];
		
		int[] arr1=new int[5]; //5개의 배열한 값은 0으로 초기화
		int[] arr2=new int[] {1,2,3,4,5};
		int arr3[]= {10,20,30,40,50};
		
		System.out.println(arr[4]);
		System.out.println(arr1[1]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		System.out.println("----------------");
		
		
		for(int i=0;i<=arr3.length-1;i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("----------------------");
		
		for(int i=0; i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		//arr에 값을 추가
		arr[0]=78;
		arr[1]=45;
		arr[2]=24;
		arr[3]=51;
		arr[4]=95;
		//arr[5]=18; 없는 번지는 오류
		
		System.out.println("----------------------");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// 10개의 칸읠 가지는 int배열을 생성하고
		//1~10까지 반복저장
		//출력
		
		int[] count;
		count=new int[10];
		
		for(int i=0;i<count.length;i++) {
			
			count[i]=i+1;
			System.out.println(count[i]);
		}
		
		//arr5를 5개 생성하여 랜덤 값으로 채우고 => 출력
		//1~10까지 중 랜덤으로
		int arr5[] =new int[5];
		for(int i=0;i<arr5.length;i++){
			arr5[i]=(int)(Math.random()*10)+1;
			System.out.println(arr5[i]);
		}
		
		//배열이나 리스트 같은 전체 탐색
		//index로 접근이 불가능한 경우 사용
		//배열의 내부 값을 변경하는건 불가능
		//향상된 for문
		
		for(int tmp:arr5) {
			System.out.println(tmp);
		}
		
		System.out.println("-----------------");
		
		//Arrays 클래스 toString
		System.out.println(Arrays.toString(arr5));
		
		
		
		
	}

}
