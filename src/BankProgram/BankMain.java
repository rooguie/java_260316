package BankProgram;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		BankProgramController bpc=new BankProgramController();
		Scanner scan =new Scanner(System.in);
		
		
		
		System.out.println("---은행 프로그램---");
		
	
		bpc.checkMyAccount(scan);
		
		
		while(true) {
			
			System.out.println("원하는 메뉴 선택");
			System.out.println("1.입금 2.출금 3.송금 4.계좌확인 5.종료");
			
			int choice=scan.nextInt();
			
			if(choice==1) {
				bpc.depositMoney(scan);
			}
			
			else if(choice==2) {
				bpc.withdrawMoney(scan);
			}
			
			else if(choice==3) {
				bpc.transferMoney(scan);
			}
			
			else if(choice==4) {
				bpc.checkAccount(scan);
			}
			
			else if(choice==5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			else {
				System.out.println("잘못된 번호 입력.");
				System.out.println("다시 입력해주세요");
			}
			
			
			
		}

	}

}
