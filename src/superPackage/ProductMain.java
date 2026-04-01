package superPackage;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Product[] menu = new Product[5];

		menu[0] = new Product("떡볶이", 3000);
		menu[1] = new Product("김밥", 4000);
		menu[2] = new Product("라면", 5000);
		menu[3] = new Product("사이다", 1000);
		menu[4] = new Product("콜라", 1000);

		Order[] order = new Order[5];
		// 배열을 사용 시 추후에 배열 복사로 인덱 수를 증가시켜야함

		// 제품 보여주기

		int cnt = 0;// 인덱스 역할

		// 주문 하시겠습니까?

		String ok = "y";

		while (!ok.equals("n")) {
			System.out.println("주문하시겠습니까?(y/n)");
			ok = scan.next();

			if (ok.equals("y")) {

				for (int i = 0; i < menu.length; i++) {
					System.out.println(i + 1 + "." + menu[i]); // toString이 존재해서 가능한 문법ㅛ
				}
				System.out.println("메뉴 선택>");
				int num = scan.nextInt();

				System.out.println("수량>");
				int count = scan.nextInt();

				Order o = new Order(menu[num - 1].getName(), menu[num - 1].getPrice(), count);

				if (order.length == cnt) {
					Order[] tmp = new Order[order.length + 3];
					System.arraycopy(order, 0, tmp, 0, order.length);
					order = tmp;
				}
				order[cnt] = o;
				cnt++;

			} else if (ok.equals("n")) {
				System.out.println("주문을 종료");
				break;
			} else {
				System.out.println("y/n 입력");
			}

		}

		// 전체 주문 내역
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			System.out.println(order[i]);
			sum += order[i].getTotal();
		}
		System.out.println("총 지불 금액>" + sum + "원");

		scan.close();

	}

}
