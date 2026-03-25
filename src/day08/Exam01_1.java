package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01_1 {

	public static void main(String[] args) {
		// 숫자를 하나씩 입력 받고 입력 받은 숫자의 합계와 평균 구하기
		// 형식
		// 1,2,3,4
		// --> 1+2+3+4 합계 평균
		int num = 0;
		int	sum = 0;
		int count=0;
	
		Scanner scan = new Scanner(System.in);
		
		//배열에 저장
		int[] numbers=new int[5];

		while (true) {
			System.out.println("숫자 입력(0 또는 음수는 종료):");
			num = scan.nextInt();

			if (num <= 0) {
				System.out.println("프로그램 종료");
				break;

			}
			
			//배열에 값 넣기(배열에 공간이 남아 있는지 확인)
			if(numbers.length==count) {
				//새 배열 생성
				int[] newArray=new int[numbers.length+3];
				System.arraycopy(numbers, 0, newArray, 0, numbers.length);
				numbers=newArray;
			}
			numbers[count]=num;
			sum+=num;
			count++;

		}
		
		
		System.out.println(Arrays.toString(numbers));
		
		
		
		if(count==0) {
			System.out.println("입력한 숫자가 없습니다.");
		}else {
			System.out.println("--계산식--");
			for(int i=0;i<count-1;i++) {
				System.out.print(numbers[i]+"+");
			}
			
			System.out.println(numbers[count-1]);
			System.out.println("합계:"+sum+" "+"/ 평균:"+(double)sum/count);
		}
		
		
		
		
		
		
		
		scan.close();

	}
}
