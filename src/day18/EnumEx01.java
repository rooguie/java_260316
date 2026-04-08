package day18;

enum Coffee{
	//메뉴 가격
	AMERICANO(4000),
	LATTE(4500),
	GREENTEA(6000);
	
	private final int price;

	Coffee(int price) { //생성자 필수!! 중요!!
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	
}

public class EnumEx01 {

	public static void main(String[] args) {
		// 커피숍 메뉴(가격)을 enum 클래스로 생성
		
		//주문 클래스 커피에 대한 메뉴(enum 클래스), 수량, 가격=> 출력
		//Menu m=new Menu("아메리카노",menu.AMERICANO,10);
		
		//메인에서 커피 메뉴 주문=> 출력
		

	}

}


class Order{
	private Coffee coffee;
	private int count;
	
	

	public Order(Coffee coffee,int count) {
		this.coffee = coffee;
		this.count = count;
	}
	
	
	public int getTotalPrice(){
		return coffee.getPrice()*count;
	}
	
	
	
	
	@Override
	public String toString() {
		return coffee+ "," + count+"개" + ", 가격:" + getTotalPrice();
	}

	

	
	public Coffee getCoffee() {
		return coffee;
	}


	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}


	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}









