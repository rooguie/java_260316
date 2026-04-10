package BankProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Bank {

	// 고유 식별번호로 계좌 구분
	우리은행("001-"), 신한은행("002-"), 국민은행("003-");

	
	private final String bankNumber;

	private Bank(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	
	public String getBankNumber() {
		return bankNumber;
	}

}

class Banks {

	private Bank bank;
	private List<String> accountNumber = new ArrayList<String>(Arrays.asList("001", "002", "003"));

	public Banks() {}

	// 각 은행은 3개의 계좌번호를 가지고 고객이 계좌를 받으면 사라진다. 즉 총 3개만 생성 가능
	

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public List<String> getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(List<String> accountNumber) {
		this.accountNumber = accountNumber;
	}

}
