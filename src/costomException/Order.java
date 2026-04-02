package costomException;

public class Order extends Product {
	
	private int orderCount;
	
	public Order() {}
	
	public Order(String name,int orderCount) {
		super(name);
		this.orderCount=orderCount;
	}
	
	
	
	public void orderPrint() {
		System.out.println(super.getName()+"->"+orderCount+"개 주문");
	}

	

	@Override
	public String toString() {
		return "Order [orderCount=" + orderCount + "]";
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	
	

}
