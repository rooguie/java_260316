package BankProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankProgramController {
	
	private Banks bank=new Banks();
	private Customer customer=new Customer();
	private Map<String, String> customerList=new HashMap<String, String>();
	
	
	public BankProgramController() {}

	public BankProgramController(Banks bank, Customer customer, Map<String, String> customerList) {
		this.bank = bank;
		this.customer = customer;
		this.customerList = customerList;
	}
	
	

	public void createAccount(Scanner scan) {
		System.out.println("이름을 입력해주세여:");
		customer.setCustomerName(scan.next());
		scan.nextLine();
		
		System.out.println("계좌를 생성할 은행을 골라주세요");
		
		int number=1;
		for(Bank tmp:Bank.values()) {
			System.out.println(number+"."+tmp);
			number++;
		}
		
		int choice=scan.nextInt();
		
		bank.setBank(Bank.values()[choice-1]);
		
		if(!bank.getAccountNumber().isEmpty()) {
			String assignedNumber=bank.getAccountNumber().remove(0);
			
			customer.setAccount(Bank.values()[choice-1].getBankNumber()+assignedNumber);
			
			customerList.put(customer.getCustomerName(), customer.getAccount());
			
			System.out.println("계좌등록 성공");
		}
		
		else {
			System.out.println("계좌 등록 실패...");
			System.out.println("남은 계좌 없음");
		}
		
		for(String key:customerList.keySet()) {
			System.out.println(key+":"+"("+Bank.values()[choice-1]+")"+customerList.get(key));
		}
		
		
	}
	

	public void depositMoney(Scanner scan) {
		System.out.println("입금 금액을 입력해주세요");
		int money=scan.nextInt();
		
		System.out.println("입금 전 금액:"+customer.getTotalMoney()+"원");
		
		customer.setTotalMoney(customer.getTotalMoney()+money);
		
		System.out.println("입금 후 금액:"+customer.getTotalMoney()+"원");
		
	}

	public void withdrawMoney(Scanner scan) {
		System.out.println("출금 금액을 입력해주세요");
		int money=scan.nextInt();
		
		if(money>customer.getTotalMoney()) {
			System.out.println("잔액 부족");
			return;
		}
		
		System.out.println("출금 전 금액:"+customer.getTotalMoney()+"원");
		
		customer.setTotalMoney(customer.getTotalMoney()-money);
		
		System.out.println("출금 후 금액:"+customer.getTotalMoney()+"원");
		
	}
	

	public void transferMoney(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	public void checkAccount(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	



	public Banks getBank() {
		return bank;
	}


	public void setBank(Banks bank) {
		this.bank = bank;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Map<String, String> getCustomerList() {
		return customerList;
	}


	public void setCustomerList(Map<String, String> customerList) {
		this.customerList = customerList;
	}


}
