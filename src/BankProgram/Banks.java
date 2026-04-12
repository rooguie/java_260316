package BankProgram;

import java.util.ArrayList;

import java.util.List;


class Banks {

	private String bank;
	private List<String> accountNumber = new ArrayList<String>();

	public Banks() {}


	public Banks(String bank, List<String> accoutnNumber){
		this.bank=bank;
		this.accountNumber=accoutnNumber;
	}

	
	

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public List<String> getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(List<String> accountNumber) {
		this.accountNumber = accountNumber;
	}

}
