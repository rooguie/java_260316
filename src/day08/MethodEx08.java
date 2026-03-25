package day08;

public class MethodEx08 {
	/*
	 * 1. 배열을 매개변수로 받아 출력하는 메서드 2. 배열을 매개변수로 받아 오름차순으로 정렬하는 메서드 3. 배열을 매개변수로 받아 합계,
	 * 평균, 최대, 최솟값을 출력하는 메서드
	 */

	// 출력 메서드
	public void print(int array[]) {
		for (int i : array) {
			System.out.println(i);
		}
	}

	// 정렬 메서드
	public void order(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}

	}

	// 합계,평균,최대 최소
	public void result(int array[]) {
		int sum = 0;
		double avg = 0;
		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.printf("합계:%d\n", sum);

		avg = (double) sum / array.length;

		System.out.printf("평균:%.2f\n", avg);
		
		//정렬 후 사용 버전
//		max = array[array.length - 1];
//		min = array[0];
//
//		System.out.printf("최대:%d, 최소:%d", max, min);
		
		//정렬 안해도 사용 가능
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) { //= Math.max(max,array[[i])
				max=array[i];
			}
			if(array[i]<min) {//= Math.min(min,array[[i])
				min=array[i];
			}
		}
		System.out.printf("최대:%d, 최소:%d", max, min);

	}

	public static void main(String[] args) {

		int[] arr = { 78, 45, 23, 56, 23, 1, 46, 9, 67, 39, 55, 66, 33 };

		MethodEx08 me08 = new MethodEx08();

		me08.order(arr);

		me08.print(arr);
		System.out.println("---------------");
		me08.result(arr);
	}

}
