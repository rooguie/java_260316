package stockProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class stockController {
	private int account;
	private int money;
	private String startYear;
	private String finishYear;
	private String startMonth;
	private String finishMonth;
	private String stockName;
	private double returnRate;

	public stockController() {
	}

	public stockController(int money,int account, String startYear, String finishYear, String startMonth, String finishMonth,
			String stockName, double returnRate) {
		this.money = money;
		this.account=account;
		this.startYear = startYear;
		this.finishYear = finishYear;
		this.startMonth = startMonth;
		this.finishMonth = finishMonth;
		this.stockName = stockName;
		this.returnRate = returnRate;
	}

	// 투자 금액 입금
	public void deposit(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("투자 할 금액을 입력해주세요 >");
		this.money = scan.nextInt();

		this.account -= money;
		System.out.println("투자금 : " + money + " / 잔액 : " + this.account);
	}

	public void stockGame(Scanner scan) {
		List<String> stockNames = Arrays.asList("Samsung", "Kakao", "Hyundai", "SamsungBio", "SamsungCnt", "SkHynix",
				"Kia", "LG", "Posco");

		// 종목 ,시작년,월
		// 종목 입력
		int number = 0;
		for (String tmp : stockNames) {
			number++;
			System.out.println(number + ". " + tmp);
		}

		System.out.print("종목 번호를 입력해주세요 > ");
		number = scan.nextInt();
		this.stockName=stockNames.get(number-1);

		// 시작 연도 입력
		System.out.print("시작 연도를 입력해주세요 (ex: 2020) > ");
		this.startYear = scan.next();
		int year = Integer.parseInt(startYear);

		// 시작 월 입력
		System.out.print("시작 월을 입력해주세요 (ex: 03) > ");
		this.startMonth = scan.next();
		int month = Integer.parseInt(startMonth);

		// 입력 확인 출력
		System.out.println("\n[입력 확인]");
		System.out.println("종목: " + this.stockName);
		System.out.println("시작 시점: " + this.startYear + "년 " + this.startMonth + "월");

		// 시작년월 기준 12개월 전꺼 보여주기
		PrintGraph pg = new PrintGraph();
		

		
		// 종목 선택
		if (number == 3) {

			Hyundai hyundai = new Hyundai();
			pg.printGraph(hyundai.getHyundai(), this.startYear, this.startMonth);

		}

		if (number == 1) {

			Samsung s = new Samsung();
			pg.printGraph(s.getSamsung(), this.startYear, this.startMonth);

		}

		if (number == 7) {
			Kia k = new Kia();
			pg.printGraph(k.getKia(), this.startYear, this.startMonth);
		}
		if (number == 8) {
			LG lg = new LG();
			pg.printGraph(lg.getLg(), this.startYear, this.startMonth);
		}

		if (number == 2) {
			Kakao kko = new Kakao();
			pg.printGraph(kko.getKakao(), this.startYear, this.startMonth);
		}

		if (number == 9) {
			Posco posco = new Posco();
			pg.printGraph(posco.getPosco(), this.startYear, this.startMonth);
		}

		if (number == 6) {
			SkHynix skhynix = new SkHynix();
			pg.printGraph(skhynix.getSkHynix(), this.startYear, this.startMonth);
		}

		if (number == 4) {
			SamsungBio samsungbio = new SamsungBio();
			pg.printGraph(samsungbio.getSamsungBio(), this.startYear, this.startMonth);
		}

		if (number == 5) {
			SamsungCnt samsungcnt = new SamsungCnt();
			pg.printGraph(samsungcnt.getSamsungCnt(), this.startYear, this.startMonth);
		}

	
		// 투자를 유지할지, 끝낼지 물어보기
		while (true) {

			System.out.println("\n투자하시겠습니까 (yes / no)");
			String cmd = scan.next();

			if (cmd.equals("yes")) {

				pg.nextMonth();
				month++;
				if (month > 12) {
					month = 1;
					year++;
				}
			} else if (cmd.equals("no")) {

				System.out.println("투자 종료");

				// ⭐ 종료 시점 index 가져오기
				// int endIndex = pg.getCurrentIndex();

				this.finishYear = String.valueOf(year);
				this.finishMonth = String.valueOf(month);

				System.out.println("종료 시점: " + this.finishYear + "년 " + this.finishMonth + "월");

				break;
			} else {
				System.out.println("잘못된 입력");
			}
		}
		scan.close();

	}

	// 투자 비율 반환
	public void stockRate() {
		rateCalculation rc = new rateCalculation();

		rc.calRate(stockName, startYear, startMonth, finishYear, finishMonth);

		this.returnRate = rc.getRate();

	}

	// 수익률 반환
	public void sellcalculation() {
		// TODO Auto-generated method stub

		int addPrice = (int) (this.money * (this.returnRate/100));

		this.money += addPrice;

		this.account+=this.money;

		printBankList();
	}


	// 현재 금액
	public void printBankList() {
		System.out.println("현재 잔액 : " + this.account);
	}

	// getter/setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getFinishYear() {
		return finishYear;
	}

	public void setFinishYear(String finishYear) {
		this.finishYear = finishYear;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getFinishMoth() {
		return finishMonth;
	}

	public void setFinishMoth(String finishMoth) {
		this.finishMonth = finishMoth;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getReturnRate() {
		return returnRate;
	}

	public void setRate(double returnRate) {
		this.returnRate = returnRate;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

}
