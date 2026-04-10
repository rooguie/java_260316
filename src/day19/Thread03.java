package day19;

public class Thread03 {

	public static void main(String[] args) {
		// 1~50까지, 51~100의 합계를 구하는 2개의 thread생성
		// 2개의 스레드가 실행되고 난 뒤 출력
		// Thread-0 1~50까지 출력 후 합계 출력 => 1초 휴식
		// Thread-1 51~100까지 출력 후 합계 출력 => 1초 후식
		// main thread-0 + thread-1 더해서 출력

		// Tread.sleep():일정시간 대기
		// join(): 다른 스레드 보다 먼저 출력
		
		System.out.println(">main start=>"+System.currentTimeMillis());
		
		JoinTest jt1=new JoinTest(1,50);
		
		JoinTest jt2=new JoinTest(51,100);
		
		jt1.start();
		
		jt2.start();
		
		try {
			jt2.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println(">main end=>"+System.currentTimeMillis());

		
	}

}
class JoinTest extends Thread{
	private int start;
	private int end;
	private int total;
	
	
	public JoinTest(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	

	
	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
			System.out.println(i+"=> thread");
			this.total+=1;
		}
		
	}




	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
}




