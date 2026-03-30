package day10;

import java.util.Arrays;

public class CardMain {

	public static void main(String[] args) {
		
		
		CardPack cp=new CardPack();
		System.out.println("딜러가 카드 섞는중");
		
		cp.shuffle();
		
		//player 4명
		System.out.println("딜러가 카드를 나눠주는 중");
		System.out.println("유저1");
		Card player1=cp.pick();
		System.out.println("유저2");
		Card player2=cp.pick();
		System.out.println("유저3");
		Card player3=cp.pick();
		System.out.println("유저4");
		Card player4=cp.pick();
		
		System.out.println("각 플레이어 카드 오픈");
		System.out.println("유저1>");
		player1.print();
		System.out.println("유저2>");
		player2.print();
		System.out.println("유저3>");
		player3.print();
		System.out.println("유저4>");
		player4.print();
		
		cp.init();
		
		
		
//		Card card = new Card();
//
//		CardPack cardPack = new CardPack();
//
//		for (int i = 0; i < cardPack.getPack().length; i++) {
//			cardPack.getPack()[i].print();
//		}
//		
//		Card[] pack= cardPack.getPack();
//		
//		for(int i=0; i<pack.length;i++) {
//			Card c = pack[i];
//			card.print();
//		}

	}
}
