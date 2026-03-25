package day08;

public class Method05 {
	/*
	 * 최대공약수 최소공배수
	 */

	public int MaxDiv(int num1, int num2) {
		int result = 0;
		if (num1 >= num2) {
			for (int i = num2; i > 0; i--) {
				if (num1 % i == 0 && num2 % i == 0) {
					result = i;
					
				}
			}
		} else {
			for (int i = num1; i > 0; i--) {
				if (num1 % i == 0 && num2 % i == 0) {
					result = i;
					break;
				}
			}
		}
		return result;
	}

	public int MinMul(int num1, int num2) {
		if (num1 >= num2) {
			for (int i = num2;; i += num2) {
				if (i % num1 == 0 && i % num2 == 0) {
					return i;
				}
			}
		} else {
			for (int i = num1;; i += num1) {
				if (i % num1 == 0 && i % num2 == 0) {
					return i;
				}
			}
		}
	}

	public static void main(String[] args) {
		// 최대공약스와 최소공배수 출력 메서드
		int num1 = 12;
		int num2 = 12;

		Method05 me05 = new Method05();

		System.out.println(me05.MaxDiv(num1, num2));
		System.out.println(me05.MinMul(num1, num2));

	}
}
