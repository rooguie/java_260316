package superPackage;

public class SuperProduct {

	//멤버변수
		private String name;
		private int price;
		
		//생성자
		public SuperProduct() {}
		
		public SuperProduct(String name, int price) {
			this.name=name;
			this.price=price;
		}
		
		//상품을 추가하는 메서드(편리성을 위해 추가)
		//개체 생성 이후에 값을 추가해야 할 경우
		public void insertProduct(String name, int price) {
			this.name=name;
			this.price=price;
		}
		
		
		

		@Override
		public String toString() {
			return "[" + name + ","+ price + "]";
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
