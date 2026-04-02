package day14;

import java.util.Arrays;
import java.util.Scanner;


public class Exception06 {

	public static void main(String[] args) {
		// 메서드를 호출해서 배열 출력
		
		//try~catch를 실행하여 예외 출력 확인
		
		//예외 처리의 목적은 구문에서 예외가 발생하더라도 프로그램을 정상 작동
		//시키기 위한 목적
		Exception06 e6=new Exception06();
		
		int size=-1;
		int count=10;
		int start=5;
			
		
		try {
			int arr[]=e6.createArr(size, count, start);
			System.out.println(Arrays.toString(arr));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("예외 처리 후 발생하는 문구");
		
		
	}

	/*
	 * 배열의 길이(size)를 입력받아 해당 길이를 가지는 배열을 생성
	 * 랜덤값을 채워 배열을 리턴하는 메서드
	 * 랜덤값의 범위도 입력받아 해당 범위의 랜덤값 발생
	 * (Math.random() * count)+start
	 * 
	 * -size가 0보다 작으면 예외
	 * -count의 값이 0보다 작으면 예외
	 * 
	 * 
	 * 매개변수: size(배열의 길이), count, start
	 * 리턴 타입: 배열
	 * 
	 * 
	 */
	
	public int[] createArr(int size,int count, int start) {
		
	
		if(size<0) {
			throw new RuntimeException("배열의 길이가 0보다 작음");
		}
		
		if(count<0) {
			throw new RuntimeException("랜덤의 범위가 0보다 작습니다.");
		}
		
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*(count-start+1))+start;
		}
		return arr;
	}
	
	
}
