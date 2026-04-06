package day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		// map을 활용한 단어장 프로그램 작성
		// 1.단어등록/2.단어검색/3.단어수정/4.단어출력/5.단어삭제/6.종료
		/*
		 * map=> 단어 뜻 WordController
		 */
		//=> 뜻을 리스트로 변경
		
		
		Scanner scan = new Scanner(System.in);
		WordController wc = new WordController();
		int choice = 0;

		wc.addWord();

		while (true) {

			System.out.println("--선택--");
			System.out.println("1.단어등록|2.단어검색|3.단어수정");
			System.out.println("4.단어출력|5.단어삭제|6.종료");
			System.out.println("선택>");
			try {
				choice = scan.nextInt();

				switch (choice) {
				case 1:
					wc.register(scan);
					break;
				case 2:
					wc.search(scan);
					break;
				case 3:
					wc.modify(scan);
					break;
				case 4:
					wc.wordPrint();
					break;
				case 5:
					wc.delete(scan);
					break;
				case 6:
					System.out.println("종료");
					;
					break;
				default:
					System.out.println("잘못된 입력");
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력값");
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
			}

			if (choice == 6) {
				break;
			}

		}

		scan.close();

	}

}
