package CafeOrderProgram;

public class OrderMain {

	public static void main(String[] args) {
		OrderController oc=new OrderController();
		
		// 메뉴 목록
		oc.printMenu();
		
		//메뉴 선택
		oc.menuChoice();

		//메뉴 출력 
		oc.orderPrint();
		


	}

}
