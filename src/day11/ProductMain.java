package day11;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/*
		 * 
		 * 상품(product) 클래스: 상품(5개), 가격
		 * 주문(order) 클래스: 상품(기본 5개+@), 개수, 가격
		 * 
		 * 주문 출력(하나의 주문에 대한 출력)
		 * 마지막에 총 지불금액 출력
		 */

		
		/*
		 *전체 메뉴(상품) 보여주기
		 *주문 > 상품에 대한 값과 수량 받기
		 *반복 주문 가능 => 종료 키워드를 생성, 반복 주문이 가능하도록
		 *종료가 끝나면 주문이 완료됐습니다. 후 전체 주문내역/ 총지불금액 출력
		 *
		 * ex) 
		 * 김밥 3000 2개 6000원
		 * 라면 3000 2개 6000원
		 * 사이다 3000 2개 6000원
		 * -----------------
		 * 총 지불 금액 	10000원
		 */
		
		
		//메뉴 넣기
//		Product[] pd=new Product[5];
//		Scanner scan=new Scanner(System.in);
//		
//		for(int i=0;i<pd.length;i++) {
//			pd[i]=new Product();
//			pd[i].menuIn();
//		}
//		scan.close();
//		
//		for(Product tmp: pd) {
//			tmp.menuPrint();
//		}
//		
//		
		Scanner scan=new Scanner(System.in);
		
		
		//판매할 상품 등록 --> product[]
		Product[] menu=new Product[5];
		//배열에 등록&객체 생성
		menu[0]=new Product("김밥",3000);
		
		//객체 생성 후 => insertProduct 호출
//		Product p =new Product();
//		p.insertProduct("라면", 1500);
//		menu[1]=p;
//		
//		menu[2]=new Product("떡볶이",4000);
//		menu[3]=new Product("볶음밥",5000);
//		menu[4]=new Product("사이다",500);
		
		//주문을 담을 변수 []
		
		Order[] order=new Order[5];
		int cnt=0;
		
		char ok='y';
		while(ok!='n') {
			System.out.println("주문하시겠습니다까? (y/n)");
			ok=scan.next().charAt(0);
			
			if(ok=='n') {
				System.out.println("주문 종료");
				break;
			}
			if(ok=='y') {
				//처리
				//메뉴 출력
				for(int i=0;i<menu.length;i++) {
					System.out.println(i+1+"."+menu[i]);
				}
				
				System.out.println("메뉴를 선택해주세요>");
				int menuNo=scan.nextInt();
				
				System.out.println("수량>");
				int count=scan.nextInt();
				
				String menuName=menu[menuNo-1].getName();
				int price=menu[menuNo-1].getPrice();
				
				Order o= new Order(menuName,price,count);
				
				//배열이 꽉 차서 넣을 공간이 없을 경우
				if(order.length==cnt) {
					Order[] tmp=new Order[order.length+3];
					System.arraycopy(order, 0, tmp, 0, order.length);
					order=tmp;
				}
				
				
				order[cnt]=o;
				cnt++;
	
				
			}else {
				System.out.println("y/n만 선택");
			}
			
			
			
		}
		
		System.out.println("--주문 내역 출력--");
		int sum=0;
		for(int i=0;i<cnt;i++) {
			System.out.println(order[i]);
			sum+=order[i].getTotal();
		}
		if(cnt==0) {
			System.out.println("주문 내역이 없음");
		}
	
		
		
		scan.close();
	}

}
