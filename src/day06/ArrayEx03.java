package day06;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 정수배열[10] 생성 후
		//1~10까지 저장 후 출력(toString)
		
		int[] numList=new int[5];
		
		for(int i=0;i<numList.length;i++) {
			numList[i]=i+1;
		}
		
		System.out.println(Arrays.toString(numList));
		
		for(int i=0;i<numList.length;i++) {
		// 인덱스를 랜덤으로 생성
		int index = (int)(Math.random()*numList.length);
		System.out.println(index);
		
		//교환
		int t =numList[i];
		numList[i]=numList[index];
		numList[index]=t;
		}
		
		System.out.println(Arrays.toString(numList));
		
		
//		//원래대로 정렬
//		//오름차순, 내림차순
//		//==> 선택 정렬(오름차순)
//		for(int i=0;i<numList.length-1;i++) { //비교할 뒤 숫자가 있어여함
//			for(int j=i+1;j<numList.length;j++) {
//				if(numList[i]>numList[j]) { //오름차순 교환
//					//교환
//					int tmp=numList[i];
//					numList[i]=numList[j];
//					numList[j]=tmp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(numList));
		
		
		//Arrays.sort : 오름차순
		Arrays.sort(numList);
		System.out.println(Arrays.toString(numList));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
