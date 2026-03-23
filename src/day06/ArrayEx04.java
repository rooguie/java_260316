package day06;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 정수 배열 10개 생성 --> 1~100 랜덤 수 넣기 후 출력
		//오름차순 정렬 후 출력
		
		//int numList[]=new int[10];
		Integer numList[]=new Integer[10];
		
		for(int i=0;i<numList.length;i++) {
			numList[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(numList));
//		//정렬 메소드
//		for(int i=0;i<numList.length-1;i++) {
//			for(int j=i+1;j<numList.length;j++) {
//			 if(numList[i]>=numList[j]) {
//				int tmp=numList[i];
//				numList[i]=numList[j];
//				numList[j]=tmp;
//				}
//			}
//		}
		
		//sort() 오름차순
		//Arrays.sort(numList);
		
		//내림차순 정렬 방법 => 기본 자료형으로는 불가,Object(모든 객체의 부모) 형태로 박싱--> 래퍼클래스로 바꿔준다
		//Collections.reversOrder()
		//wrapper class --> 래퍼클래스
		//기본 타입의 자료형값을 박싱해서 객체로 만드는 것을 의미
		//int => Integer *
		//btye=>Byte
		//char=>Character *
		//float => Float
		//double => double
		// .
		// .
		// .
		//Arrays.sort(arr,Collections.reverseOrder());

		Arrays.sort(numList,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(numList));
		
	

	}

}
