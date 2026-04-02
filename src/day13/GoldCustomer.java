package day13;

public class GoldCustomer extends Customer {
	// 상속받은 Customer에 없는 멤버변수만 선언
	// 골드랑 vip는 할인율이 존재
	private double saleRatio;
	
	public GoldCustomer() {}
	
	public GoldCustomer(String id,String name) {
		super(id,name); //부모의 생성자 호출
		super.setRank("골드");
		super.setBonusRate(0.03);
		this.saleRatio=0.05;
	}
	
	
	
	

	@Override
	public int calcPrice(int price) {
		super.calcPrice(price); //부모의 메서드를 호출해서 가격을 주고 보너스 적립가격을 리턴
		int price2=price-(int)(price*saleRatio);
		return price2;
	}
	
	
	

	@Override
	public String toString() {
		return "GoldCustomer [saleRatio=" + saleRatio + "]";
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
}
