package day11;

public class Order extends Product {

//	private Product[] menu;
//	private String[] order;
//	private int total;
//	private int count;
//
//	public Order() {
//		menu=new Product[5];
//	}
//
//	public void menuIn() {
//		Product pd = new Product();
//		
//		if(count>menu.length) {
//			System.out.println("메뉴 추가 불가능");
//		}
//		
//		pd.menuIn();
//		menu[count]=pd;
//		count++;
//		
//	}
//	
//
//	public void orderIn() {
//		Scanner scan=new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("1.메뉴추가 2.주문하기 >");
//			int choice=scan.nextInt();
//			
//			if(choice==1) {
//				for(int i=0;i<menu.length;i++) {
//					System.out.print(i+1+"번");
//					menu[i].menuPrint();
//				}
//				
//				System.out.println("추가할 메뉴>");
//				int menuNum=scan.nextInt();
//				System.out.println("추가할 개수>");
//				int menuCount=scan.nextInt();
//				
//				order=
//				
//				
//				
//			}
//			
//			
//		}
//	}
//
//	public Product[] getMenu() {
//		return menu;
//	}
//
//	public void setMenu(Product[] menu) {
//		this.menu = menu;
//	}
//
//	public int getTotal() {
//		return total;
//	}
//
//	public void setTotal(int total) {
//		this.total = total;
//	}
//
//	public int getCount() {
//		return count;
//	}
//
//	public void setCount(int count) {
//		this.count = count;
//	}
//
//	public String[] getOrder() {
//		return order;
//	}
//
//	public void setOrder(String[] order) {
//		this.order = order;
//	}

	// 주문 상품, 개수, 가격, 총 금액
	// 멤버 변수
	
	
	
	// 상속으로 받기
//	private String name;//상품명
//	private int price;//판매가격

	private int count;// 주문수령
	private int total;// 최종금액:수량*가격

	public Order() {

	}

	public Order(String name, int price, int count) {
		super(name, price);
		this.count = count;
		totalCalc();
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
