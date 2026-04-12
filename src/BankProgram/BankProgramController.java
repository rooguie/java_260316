package BankProgram;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankProgramController {

	private Customer customer = new Customer();
	private File file;
	private List<Customer> customerList = new ArrayList<>();

	public BankProgramController() {
	}

	public BankProgramController(Customer customer, List<Customer> customerList) {
		this.customer = customer;
		this.customerList = customerList;
	}

	// 더미 데이터
	public void addCustomer() {

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

	// 본인 계좌 확인
	public Customer checkMyAccount(Scanner scan) {
		String myAccount = scan.next();

		for (Customer tmp : customerList) {
			if (tmp.getAccount().equals(myAccount)) {
				tmp.infoPrint();
				file = new File(tmp.getBankName() + "_" + tmp.getCustomerName() + ".txt");
				return tmp;
			}

		}
		System.out.println("일치하는 정보 없음");
		return null;

	}

	// 파일 저장 클래스
	public void fileSave(String message) {
		try (FileWriter fw = new FileWriter(file, true)) {
			fw.write(message);
		} catch (Exception e) {
			System.out.println("내역 저장 실패");
		}
	}

	public void depositMoney(Scanner scan, Customer customer) {
		

		
		System.out.println("입금 금액을 입력해주세요");
		int money = scan.nextInt();

		System.out.println("입금 전 금액:" + customer.getTotalMoney() + "원");

		customer.setTotalMoney(customer.getTotalMoney() + money);

		System.out.println("입금 후 금액:" + customer.getTotalMoney() + "원");

		fileSave("입금:" + money + "원" + " 현재 금액:" + customer.getTotalMoney() + "원" + "\n");
		

	}

	public void withdrawMoney(Scanner scan, Customer customer) {
		System.out.println("출금 금액을 입력해주세요");
		int money = scan.nextInt();

		if (money > customer.getTotalMoney()) {
			System.out.println("잔액 부족");
			return;
		}

		System.out.println("출금 전 금액:" + customer.getTotalMoney() + "원");

		customer.setTotalMoney(customer.getTotalMoney() - money);

		System.out.println("출금 후 금액:" + customer.getTotalMoney() + "원");

		fileSave("출금:" + money + "원" + " 현재 금액:" + customer.getTotalMoney() + "원" + "\n");
	}

	public void transferMoney(Scanner scan, Customer customer) {

		System.out.println("송금할 금액을 입력해주세요");

		int money = scan.nextInt();

		if (money > customer.getTotalMoney()) {
			System.out.println("잔액 부족");
			return;
		}

		System.out.println("받을 사람 계좌 입력");
		String receiveAccount = scan.next();

		int check = 0;
		for (Customer tmp : customerList) {
			if (tmp.getAccount().equals(receiveAccount)) {
				System.out.println("받는 사람:" + tmp.getCustomerName());
				System.out.println("보내는 금액:" + money + "원");
				tmp.setTotalMoney(tmp.getTotalMoney() + money);
				System.out.println("송금 후 금액:" + customer.getTotalMoney());
				System.out.println("송금 성공");
				fileSave("받은사람:" + tmp.getCustomerName() + " ");
				check++;
			}

		}

		if (check != 1) {
			System.out.println("송금 실패");
			System.out.println("일치하는 정보 없음");
			return;
		}

		customer.setTotalMoney(customer.getTotalMoney() - money);

		fileSave("송금:" + money + "원" + " 현재 금액:" + customer.getTotalMoney() + "원" + "\n");

	}

	public void checkAccount(Scanner scan, Customer customer) {
		// 계좌 확인
		customer.infoPrint();

	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
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
