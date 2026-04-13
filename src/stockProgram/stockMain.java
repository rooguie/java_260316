package stockProgram;

import java.util.Scanner;

public class stockMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        stockController sc = new stockController();


        sc.deposit(scan); //입금
        sc.stockGame(); //게임
        sc.sellcalculation(); //이율만큼 저장

        scan.close();

	}

}
