package BankProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BankProgramController {

	private Customer customer = new Customer();
	private List<Customer> customerList = new ArrayList<>();

	public BankProgramController() {
	}

	public BankProgramController(Customer customer, List<Customer> customerList) {
		this.customer = customer;
		this.customerList = customerList;
	}

	// 더미 데이터
	public void addCustomer() {

		List<Customer> customerList = new ArrayList<>();

		// 우리은행 고객 3명
		customerList.add(new Customer("우리은행", "김철수", "1002-123-456789", 500000));
		customerList.add(new Customer("우리은행", "이영희", "1002-987-654321", 1250000));
		customerList.add(new Customer("우리은행", "박지성", "1002-111-222333", 30000));

		// 국민은행 고객 3명
		customerList.add(new Customer("국민은행", "정민수", "432101-01-554433", 2100000));
		customerList.add(new Customer("국민은행", "최유진", "943202-04-112233", 75000));
		customerList.add(new Customer("국민은행", "한결", "210405-01-998877", 430000));

		// 신한은행 고객 3명
		customerList.add(new Customer("신한은행", "윤서준", "110-443-221100", 890000));
		customerList.add(new Customer("신한은행", "조예지", "110-554-332211", 1500000));
		customerList.add(new Customer("신한은행", "임현우", "110-665-443322", 2500));

	}

	//본인 계좌 확인
	public Customer checkMyAccount(Scanner scan){
		String myAccount=scan.next();

		for(Customer tmp:customerList){
			if(tmp.getAccount().equals(myAccount)){
				return tmp;
			}
		}

	}







	public void depositMoney(Scanner scan) {
		System.out.println("입금 금액을 입력해주세요");
		int money = scan.nextInt();

		System.out.println("입금 전 금액:" + customer.getTotalMoney() + "원");

		customer.setTotalMoney(customer.getTotalMoney() + money);

		System.out.println("입금 후 금액:" + customer.getTotalMoney() + "원");

	}

	public void withdrawMoney(Scanner scan) {
		System.out.println("출금 금액을 입력해주세요");
		int money = scan.nextInt();

		if (money > customer.getTotalMoney()) {
			System.out.println("잔액 부족");
			return;
		}

		System.out.println("출금 전 금액:" + customer.getTotalMoney() + "원");

		customer.setTotalMoney(customer.getTotalMoney() - money);

		System.out.println("출금 후 금액:" + customer.getTotalMoney() + "원");

	}

	public void transferMoney(Scanner scan) {
		// TODO Auto-generated method stub

	}

	public void checkAccount(Scanner scan) {
		// TODO Auto-generated method stub

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

}
