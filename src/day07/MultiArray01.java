package day07;

public class MultiArray01 {

	public static void main(String[] args) {
		// 다차원 배열
		/*
		 * 배열타입[] 배열명 -1차원 {1,2,3}
		 * 배열타입[행][열] 배열명-2차원 {{1,2,3},{1,2,3}}
		 * 배열타입[면][헹][열] 배열명-3차원 {{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}}}
		 * 
		 * int[][] arr=new int[2][3]; //2행 3열
		 * 1 2 3
		 * 1 2 3
		 * 
		 * 배열의 길이
		 * 1차원 = arr.length => for 1개
		 * 2차원 = arr[i].length => for 2개
		 * 3차원 = arr[i][j].length => for 3개
		 */
		
		int[][] arr= {
				{1,2,3},
				{1,2,3}
		};
		
		System.out.println(arr[0][2]);

		System.out.println("--------------");
		
		int count=10;
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[1].length; j++) {
				//System.out.println(arr[i][j]);
				arr[i][j]=count;
				count++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
