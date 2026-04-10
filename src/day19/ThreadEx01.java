package day19;

class Bank1{
	private int money=10000;
	
	//입금
	public synchronized void saveMoney(int money) {
		this.money+=money;
		System.out.println(Thread.currentThread().getName()+
		"입금: "+money+" /잔액:"+this.money);
		
		//대기 중인 스레드 깨우기
		notifyAll();
	}
	
	
	//출금
	public synchronized void minusMoney(int money) {
		//잔액이 부족하면 기다림
		//while인 이유=> 깨어났을 때 조건을 다시 확인 필요
		//thread가 여러개가 경쟁 상활일 때 대비
		while(this.money<money) {
			System.out.println(Thread.currentThread().getName()+
					"출금대기(잔액부족)/현재 잔액:"+this.money);
			
			try {
				wait(); //여기서 대기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.money-=money;
		System.out.println(Thread.currentThread().getName()+
				"출금: "+money+" /잔액:"+this.money);
	}


	public int getMoney() {
		return money;
	}
	
}

public class ThreadEx01 {

	public static void main(String[] args) {
		// 은행 클래스에서 출금 시 잔액이 부족하면 실패=> 대기(wait)
		// 입금이 발생하면 다시 깨어남(notify) => thread 깨움(notify)
		
		/*
		 * wait()
		 * -스레드를 대기 상태로 보냄
		 * -반드시 sychronized 내부에서만 사용가능
		 * -lock을 반납하고 기다림
		 * 
		 * notify()
		 * -wait 중의 스레드 하나를 깨움
		 * 
		 * notify()
		 * -wait 중인 스레드를 모두 깨움=> 주로 사용
		 */
		Bank1 bank=new Bank1();
		
		DepositThread hong =new DepositThread("hong",bank);
		
		WithdrawThread wife=new WithdrawThread("hongwife", bank);
		
		hong.start();
		
		wife.start();

	}

}


//입금 thread
class DepositThread extends Thread{
	private Bank1 bank;
	
	public DepositThread(String name, Bank1 bank) {
		super(name); //threadName으로 설정
		this.bank=bank;
	}

	@Override
	public void run() {
		//입금을 5번 반복
		for(int i=0;i<5;i++) {
			bank.saveMoney(10000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}

//출금
class WithdrawThread extends Thread{
private Bank1 bank;
	
	public WithdrawThread(String name, Bank1 bank) {
		super(name); //threadName으로 설정
		this.bank=bank;
	}

	@Override
	public void run() {
		//출금을 5번 반복
		for(int i=0;i<5;i++) {
			bank.minusMoney(20000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}






















