package day16;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목,점수를 입력 받아 map에 입력
		// 종료 키워드가 나올 때까지 반복(1=계속,0=종료)
		// 과목: 점수 /합계/평균
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		while (true) {
			int score = 0;
			int choice = 0;
			String subject = "";

			try {

				System.out.println("과목 입력:");
				subject = scan.next();

				System.out.println("점수 입력:");
				score = scan.nextInt();

				map.put(subject, score);

			} catch (InputMismatchException e) {
				System.out.println("잘못된 점수 입력");
				scan.nextLine(); // 입력 버퍼 비우기
			}

			System.out.println("계속 입력?(1=계속/0=종료)");
			choice = scan.nextInt();

			if (choice == 0) {
				System.out.println("입력 종료");
				break;
			}

		}

		for (String key : map.keySet()) {
			sum += map.get(key);
			System.out.println(key + ":" + map.get(key));
		}

		double avg = (double) sum / map.size();

		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);

		scan.close();

	}

}
