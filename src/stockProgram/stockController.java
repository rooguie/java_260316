package stockProgram;

import java.util.Scanner;

public class stockController {
	private int money;
	private String startYear;
	private String finishYear;
	private String startMonth;
	private String finishMoth;
	private String stockName;
    private double returnRate;

    public stockController() {}

    

    public stockController(int money, String startYear, String finishYear, String startMonth, String finishMoth,
			String stockName, double returnRate) {
		this.money = money;
		this.startYear = startYear;
		this.finishYear = finishYear;
		this.startMonth = startMonth;
		this.finishMoth = finishMoth;
		this.stockName = stockName;
		this.returnRate = returnRate;
	}







	//투자 금액 입금
    public void deposit(Scanner scan) {
        // TODO Auto-generated method stub
        System.out.println("투자 할 금액을 입력해주세요 >");
        int money2 = scan.nextInt();

        this.money += money2;
        System.out.println("투자금 : "+money2+" / 잔액 : "+this.money);
    }

    
    
    
    
    
    
    //투자 게임 시작
    public void stockGame() {
        
    	//종목, 시작년, 월
    	
    	//시작년월 기준 12개월 전꺼 보여주기
    	
    	//투자를 유지할지, 끝낼지 물어보기
    	
    	//끝낸다면 끝낸 년월 반환
    	
    	//유지한다면 변화률 보여주기
    	

    }
    

    
    //투자 비율 반환
    public void stockRate() {
    	rateCalculation rc=new rateCalculation();
    	
    	rc.calRate(stockName, startYear, startMonth, finishYear, finishMoth);
    	
    	this.returnRate=rc.getRate();
    	
    }
    
    
    
    
    
    //수익률 반환
    public void sellcalculation() {
        // TODO Auto-generated method stub
        int addPrice = (int)(this.money * (this.returnRate/100));

        this.money += addPrice;

        printBankList();
    }

    
    //현재 금액 
    public void printBankList() {
        System.out.println("현재 잔액 : "+ this.money);
    }





    //getter/setter
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
		return finishMoth;
	}







	public void setFinishMoth(String finishMoth) {
		this.finishMoth = finishMoth;
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
    
    
    
    
}
