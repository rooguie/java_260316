package day17;

import java.util.Arrays;

public class Stream03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 1, 4, 6, 8, 9, 5, 3, 2, 6, 8 };

		// 스트림을 구성해여 중복제거하고, 정렬하여, 짝수만 출력
		Arrays.stream(arr)
		.distinct()
		.filter(n -> n % 2 == 0)
		.forEach(n -> System.out.println(n));

		System.out.println("-------------------------");
		// 스트림으로 구성하여 중복제거하고, 정렬하여, 홀수만 배열로 리턴
		int arr2[]=
		Arrays.stream(arr)
		.distinct()
		.filter(n -> n % 2 != 0)
		.toArray();
		System.out.println(Arrays.toString(arr2));
	}

}
