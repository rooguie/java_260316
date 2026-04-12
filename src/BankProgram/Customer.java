package BankProgram;

public class Customer {

	private String bankName;
	private String customerName;
	private String account;
	private int totalMoney;

	public Customer() {
	}

	

	public Customer(String bankName, String customerName, String account, int totalMoney) {
		this.bankName = bankName;
		this.customerName = customerName;
		this.account = account;
		this.totalMoney = totalMoney;
	}



	public void infoPrint() {
		System.out.println("이름:" + this.customerName);
		System.out.println("은행 이름:"+this.bankName);
		System.out.println("계좌번호:" + this.account);
		System.out.println("잔액:" + this.totalMoney + "원");
	}
	
	

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {

		this.account = account;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}



	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
