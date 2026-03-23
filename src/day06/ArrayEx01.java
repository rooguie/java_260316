package day06;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		/*
		 * 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력 검색어를 포함하는 파일이 존재하지 않으면 일치하는 항목이 없습니다.로 출력
		 */

		String[] fileName = { "이것이자바다.java", "java의정석.java", "array.txt", "array.java", "String.txt",
				"StringMethod.jpg", "ArrayMethod.png", "method.jpg", "javaMethod.png" };

		// 대소문자 구분 없이

		// 검색어 입력받기

		Scanner scan = new Scanner(System.in);

		String search = " ";

		System.out.println("검색 단어:");
		search = scan.next().toLowerCase(); //소문자로 변환해서 입력받기
		
		System.out.println("-----일치하는 항목-----");

		// System.out.println(search);

		scan.close();

		// 배열에 순차적으로 접근

		int cnt = 0; // 검색된 단어 수

		for (int i = 0; i < fileName.length; i++) {
			if (fileName[i].toLowerCase().contains(search)) {
				cnt++;
				System.out.println(fileName[i]);
			}

		}

		if (cnt > 0) {
			System.out.println("검색된 파일 수:" + cnt);

		}

		else if (cnt == 0) {
			System.out.println("일치하는 항목이 없습니다.");
		}
		
		
		

	}

}
