package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	// 학생정보를 관리학 위한 클래스 생성
	// 학생의 기본정보: 이름,전화번호,주소,생년월일
	// 학원정보: 학원명="koreaIt",지점
	// 수강정보: 수강과목, 기간
	// =>수강과목은 여러과목을 들을 수 있음.[5]/기간[5] 같은 번지는 같은 아이

	// ex) 홍길동,010-1234-5678,서울,010101,
	// koreaIt, 강남
	// java, 2026-01-01~2026-02-28
	// 웹개발 국비, 2026-03-16~2026-09-03
	// DB ,2026-05-01~2026-05-31
	// 5개 이상 들으면 배열을 늘려줘라...

	// 수강과목을 추가하는 메서드
	// => 1번 호출될 때마다 1개의 수강과목/ 기간이 추가

	private String studentName;
	private String phoneNumber;
	private String studentAddress;
	private String birth;
	private final String academyName = "koreaIt"; // 한번 지정하면 변하지 않을 정보--> 상수-->final
	private String academyAddress;
	private int index;
	private String[] subject;
	private String[] term;

	public Student(String name, String phoneNumber, String adress, String birth, String academyAddress) {
		this.studentName = name;
		this.phoneNumber = phoneNumber;
		this.studentAddress = adress;
		this.birth = birth;
		this.academyAddress = academyAddress;
		this.subject = new String[5];
		this.term = new String[5];
	}

	// 과목 추가 메서드
	public void add() {

		if (index >= 5) {
			String[] arr = new String[subject.length + 1];
			System.arraycopy(subject, 0, arr, 0, subject.length);
			subject = arr;

			String[] arr1 = new String[term.length + 1];
			System.arraycopy(term, 0, arr1, 0, term.length);
			term = arr1;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("수강 과목 입력>");
		this.subject[this.index] = scan.next();
		System.out.println("수강 기간 입력>");
		this.term[this.index] = scan.next();
		index++;
	}

	// 출력
	public void print() {

		System.out.println(toString());

		System.out.println("수강 정보");
		for (int i = 0; i < index; i++) {
			System.out.print(subject[i] + ",");
			System.out.println(term[i]);
		}

	}
	
	

	@Override
	public String toString() {
		return "학생의 기본정보:" + studentName + "," + phoneNumber + "," + studentAddress + "," + birth + "\n" + "학원정보:"
				+ academyName + "," + academyAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAcademyName() {
		return academyName;
	}

	public String getAcademyAddress() {
		return academyAddress;
	}

	public void setAcademyAddress(String academyAddress) {
		this.academyAddress = academyAddress;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public String[] getTerm() {
		return term;
	}

	public void setTerm(String[] term) {
		this.term = term;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
