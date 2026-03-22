package day03;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 클래스: 수학관련 기능이 있는 클래스
		// Math.round(값): 반올림 소수 자릿수는 0
		// Math.ceil(값) : 올림 소수 자릿수는 0
		// Math.floor(값) : 버림 소수 자릿수는 0
		// Math.random(): 0~1사이의 아무 수를 dounle 리턴

		
		double num=3.14159;
		
		int roundNum=(int)Math.round(num); //return int
		System.out.println(roundNum);
		
		double ceilNum=Math.ceil(num);
		System.out.println(ceilNum);
		
		int floorNum=(int)Math.floor(num);
		System.out.println(floorNum);
		
		//Math.max(값1,값2) Math.min(값1,값2)
		int num1=10, num2=20;
		System.out.println(Math.max(num1, num2)); //최대값
		System.out.println(Math.min(num1, num2)); //최솟값
		
		//Math.random()
		//(int)(Math.random()*10) --> 0~9
		//(int)(Math.random()*10)+1 --> 1~10
		System.out.println((int)(Math.random()*10));
		
		//1~6까지의 난수
		//(int)(Math.random()*count)+start
		System.out.println((int)(Math.random()*6)+1);
		
		//Random 클래스
		Random random =new Random();
		System.out.println(random.nextInt(10)); //0~9까지의 난수
		
	}

}
