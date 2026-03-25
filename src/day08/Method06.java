package day08;

public class Method06 {
	// 메서드 배열 활용
	/*
	 * 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드=>int[] 2. 전부 메서드 안에서 해결 3. 정수 배열을
	 * 매개변수로 받아 평균값을 리턴하는 메서드 4. 정수 배열을 매개변수로 받아 출력하는 메서드
	 */

	// 숫자 랜덤생성
	public int[] RandomNumList() {
		int[] RandomNumList = new int[5];

		for (int i = 0; i < RandomNumList.length; i++) {
			RandomNumList[i] = (int) (Math.random() * 101);
		}

		return RandomNumList;

	}

	// 숫자들의 평균
	public double NumAvg(int[] List) {
		int sum = 0;
		for (int i = 0; i < List.length; i++) {
			sum += List[i];
		}
		return (double) sum / List.length;

	}

	// 숫자들의 출력
	public void Print(int[] List) {
		for (int i = 0; i < List.length; i++) {
			System.out.printf("%d ", List[i]);
		}
		System.out.println(); // enter가 포함된 --> print+enter
	}

	public static void main(String[] args) {

		Method06 me06 = new Method06();

		double avg = 0;
		int[] List;

		List = me06.RandomNumList();
		avg = me06.NumAvg(List);

		me06.Print(List);
		System.out.println("평균:" + avg);

	}

}
