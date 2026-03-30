package day10;

import java.util.Scanner;

public class Card {
	/*
	 * 숫자: 1~13 => 1(A), 11(J), 12(Q), 13(K) 모양: ♣️ ♥️ ♦️ ♠️ ex> ♥️A ♠️4 ....
	 * 
	 * 해당 범위에 벗어나는 숫자는 => 1(A) 처리 해당 범위에 벗어나는 모양은 => ♥️ ex) ^1 => ♥️A / ♦️23 => ♦️A
	 * 
	 * 멤버변수: 숫자(number), 모양(shape) toString 생성자 => 기본 생성자=>시작 ♥️A print (조건을 달아서 A J
	 * Q K로 출력 근데 실제로 비교 가능하게 숫자를 가지고 있어야함) getter/setter
	 */

	// 멤버변수
	private int number;
	private String shape;

	// 생성자
	public Card() {
		this.number = 1;
		this.shape = "♥️";
	}

	// 메소드

	// 출력
	public void print() {

		System.out.print(shape);
		switch (number) {
		case 1:
			System.out.print("A");
			break;
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
		default:
			System.out.print(number);
		}
		System.out.println();
	}

	// getter/setter
	public int getNumber() {
		return number;
	}

	public String toString() {
		return shape + number;
	}

	public void setNumber(int number) {
		if (number < 1 || number > 13) {
			this.number = 1;
			return;
		}
		this.number = number;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		switch (shape) {
		case "♥️":
		case "♦️":
		case "♠️":
		case "♣️":
			this.shape = shape;
			break;
		default:
			this.shape = "♥️";
		}
	}

}
