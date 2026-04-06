package GenericProduct;

import java.util.InputMismatchException;
import java.util.Scanner;

public class productMain {

	public static void main(String[] args) {
		// Product class => generic으로 생성
		// main menu
		//1. 메뉴추가 2. 메뉴보기 3. 제품주문 4. 주문내역보기(주문내역+총 가격) 5. 종료
		Scanner scan=new Scanner(System.in);
		ProductController pc= new ProductController();
		
		pc.addMenu();
		
		int choice=0;
		
		do {
			
			
			System.out.println("1.메뉴추가 | 2.메뉴보기 | 3.제품주문 | 4.주문내역보기 | 5.종료");
			System.out.println("메뉴 입력:");
			
			try {
			choice=scan.nextInt();
			
			switch(choice) {
			case 1: pc.insertMenu(scan);break;
			case 2: pc.printMenu();break;
			case 3: pc.orderPick(scan);break;
			case 4: pc.printOrder(scan);break;
			case 5: System.out.println("종료");;break;
			default: System.out.println("메뉴 외 번호 입력");
			}
			}catch (InputMismatchException e) {
				System.out.println("올바르지 않은 입력");
				scan.nextLine();
			}catch (Exception e) {
				System.out.println("다시 입력해주세요");
				scan.nextLine();
			}
				
			
			
		}while(choice!=5);
		
		
		
		
		
		
		scan.close();
	}


}
