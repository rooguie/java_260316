package CafeOrderProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderController {

	private Order order;
	private Map<Order, Integer> menuList = new HashMap<>(); // 옵션포함 메뉴+개수
	private int totalPrice;

	public OrderController() {
	}

	public OrderController(Order order, Map<Order, Integer> menuList, int totalPrice) {
		this.order = order;
		this.menuList = menuList;
		this.totalPrice = totalPrice;
	}

	// 메뉴 목록 출력

	public void printMenu() {

		int num = 0;
		for (Menu m : Menu.values()) {
			num++;
			System.out.println(num + "." + m.getName() + ":" + m.getPrice() + "원");
		}

	}

	// 메뉴 선택
	public void menuChoice() {
		Scanner scan = new Scanner(System.in);

		System.out.println("주문하실 메뉴를 선택해 주세요");
		int choice = scan.nextInt();
		int num=0;
		

		// 선택한 메뉴로 오더 생성 
		Order order = new Order(Menu.values()[choice-1]);
		totalPrice+=Menu.values()[choice - 1].getPrice();


		System.out.println("사이즈 선택");
		int sizeNum=0;
		for (Size size: Size.values()) {
				sizeNum++;
				System.out.println(sizeNum + "." + size.getName());
			}

		choice = scan.nextInt();
		order.setSize(Size.values()[choice-1]);
		totalPrice+=Size.values()[choice - 1].getPrice();

		
		

		while (true) {
			// 생성된 오더로 옵션 및 사이즈 추가
			num = 0;
			System.out.println("옵션 선택");
			for (Option op : Option.values()) {
				num++;
				System.out.println(num + "." + op.getName());
			}
			

			int opChoice = scan.nextInt();

			System.out.println(Option.values()[opChoice - 1].getName());

			order.getOption().add(Option.values()[opChoice - 1]);
			totalPrice+=Option.values()[opChoice - 1].getPrice();

			System.out.println("옵션 추가?(y/n)");
			Character answer = scan.next().charAt(0);
			scan.nextLine();

			if (answer == 'n') {
				break;
			}
		}

		// 개수 선택
		System.out.println("개수를 선택해주세요");
		int count = scan.nextInt();
		totalPrice=totalPrice*count;


		menuList.put(order, count);

		scan.close();
	}

	// 주문 메뉴 출력
	public void orderPrint() {
		for (Order order : menuList.keySet()) {
			order.menuPrint(); // 추가된 메뉴
			System.out.println("------");
			System.out.print(menuList.get(order) + "개\n"); // 개수
			System.out.println("총 결제 금액: "+this.totalPrice+"원");
		}


		System.out.println("주문 완료");
	}

	// gs
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Map<Order, Integer> getMenuList() {
		return menuList;
	}

	public void setMenuList(Map<Order, Integer> menuList) {
		this.menuList = menuList;
	}

}
