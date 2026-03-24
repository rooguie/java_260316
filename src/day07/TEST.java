package day07;

import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numList;
		int numCount = 0;
		int sum = 0;
		float avg = 0;
		String numbers = " ";
		String[] numberSplit;

		sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력:");
		numbers = scan.next();

		numList = new int[numbers.length()];
		numberSplit = numbers.split("");
	}

}
