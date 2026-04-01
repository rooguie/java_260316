package superPackage;

public class Order extends Product {
	
	//주문 클래스: (상속)제품명, (상속)가격, 수량, 금액
	//제품명과 가격은 상속을 받으면서 생김
	// 부모의 멤버를 사용할 때: super.메서드명/super.멤버변수명
	private int count;
	private int total;
	
	//생성자
	public Order() {}
	
	public Order(String name,int price, int count) {
		super.setName(name);
		super.setPrice(price);
		this.count=count;
		this.total=this.count*super.getPrice();
	}
	
	//total 계산 메서드
	public void totalCalc() {
		this.total=super.getPrice()*this.count;
	}
	
	
	
	@Override
	public String toString() {
		//이름 가격 수량 금액
		return "[" +super.getName()+"  "+super.getPrice()+"  "+ count + "  " + total + "]";	
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}
