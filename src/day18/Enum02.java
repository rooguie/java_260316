package day18;


enum Category{
	//상품 카테고리
	Food(0.1), //식품: 10%
	CLOTHING(0.08), //의류: 8%
	ELECTRONIC(0.15);//전자제품:15%
	
	private final double vatRate;
	
	Category(double vatRate){
		this.vatRate=vatRate;
	}

	public double getVatRate() {
		return vatRate;
	}
	
}

//상품 클래스: name,Category,price(원가)+부가세=가격책정
class Product{
	private String name;
	private String category;
	private int price;
	
	
	public Product(String name, String category, int price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
}







public class Enum02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
