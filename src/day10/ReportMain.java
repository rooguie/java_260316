package day10;

import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {// 레포트를 모아서 배열로 정리하는 느낌

		/*
		 * 성적 산출인원>3 이름
		 */
		// 객체의 값을 입력받아 객체 생성 후 배열에 저장
		// 평균은 소수점 2자리 DecimalFormat("##.00")
		// 등수 구한 후 출력
		Report[] scoreList = new Report[3];
		Scanner scan = new Scanner(System.in);

		System.out.println("성적산출인원>");
		int count = scan.nextInt();

//		scoreList[0] = new Report("길동", 9, 55, 33);
//		scoreList[1] = new Report("홍동", 99, 5, 33);
//		scoreList[2] = new Report("홍길", 99, 55, 33);

		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ") 이름,국어,영어,수학 순으로 입력>");
			String name = scan.next();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			scoreList[i] = new Report(name, kor, eng, math);
		}

		// 순위

		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("--------------------");
		for (Report r : scoreList) {
			System.out.println(r);
		}

		int cnt = 1;
		for (int j = 1; j < 3; j++) {
			if (scoreList[i].getAvg() < scoreList[j].getAvg()) {
				cnt++;
			}
			scoreList[i].setRank(cnt);
		}
		System.out.println(scoreList[i].getRank() + "등");
		System.out.println("----------");

	}

}
