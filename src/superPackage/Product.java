package superPackage;

public class Product {
	//클래스 생성 시 필요한 사항:멤버변수, 생성자, getter/setter,toString
	

	//판매할 물건 객체: 이름, 가격
	//멤버변수
	private String name;
	private int price;
	
	//생성자 => new 키워드 뒤에서 딱 한번만 실행, 즉 이름을 바꾸거나 가격을 바꿀 수 없음
	//때문에 나중에 편의를 위해 이름과 가격을 등록하는 메서드를 따로 만듦
	public Product() {}
	
	public Product(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	//이름과 가격을 등록하는 메서드
	public void insertProduct(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	@Override
	public String toString() {
		return name + ":" + price;
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
	
}
