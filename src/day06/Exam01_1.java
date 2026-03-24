package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01_1 {

	public static void main(String[] args) {
		// 야구게임
		
		int comNum[] = new int[3];
		int userNum[]=new int[3];
		
		Scanner scan=new Scanner(System.in);
		
		
		
		//comNum 중복 없이 추출
		for(int i=0;i<comNum.length;i++) {
			comNum[i]=(int)(Math.random()*10);
			for(int j=0; j<i ;j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(comNum));
		
		//userNum String으로 받아서 배열 split "" => 한글자씩 잘라 배열로 리턴
		//숫자로 변환
		
		
		while(true) {
			//userNum
			System.out.println("숫자 입력:");
			String myNum = scan.next();
			
			//한글자씩 나누어 배열로 리턴
			String[] myNumStr = myNum.split("");
			for(int i=0;i<myNumStr.length;i++) {
				userNum[i]=Integer.parseInt(myNumStr[i]); //문자를 숫자로 변환
			}
			
			System.out.println("user:"+Arrays.toString(userNum));
			
			//비교
			int stk=0, ball=0;
			
			for(int i=0;i<comNum.length;i++) {
				for(int j=0;j<userNum.length;j++) {
					if(comNum[i]==userNum[j] && i==j) {
						stk++;
					}
					else if(comNum[i]==userNum[j] && i!=j) {
						ball++;
					}
				}
			}
			
			
			//출력
			if(stk==0 && ball==0) {
				System.out.println("out");
			}
			
			
			
		}
		
		
		

				
		
	}

}
