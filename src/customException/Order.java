package customException;

public class Order {
	private String name;
	private int orderCount;
	
	public Order() {}
	
	public Order(String name,int orderCount) {
		this.name=name;
		this.orderCount=orderCount;
	}
	
	
	
	public void orderPrint() {
		System.out.println(this.getName()+"->"+orderCount+"개 주문");
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
