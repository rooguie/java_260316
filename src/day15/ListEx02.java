package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		// 숫자를 입력받아 리스트로 생성하기
		// 출력=> 전체 합계 출력
		// 숫자를 1,2,3,4,5,6 이런식으로 받고 엔터 누르면 합계 출력
		
		Scanner scan= new Scanner(System.in);
		List<Integer> numList=new ArrayList<>();
		int sum=0;
		
		System.out.println("숫자 입력:");
		String numbers=scan.next();
		
		String[] numArray=numbers.split(",");
		
		
		
		for(int i=0;i<numArray.length;i++) {
			numList.add(Integer.parseInt(numArray[i]));
			sum+=Integer.parseInt(numArray[i]);
		}
		
		System.out.println("리스트:"+numList);

		System.out.println("합계:"+sum);
		
		
		scan.close();
		

	}

}
