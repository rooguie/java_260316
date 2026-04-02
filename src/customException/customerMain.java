package customException;

public class customerMain {

	public static void main(String[] args) {
		
		
		Order orderApple=new Order("사과",11);
		
		Product apple=new Product("사과",1000,10,orderApple);

		try {
			orderApple.orderPrint();
			apple. stockCheck();//예외 발생
			apple.stockPrint(orderApple.getOrderCount());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
