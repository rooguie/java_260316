package day07;

public class MultiArray02 {

	public static void main(String[] args) {
		// 2차원 배열 [5][3]
		
		int[][] arr = new int[5][3];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				count++;
				arr[i][j]=count;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
