package CafeOrderProgram;

import java.util.Map;
import java.util.Scanner;

public class OrderController {

	private Order order;
	private Map<Order, Integer> menuList; //옵션포함 메뉴+개수
	private int totalPrice;

	public OrderController() {
	}



	public OrderController(Order order, Map<Order, Integer> menuList, int totalPrice) {
		super();
		this.order = order;
		this.menuList = menuList;
		this.totalPrice = totalPrice;
	}



	// 메뉴 목록 출력
	
	public void printMenu() {
		
		int num=0;
		for(Menu m:Menu.values()) {
			num++;
			System.out.println(num+"."+m.getName()+":"+m.getPrice()+"원");
		}
		
		
	}
	
	
	
	// 메뉴 선택
	public void menuChoice() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("주문하실 메뉴를 선택해 주세요");
		int choice=scan.nextInt();
	
		//선택한 메뉴로 오더 생성
		Order o=new Order(Menu.values()[choice]);
		
		//생성된 오더로 옵션 및 사이즈 추가
		
		
		
		scan.close();
	}

	// 메뉴 주문 및 주문 완료

	
	//gs
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
