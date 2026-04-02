package day14;

public class CustomException01 {

	public static void main(String[] args) {
		// PasswordException Test
		PasswordTest pt=new PasswordTest();
		
		String password1=null;
		String password2="abc";
		String password3="abcde1";
		String password4="abcde123";
		
		try {
			pt.setPassword(password1);
			System.out.println(pt.getPassword());
			catch (Exception e) {
				// TODO: handle exception
				System.out.println();
				e.printStackTrace();
			}
		}
		System.out.println("test 종료");
				

	}

}

class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		//exception 처리
		/*
		 * 비밀번호는 null일 수 없다.
		 * 길이는 5자 이상
		 * 비밀번호는 영문자나 숫자, 특수문자를 포함해야한다.
		 * 정규표현식: regex[a-zA-Z][0-9][!@#$%^&*()][가-희]
		 */
		
		if(password==null) {
			throw new PasswordException("비밀번호를 입력하세요");
			}
		if(password.length()<5) {
			throw new PasswordException("비밀번호 길이가 5자 미만입니다");
		}
		if(password.matches("조건")) {
			throw new PasswordException("비밀번호 조건에 맞지 않습니다.");
		}
		
		this.password = password;
	}
	
	
}
