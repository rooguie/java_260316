package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력 12345 => 1+2+3+4+5 합계 평균 12345678 =>
		 * 1+2+3+4+5+6+7+8 합계 평균 반복(0또는 음수 입력 시 종료)
		 */

		// 스트링으로 숫자 받기
		int[] numList;
		int numCount = 0;
		int sum = 0;
		float avg = 0;
		String numbers = " ";
		String[] numberSplit;

		while (true) {
			sum = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자입력:");
			numbers = scan.next();

			numList = new int[numbers.length()];
			numberSplit = numbers.split("");

			if (numberSplit[0].equals("-")) {
				System.out.println("프로그램 종료");
				break;
				
			} else if (Integer.parseInt(numberSplit[0]) == 0) {
				System.out.println("프로그램 종료");
				break;
			}

			for (int i = 0; i < numbers.length(); i++) {
				numList[i] = Integer.parseInt(numberSplit[i]);
				sum += numList[i];
			}

			avg = (float)sum / numbers.length();

			System.out.println("입력된 숫자:" + numbers);
			System.out.println("합계:" + sum);
			System.out.printf("평균:%.2f", avg);
			System.out.println();
			System.out.println("-------------------------------");

		}

	}

}
