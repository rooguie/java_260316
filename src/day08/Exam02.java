package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam02 {
	
	//중복 메서드가 로또랑 유저 메서드에 둘다 사용됨으로 꺼내서 따로 만들기
	//중복 제거 메서드
	public boolean isContains(int[] arr,int random) {
		
	}
	
	
	// 로또 번호 메서드
	public int[] lottoNum() {
		int lottoNum[] = new int[7];

		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {

				if (lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				}
			}

		}

		return lottoNum;

	}

	// 유저 번호 메서드
	public int[] userNum() {
		Scanner scan = new Scanner(System.in);

		int[] userNum = new int[6];

		for (int i = 0; i < userNum.length; i++) {
			System.out.printf("%d번째 숫자 입력:\n", i + 1);
			userNum[i] = scan.nextInt();

			for (int j = 0; j < i; j++) {
				if (userNum[i] == userNum[j]) {
					System.out.println("중복된 숫자 입력, 다시 입력하세요");
					i--;
					break;
				}
			}

		}

		scan.close();
		return userNum;
	}

	// 비교 및 결과 메서드
	// 로또 마지막 인덱스가 보너스 점수

	public void result(int user[], int lotto[]) {
		int cnt = 0;// 일치하면 카운트 증가
		int bonus = 0;
		boolean bonusCheck = false; // 있으면 true
		
		
		// 유저번호랑 로또번호가 반대로 들어올 수 있는 경우 체크해서 오류내용 출력
		
		
		
		

		bonus = lotto[lotto.length - 1];

		// 보너스 제외 맞춘 개수 체크
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < user.length; j++) {
				if (lotto[i] == user[j]) {
					cnt++;
				}
			}
			// 보너스 체크
			if (bonus == user[i]) {
				bonusCheck = true;
			}

		}

		// 등수 출력
		if (cnt == 6) {
			System.out.println("1등");
		}

		else if (cnt == 5 && bonusCheck == true) {
			System.out.println("2등");
		}

		else if (cnt == 5) {
			System.out.println("3등");

		} else if (cnt == 4) {
			System.out.println("4등");

		}

		else if (cnt == 3) {
			System.out.println("5등");
		}

		else {
			System.out.println("꽝");
		}

	}

	public static void main(String[] args) {
		/*
		 * 로또 번호 생성 => 당첨 여부 유저 번호 6개 1~45까지 번호 중 6개 선택(랜덤 자동선택)
		 *
		 * 당첨번호 7개=> 6개+보너스 번호
		 * 
		 * 유저번호와 당첨번호는 중복 불가능 당첨여부 확인
		 * 
		 * 6개 일치=1등 5개 일치+보너스번호O=2등 5개 일치+보너스번호X=3등 4개 일치=4등 3개 일치=5등 나머지= 꽝
		 * 
		 * 
		 */

		Exam02 ex02 = new Exam02();

		int[] lottoNum = ex02.lottoNum();
		System.out.println(Arrays.toString(lottoNum)); // 테스트용

		int[] userNum = ex02.userNum();

		ex02.result(userNum, lottoNum);

	}

}
