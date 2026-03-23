package day06;

public class Array05 {

	public static void main(String[] args) {
		/*
		 * 10개의 숫자를 가지는 배열 생성
		 * 1~50까지 랜덤수를 배열에 저장-->출력
		 * 최대,최소,합계,평균 출력
		 */
		
		//변수선언
		int[] numList=new int[10];
		int min=0,max=0,sum=0;
		float avg=0;
		
		//배열 생성
		for(int i=0;i<numList.length;i++) {
			numList[i]=(int)(Math.random()*50)+1;
		}
		
		System.out.println("----------------");
		
		//저장 확인
		for(int tmp:numList) {
			System.out.println(tmp);
		}
		
		System.out.println("-----------------");
		
		//최댓값 출력
		max=numList[0];
		for(int i=0;i<numList.length;i++) {
			if(numList[i]>=max) {
				max=numList[i];
			}
	
			
		}
		
		
		

		System.out.println("최댓값:"+max);
		
		
		System.out.println("-----------");
		//최솟값출력
		min=numList[0];
		for(int i=0;i<numList.length;i++) {
			if(numList[i]<=min) {
				min=numList[i];
			}
			
		}
		System.out.println("최솟값"+min);
		
		
		System.out.println("------------");
		//합계,평균 출력
		for(int i=0;i<numList.length;i++) {
			sum+=numList[i];
		}
		
		avg=(float)sum/numList.length;
		
		System.out.println("합계:"+sum+","+"평균"+avg);
		
		
	}

}
