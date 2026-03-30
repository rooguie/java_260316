package day10;

public class CardPack {
	/*
	 * 52장의 카드를 배열로 저장 (pack) ♥️A~♥️K/.....
	 * 
	 * 
	 * -멤버변수: 52장의 카드를 담을 수 있는 배열 +번지
	 * 
	 * 메서드 1. 카드를 섞는 기능 2. 카드를 한장 빼는 기능(유저에게 주는) 3. 카드 초기화 기능(나눠준 카드 회수 느낌)
	 * 
	 * -생성자
	 * 
	 */

	private Card[] pack = new Card[52];
	private int index;

	// 카드팩 생성
	public CardPack() {
		String[] shape = { "♥️", "♣️", "♠️", "♦️" };
		for (int i = 0; i < shape.length; i++) {
			for (int j = 1; j <= 13; j++) {
				Card card = new Card();

				card.setShape(shape[i]);
				card.setNumber(j);

				pack[index] = card;
				index++;
			}
		}
	}

	// 카드 섞는 메서드
	public void shuffle() {
		for(int i=0;i<pack.length;i++) {
			int random =(int)(Math.random()*pack.length);
			
			Card tmp =pack[i];
			pack[i]=pack[random];
			pack[random]=tmp;
			
		}
	}
	
	//하나씩 나눠주는 기능
	public Card pick() {
		if(index==0) {
			return null;
		}
		index--;
		return pack[index];
	}
	
	//다시 회수하는 메서드
	//index번지를 원래대로 회복
	public void init() {
		index=52;
		shuffle();
	}

	// getter/setter
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

}
