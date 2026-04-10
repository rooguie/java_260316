package BankProgram;

public class Customer {

	private String customerName;
	private String account;
	private int totalMoney;

	public Customer() {
	}

	public void infoPrint() {
		System.out.println("이름:" + this.customerName);
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

}
