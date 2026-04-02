package customException;

public class Product {
	
	private String name;
	private int price;
	private int count;
	private Order order;
	
	public Product() {}

	
	public Product(String name, int price, int count,Order order) {;
		this.name = name;
		this.price = price;
		this.count = count;
		this.order=order;
	}

	
	
	public void stockPrint(int orderCount) {
		System.out.println(orderCount+"개 판매");
		System.out.println("내 매출:"+this.price*orderCount);
		System.out.println("재고:"+this.count);
	}
	
	public void stockCheck(){
		if(this.count<order.getOrderCount()){
			throw new OutOfStockException("재고 부족");
		}
		this.count=this.count-order.getOrderCount();
	}
	
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {


		this.count = count;
		
	}
	
	
}
