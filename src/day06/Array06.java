package day06;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		
		// String 배열
		String[] strArr = new String[5];
		
		strArr[0]="홍길동";
		strArr[1]="박순이";
		strArr[2]="김영이";
		strArr[3]="황영이";
		strArr[4]="고길동";
		
		for(String str:strArr) { //임시변수는 항상 배열과 같은 자료형을 사용해야한다.
			System.out.println(str);
		}
		
		
		//배열의 크기는 고정
		String[] arr=new String[5];
		arr[0]="홍길동"; 
		System.out.println(Arrays.toString(arr));
		//기본 자료형을 제외한 나머지 자료형은 배열이 개수만큼 차 있지 않으면 배열 안에 값이 얼마나 있는지 확인해야한다.
		//배열에 데이터를 넣을때 카운팅을 하면 오류를 체크하기 쉽다.
		
		for(String str2:arr) {
			System.out.println(str2);
		}
		
		//배열에서 데이터를 줄이거나 늘리고 싶은 경우
		String arr2[]=new String[6];
		//arr=arr2;
		
		
		System.out.println("----데이터 이동----");
		// strArr 5개 있는 데이터를 arr2으로 이동
//		for(int i=0;i<strArr.length;i++) {
//			arr2[i]=strArr[i];
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr2));
//		
//		strArr=arr2;
//		System.out.println(Arrays.toString(strArr));
		
		//배열복사
		//System.arraycopy(구배열,시작번지,신배열,시작번지,개수)
		System.arraycopy(strArr, 0, arr2, 0, strArr.length);
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(strArr));
		
		strArr=arr2; //배열 주소 연결
		strArr[5]="바둑이";
		
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
