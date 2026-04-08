package CafeOrderProgram;

import java.util.List;

enum Menu {
	AMERICANO("아메리카노", 4500), LATTE("카페라떼", 5000), GREENTEA("녹차라떼", 6000), ICETEA("복숭아 아이스티", 6000);

	private final String name; // 한글 이름을 담을 필드
	private final int price;

	// 생성자에서 이름과 가격을 모두 받도록 수정
	private Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

enum Size {
	SMALL("small", 0), MIDIUM("midium", 500), LARGE("large", 1000);

	private final int price;
	private final String name;

	private Size(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

}

enum Option {
	SHOT(500, "샷추가"), WHIPPING(700, "휘핑추가"), SYRUP(0, "시럽추가");

	private final String name;
	private final int price;

	private Option(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

}

public class Order {

	private Menu menu;
	private List<Option> option;
	private Size size;

	public Order(Menu menu) {
		this.menu = menu;
	}

	

	public Order(Menu menu, List<Option> option, Size size) {
		super();
		this.menu = menu;
		this.option = option;
		this.size = size;
	}



	// 메뉴+각종 옵션들 가격 계산
	public int menuPrice() {
		return menu.getPrice() + option.stream().mapToInt(n->n.getPrice()).sum() + size.getPrice();
	}

	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	
	


	public List<Option> getOption() {
		return option;
	}



	public void setOption(List<Option> option) {
		this.option = option;
	}



	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

}
