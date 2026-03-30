package day09;

public class ClassEx01 {

	public static void main(String[] args) {

		// 채널은 1번부터 시작
		TV tv = new TV("LG");

		tv.power(); // 킴

		tv.channelUp(); // 2
		tv.favorCh();
		tv.channelUp();// 3
		tv.favorCh();
		tv.channelUp();// 4
		tv.favorCh();
		tv.channelUp();// 5
		tv.channelUp();// 6
		tv.favorCh();
		tv.channelUp();// 7
		tv.favorCh();
		tv.channelUp();// 8
		tv.favorCh();
		tv.channelUp();// 9
		tv.favorCh();

		tv.volumeUp();
		tv.volumeUp();

		if (tv.isPower()) {
			System.out.println("---TV---");
			System.out.println(tv.getBrand());
			System.out.println("음량:" + tv.getVol());
			System.out.println("채널:" + tv.getCh());
			System.out.println("---TV---");
		}
		tv.listUp();

		tv.power(); // 끔

		tv.favorCh();

		/*
		 * 선호 채널 등록 채널을 돌리다 버튼을 누르면 선호채널에 추가 5개까지 등록가능 1. 선호채널 등록메서드 -현재 채널을 선호채널 배열에 넣기
		 * 2. 등록된 선호 채널 리스트 보기 -등록된 선호채널만을 리스트로 출력 3. 등록 버튼 누른 순서 대로 배열에 넣기 꽉 차면 1번
		 * 선호채널만 없애고 뉴 선호채널 다시 채우기
		 */

	}

}

class TV {
	// 멤버변수
	// 브랜드,파워,채널,볼륨
	// 파워가 켜져 있어야 채널과 볼륨 변경 가능
	// 채널--> 순환구조 1~10
	// 볼륨--> 0~20
	private String brand;
	private boolean power;
	private int ch = 1;
	private int vol;
	private int favorChCnt; // 선호채널 개수, 배열의 번지 역할

	private int[] favor = new int[5]; // 선호채널 배열

	// 생성자
	// 기본 생성자
	public TV() {
	}

	// 매개변수 생성자는 브랜드만 받기
	public TV(String brand) {
		this.brand = brand;
	}

	// 메서드
	// 파워
	public void power() {
		power = !this.power;

		if (power) {
			System.out.println("테레비 켜짐");
		} else {
			System.out.println("테레비 꺼짐");
		}
	}

	// 볼륨업
	public void volumeUp() {
		if (power) {
			if (vol == 20) {
				System.out.println("볼륨 최대임");
				return;
			} else if (vol >= 0) {
				vol += 1;
			}
		}
	}

	// 볼륨다움
	public void volumeDown() {
		if (power) {
			if (vol == 0) {
				System.out.println("음소거 상태임");
				return;
			} else if (vol > 0) {
				vol -= 1;
			}
		}
	}

	// 채널업

	public void channelUp() {
		if (power) {
			ch += 1;
			if (ch > 10) {
				ch = 1;
			}
		}
	}

	// 채널다운
	public void channelDown() {
		if (power) {
			ch -= 1;
			if (ch < 1) {
				ch = 10;
			}
		}
	}

	// 선호채널 등록
	public void favorCh() {
		// 현재 채널을 favor 배열에 넣기
		// 다 차면 1번부터 다시 채우기
		if (isPower() == false) {
			return;
		}
		if (this.favorChCnt < 5) {
			favor[this.favorChCnt] = this.ch;
			this.favorChCnt++;
		} else if (this.favorChCnt == 5) {
			favorChCnt = 0;
			favor[favorChCnt] = this.ch;
			this.favorChCnt++;
		}

	}

	// 선호 채널 등록 리스트 뽑기
	public void listUp() {
		if (isPower() == false) {
			return;
		}
		System.out.println("---선호채널 목록---");
		for (int i = 0; i < this.favor.length; i++) {
			System.out.println(i + 1 + "." + favor[i] + "번");
		}
	}

	// getter/setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;

	}

	public boolean isPower() {
		return power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;

	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getFavorChCnt() {
		return favorChCnt;
	}

	public void setFavorChCnt(int favorChCnt) {
		this.favorChCnt = favorChCnt;
	}
}