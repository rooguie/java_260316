package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 그림파일만 출력 ->jpg,png


		String[] fileName = { "이것이자바다.java", "java의정석.java", "array.txt", "array.java", "String.txt",
				"StringMethod.jpg", "ArrayMethod.png", "method.jpg", "javaMethod.png" };
		
//		System.out.println(fileName[0].substring(fileName[0].lastIndexOf(".")));
//		
//		
////		for(int i=0;i<fileName.length;i++) {
////			if("jpg".equals(fileName[i].substring(fileName[i].lastIndexOf("."),0 )) ||
////			   "png".equals(fileName[i].substring(fileName[i].lastIndexOf("."),0 )))
////			{
////				System.out.println(fileName[i]);
////			}
/// 
/// }
		
		boolean check=false;
		
		//파일 확장자만 추출
		for(int i=0;i<fileName.length;i++) {
			String suffix=fileName[i].substring(fileName[i].lastIndexOf(".")+1);
			//System.out.println(suffix);
			if(suffix.toLowerCase().equals("jpg") || 
					suffix.toLowerCase().equals("png")	) {
				System.out.println(fileName[i]);
				check=true;
			}
		}
		
		if(! check) {
			System.out.println("그림파일이 없습니다.");
		}
		
		
	}

}
