package day07;

import java.util.Scanner;

public class MethodEx01 {

	// 계산기 만들기
	// 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나머지 6.종료
	public void Cal() {
		Method03 me03 = new Method03();
		Scanner scan = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		int choice = 0;
		double result = 0;
		int result2 = 0;
		
		
		
		while (true) {

			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지 6.종료");
			choice = scan.nextInt();

			if (choice <= 0 || choice > 6) {
				System.out.println("잘못된 번호 입력");
				continue;
			}

			if (choice == 6) {
				System.out.println("프로그램 종료");
				break;
			}

			System.out.println("첫번째 숫자>");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자>");
			num2 = scan.nextInt();

			if (choice == 1) {
				System.out.println(me03.sum(num1, num2));
			}

			else if (choice == 2) {
				System.out.println(me03.sub(num1, num2));
			}

			else if (choice == 3) {
				System.out.println(me03.mul(num1, num2));
			}

			else if (choice == 4) {
				result = me03.div(num1, num2);

				if (result == 1.0) {
					System.out.println("오류");
				}

				else {
					System.out.println(result);
				}
			}

			else if (choice == 5) {
				result2 = me03.remain(num1, num2);

				if (result2 == 1) {
					System.out.println("오류");
				}

				else {
					System.out.println(result2);
				}
			}

		}

	}

	public static void main(String[] args) {

		MethodEx01 me03 = new MethodEx01();

		me03.Cal();

	}
}
