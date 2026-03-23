package day06;

public class StringEx02 {

	public static void main(String[] args) {
		// fileName.suffix
		/*
		 * 파일명/ 확장자를 분리하여 출력
		 * 확장자가 java면 자바 파일 입니다. 혹은 기타파일입니다.
		 * 
		 */

		String file="자바의 정석.java";
		
//		// . 기준으로 배열 나누고 1번째 서픽스 읽기
//		String[] fileArr = file.split("\\."); //이스케이프 문자 "\\", 정규표현식(.)을 피하기 위해 사용 
//		
//		
//		if("java".equals(fileArr[1])) { //문자열은 비교 연산자로 비교 불가
//			System.out.println("자바 파일입니다.");
//			
//		}else {
//			System.out.println("기타 파일입니다.");
//		}
		
		
		String fileName=file.substring(0, file.indexOf("."));
		System.out.println(fileName);
		
		String suffix = file.substring(file.indexOf(".")+1);
		
		if("java".equals(suffix)) { 
			System.out.println("자바 파일입니다.");
			
		}else {
			System.out.println("기타 파일입니다.");
		}
		
	}

}
