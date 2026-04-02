package day14;

public class Exception04 {

	public static void main(String[] args) {
		// 멀티캐치 구문 / 다중캐치 구문
		/*
		 * try{
		 * 
		 * }catch(예외클래스명 객체){
		 *
		 * 
		 *  }catch(예외클래스명 객체){
		 *  
		 *   }catch(예외클래스명 객체){
		 *   
		 *   }
		 *   
		 *   예외를 세분화 해서 뭐가 안됐는지 캐치
		 *   Exception => 모든 예외의 최고 조상 => 어떤 예외가 와도 다 캐치
		 */

		try {
			int arr[] = new int[3];
			System.out.println(arr[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위가 넘어감");
			}
		catch (NullPointerException e) {
			System.out.println("객체가 null");
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눴습니다.");
		}
		catch (Exception e) {
			System.out.println("예외 발생");
		}
		
		
	}

}
