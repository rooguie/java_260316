package superPackage;

public class SuperOrder extends SuperProduct{

	private int count;// 주문수령
	private int total;// 최종금액:수량*가격

	public SuperOrder() {

	}

	public SuperOrder(String name, int price, int count) {
		super(name, price);
		this.count = count;
		totalCalc(); //생성자 우선
	}

	public void totalCalc() {
		this.total = super.getPrice() * this.count;
	}

	// 주문 추가 메서드
	public void insertOrder(String name, int price, int count) {
		super.setName(name);
		super.setPrice(price);
		this.count = count;
	}

	@Override
	public String toString() {
		return "[" + super.getName() + "," + count + "," + super.getPrice() + "=>" + total + "]";
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
