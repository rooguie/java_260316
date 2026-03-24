package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 숫자야구 컴퓨터가 랜덤(0~9)으로 3자리 숫자를 생성 각 자릿수 랜덤 생성 ==> 배열로 저장 숫자랑 자리까지 위치하면 스트라이크 숫자는
		 * 맞는 자리는 맞지 않으면 볼 숫자가 아예 없으면 아웃
		 */
		// 조건 중복 불가능

		// 컴퓨터 중복 없는 숫자 랜덤 생성

		int com[] = new int[3];
		int i = 0;
		int cnt = 0; // 도전 횟수

		while (true) {
			com[i] = (int) (Math.random() * 10);
			i++;
			if (i == 3) {
				if (com[0] != com[1] && com[1] != com[2] && com[2] != com[0]) {
					break;
				} else {
					i = 0;
				}
			}
		}

		System.out.println(Arrays.toString(com));

		while (true) {
			// 유저 숫자 받기
			cnt++;
			Scanner scan = new Scanner(System.in);

			int user[] = new int[3];
			System.out.println(cnt + "번째 유저 숫자(0~9) 입력:");

			for (i = 0; i < user.length; i++) {
				System.out.println((i + 1) + "번째 숫자");
				user[i] = scan.nextInt();
				if (user[i] < 0 || user[i] > 9) {
					System.out.println("잘못된 숫자 입력");
					i--;
				}
			}

			// System.out.println(Arrays.toString(user));

			// 컴퓨터랑 유저 숫자 비교
			/*
			 * 숫자랑 자리까지 위치하면 스트라이크 숫자는 맞는 자리는 맞지 않으면 볼 숫자가 아예 없으면 아웃
			 */
			// -----ai 도움 조금 받음------
			int s = 0, b = 0;
			for (i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j]) {
						if (i == j) {
							s++;
						} else {
							b++;
						}
					}

				}
			}

			System.out.println("user:" + Arrays.toString(user)); // 유저 픽
			if (s == 0 && b == 0) {
				System.out.println("아웃");
			} else if (s == 0) {
				System.out.println(b + "볼");
			} else if (b == 0) {
				System.out.println(s + "스트라이크");
			} else {
				System.out.println(s + "스트라이크 " + b + "볼");

			}

			if (s == 3) {
				System.out.println(cnt + "번만에 정답입니다!");
				scan.close();
				break;
				// ------ai 도움 받음----
			}

		}

	}

}
