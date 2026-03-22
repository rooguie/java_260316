package day02;

public class Switch01 {

	public static void main(String[] args) {
		// switch
		/*
		 * switch(변수 / 식){
		 * 	case 값1: 실행문; break;
		 * 	case 값2: 실행문; break;
		 * 	case 값3: 실행문; break;
		 * ....
		 * default: 실행문;
		 * }
		 * 
		 * break; -->구문을 강제로 빠져나갈때 사용(조건문을 동반)
		 */
		
		int number=7;
		//switch 이용하여 짝수 / 홀수 구분
		//number%2
		
		switch (number%2){
		case 0:
			System.out.println("짝수");
			break;
		
		case 1:
			System.out.println("홀수");
			break;
			
			default:
				System.out.println("잘못된 값입니다.");
				
		}
		
		//num 값은 1,2,3이라고 가정, 1이면 한칸, 2면 두칸, 3이면 세칸 다른 값은 다시 입력
		
		int num=3;
		
		switch(num) {
		case 1: System.out.println("1칸 전진"); break;
		case 2: System.out.println("2칸 전진"); break;
		case 3: System.out.println("3칸 전진"); break;
		default: System.out.println("다시 입력");
		}
		
	//--------------------------
		switch(num) {
		case 1: System.out.println(num+"칸 전진"); break;
		case 2: System.out.println(num+"칸 전진"); break;
		case 3: System.out.println(num+"칸 전진"); break;
		default: System.out.println("다시 입력");
		}
		
		//----------------------------------------
		switch(num) {
		case 1 : case 2 : case 3:
			System.out.println(num+"칸 전진");
			break;
		default: System.out.println("다시 입력");
		}

		
		int month=3;
		
		switch(month) {
		//=case 1: case 2: case 3 : 
		//	System.out.println("봄"); 
		//  break;
		case 1: System.out.println("봄"); break;
		case 2: System.out.println("봄"); break;
		case 3: System.out.println("봄"); break;

		case 4: System.out.println("여룸"); break;
		case 5: System.out.println("여름"); break;
		case 6: System.out.println("여름"); break;
		
		case 7: System.out.println("가을"); break;
		case 8: System.out.println("가을"); break;
		case 9: System.out.println("가을"); break;
		
		case 10: System.out.println("겨울"); break;
		case 11: System.out.println("겨울"); break;
		case 12: System.out.println("겨울"); break;
		
		default: System.out.println("다시 입력");
		}
		
	}

}
