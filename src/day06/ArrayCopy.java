package day06;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		//ArrayCopy
		/*
		 * 배열은 길이가 정해져 있음
		 * 처음 배열을 선언할 때 정해서 생성
		 * 이후 배열을 증가/감소 할 수 없음.(필요에 의해 늘이거나 줄일 수 있음)
		 * System.arraycopy(이전배열, 시작번지,새배열,시작번지,개수)
		 * 이전배열=새배열; //주소 연결
		 */
		
		int[] arr=new int[5];
		
		arr[0]=78;
		arr[1]=48;
		arr[2]=56;
		arr[3]=79;
		arr[4]=11;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--메모리 테이터 확장--");
		//새배열 생성, 기존 배열에 5개 추가
		//데이터 복사 후 주소 공유
		//출력
		
		//배열 생성
		int[] arrTmp=new int[arr.length+5];
		
		//데이터 복사
		System.arraycopy(arr, 0, arrTmp, 0, arr.length);
		
		//주소 공유
		arr=arrTmp;
		
		//출력
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
