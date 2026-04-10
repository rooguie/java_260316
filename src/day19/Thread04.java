package day19;

public class Thread04 {
	public static Bank myBank=new Bank();

	public static void main(String[] args) {
		// critical section(임계영역:공유영역)
		/*
		 * 두 개 이상의 Thread가 동시에 접근할 수 있는 구역
		 * 동시 여러개의 Thread가 공유 영역의 값을 가지려고 하면 충돌이 발생할 수 있음
		 * 교착상태(deadlock)
		 * 한 시점에 하나의 thread만 사용 가능: 세마포어(semaphore)
		 * 세마포어를 얻은 스레드만 접근 가능=> 나머지는 대기 상태가 됨
		 * 
		 * 동기화(순서화): synchronized
		 * 동기화가 필요한 메서드 앞에 키워드로 선언
		 */
		
		/*
		 * 홍길동 => 입금 / 홍길동 부인 => 출금
		 * 동시에 한다는 가정 하에 입금이 우선순위를 가져가야함
		 * Bank 클래스 생성
		 * 계좌 1개 생성: 급여 통장=> 공유 영역
		 * 홍길동(Hong) / 부인(HongWife)
		 * 잔액: 50만원
		 * 
		 * 입금:saveMoney(동기화)
		 * 출금: minus(동기화)
		 */
		
		System.out.println("---시작---");
		System.out.println("현재 잔액:"+Thread04.myBank.getMoney());
		
		Hong hong = new Hong();
		hong.start();
		
		HongWife hongwife=new HongWife();
		hongwife.start();

	}

}

class Hong extends Thread{

	@Override
	public void run() {
		// 입금
		System.out.println("홍길동님> 100,000원 입금");
		Thread04.myBank.saveMoney(10000);
		System.out.println("잔액>"+Thread04.myBank.getMoney());
		
	}
	
	
	
}



class HongWife extends Thread{

	@Override
	public void run() {
		// 출금
		System.out.println("홍길동 부인님> 50,000원 출금");
		Thread04.myBank.minusMoney(10000);
		System.out.println("잔액>"+Thread04.myBank.getMoney());
	}
	
	
	
}


class Bank{
	private int money=500000;
	
	
	//입금(동기화)
	public synchronized void saveMoney(int money) {
		int m=this.money;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.money+=money;
	}
	
	//출금(동기화)
	public synchronized void minusMoney(int money) {
		int m=this.money;
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.money-=money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}

















