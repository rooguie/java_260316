package day09;

public class Class03 {

	public static void main(String[] args) {

		// Car c1=new Car(); //기본 생성자로 생성

		Car c = new Car("소나타", 2026); // 매개변수 생성

		c.power(); // 시동 키기

		c.carState(); // 킨 상태

		c.speedUp(); // 20업

		c.speedUp(); // 20업

		c.carState(); // 킨 상태

		c.speedDown(); // 20다운

		c.carState();

		c.power();// 기동 끄기

		c.carState(); // 끈 상태

	}

}

class Car {
	// 속도, 시동, 이름, 연식

	// 멤버 변수
	private String name;
	private int year; // 연산이 필요한 변수가 아니면 문자열로 받아도 상관은 없음
	private int speed; // 속도
	private boolean power; // 시동

	// 생성자 - 보통 멤버변수 아래
	/*
	 * 객체를 생성할 때(new) 초기값을 지정해주는 역할 기본생성자: 컴파일러가 컴파일 시 자동으로 제공 >object=null / 숫자=0 /
	 * boolean=false -기본 생성자를 직접 만들 수도 있음 -다른 생성자가 존재하면 자동으로 주지않음 -생성자는 여러개 생성
	 * 가능(생성자 오버로딩) -생성자 오버로딩 조건: 매개변수의 개수가 다르거나, 타입이 달라야 가능 -생성자를 만들 때 꼭 기본 생성자와 같이
	 * 생성함. puclic 클래스명(매개변수){ --> 리턴값 유무로 생성자 구분 멤버면수 값을 설정 } -생성자는 리턴 타입이 없는 메서드와
	 * 같은 형태 -이름은 반드시 클래스명을 따른다.
	 * 
	 */
	// 기본 생성자
	public Car() {
	}

	// 매개변수가 있는 생성자
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}

	// 메서드
	// 1. 시동을 켜고 끄는 메서드
	// 꺼짐=>켜짐,켜짐=>꺼짐
	public void power() {
		if (this.speed == 0) {
			power = !isPower();
		} else {
			System.out.println("시동을 끌 수 없음");
		}
	}

	// 2.출력 메서드
	// (OFF / ON) / Speed
	public void carState() {
		if (this.power) {
			System.out.println("시동 켜짐");
			System.out.printf("현재 속도:%d\n", getSpeed());
		} else {
			System.out.println("시동 꺼짐");
			this.speed = 0;
		}
	}

	// 3. speedUp 20씩 증가 엑셀
	public void speedUp() {
		if (this.power) {
			if (this.speed == 200) {
				System.out.println("최대 속도");
			}
			this.speed += 20;
		} else {
			System.out.println("시동 꺼져 있음");
		}

	}

	// 4. speedDown 20씩 다운 브레이크

	public void speedDown() {
		if (this.power) {
			if (this.speed == 0) {
				System.out.println("차가 멈춰 있음");
			}
			this.speed -= 20;
		} else {
			System.out.println("시동 꺼져 있음");
		}

	}

	// getter/setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) { // 사실상 필요없지만 테스트용으로 나둠
		this.speed = speed;
	}

	public boolean isPower() {
		return this.power;
	}

}