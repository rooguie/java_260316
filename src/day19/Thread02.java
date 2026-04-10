package day19;

public class Thread02 {

	public static void main(String[] args) {
		// Runnable로 구현하는 방법
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("메인 스레드 시작");
		
		//interface로 구현한 스레드 객체는 Tread의 객체가 없어서 실행이 안됨
		//Tread 객체를 생성해서 넣어줘야함
		
		Mythread2 th2=new Mythread2();
		Thread t =new Thread(th2);
		t.start();
		
		//join(): 스레드가 실행을 마칠 때까지 다른 스레드를 대기상태로 만듦
		
		try {
			t.join();
			Thread.sleep(1000); //단위는 밀리세컨드 ms 1000=>1초
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread t2=new Thread(new Mythread2());
		t2.start();
		
		try {
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("메인 스레드 끝");
	}

}

class Mythread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<2000;i++) {
			System.out.println(i+".tread>"+Thread.currentThread().getName());
		}
		
	}
	
}
