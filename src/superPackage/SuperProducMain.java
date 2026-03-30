package superPackage;

import java.util.Scanner;

public class SuperProducMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 판매할 상품 등록 --> product[]
		SuperProduct[] menu = new SuperProduct[5];
		// 배열에 등록&객체 생성
		menu[0] = new SuperProduct("김밥", 3000);

		// 객체 생성 후 => insertProduct 호출
		SuperProduct p =new SuperProduct();
		p.insertProduct("라면", 1500);
		menu[1]=p;
		
		menu[2]=new SuperProduct("떡볶이",4000);
		menu[3]=new SuperProduct("볶음밥",5000);
		menu[4]=new SuperProduct("사이다",500);

		// 주문을 담을 변수 []

		SuperOrder[] order = new SuperOrder[5];
		int cnt = 0;

		char ok = 'y';
		while (ok != 'n') {
			System.out.println("주문하시겠습니다까? (y/n)");
			ok = scan.next().charAt(0);

			if (ok == 'n') {
				System.out.println("주문 종료");
				break;
			}
			if (ok == 'y') {
				// 처리
				// 메뉴 출력
				for (int i = 0; i < menu.length; i++) {
					System.out.println(i + 1 + "." + menu[i]);
				}

				System.out.println("메뉴를 선택해주세요>");
				int menuNo = scan.nextInt();

				System.out.println("수량>");
				int count = scan.nextInt();

				String menuName = menu[menuNo - 1].getName();
				int price = menu[menuNo - 1].getPrice();

				SuperOrder o = new SuperOrder(menuName, price, count);

				// 배열이 꽉 차서 넣을 공간이 없을 경우
				if (order.length == cnt) {
					SuperOrder[] tmp = new SuperOrder[order.length + 3];
					System.arraycopy(order, 0, tmp, 0, order.length);
					order = tmp;
				}

				order[cnt] = o;
				cnt++;

			} else {
				System.out.println("y/n만 선택");
			}

		}

		System.out.println("--주문 내역 출력--");
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			System.out.println(order[i]);
			sum += order[i].getTotal();
		}
		if (cnt == 0) {
			System.out.println("주문 내역이 없음");
		}
		
		System.out.println("-----------------");
		System.out.println("총 지불금액 : "+sum);

		scan.close();

	}

}
