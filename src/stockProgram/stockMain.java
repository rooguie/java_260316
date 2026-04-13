package stockProgram;

import java.util.Scanner;

public class stockMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        stockController sc = new stockController();

        sc.setAccount(1000000);


        sc.deposit(scan); //입금



        sc.stockGame(scan); //게임
        

        sc.stockRate(); // 수익률 반환

        System.out.println(sc.getReturnRate());


        sc.sellcalculation(); //이율만큼 저장



        scan.close();

	}

}
