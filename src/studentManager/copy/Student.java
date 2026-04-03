package studentManager.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
//	//학생정보 클래스
//	private String stdNo;
//	private String stdName;
//	private int stdAge;
//	private String stdPhone;
//	private String stdAdress;
//	private Subject[] attendSub=new Subject[5]; 
//	private int index;
//	
//	
//	public Student() {}
//	
//	
//	public Student(String stdNo,String stdName,int stdAge,String stdPhone,String stdAdress) {
//		this.stdNo=stdNo;
//		this.stdName=stdName;
//		this.stdAge=stdAge;
//		this.stdPhone=stdPhone;
//		this.stdAdress=stdAdress;
//	}
//	
//	public void addAttend(Subject s) {
//		if(index<this.attendSub.length) {
//			attendSub[index]=s;
//			index++;
//		}
//		else  {
//			//인덱스 늘리기
//			Subject[] tmp=new Subject[attendSub.length+3];
//			System.arraycopy(attendSub, 0, tmp, 0, attendSub.length);
//			this.attendSub=tmp;
//			attendSub[index]=s;
//			index++;
//
//		}
//		
//	}
//	
//	public void back(int num) {
//		//맨 뒤 배열을 철회할 배열 인덱스에 가져오고
//		attendSub[num]=attendSub[index-1];
//		
//		//마지막 인덱스에 null 넣고
//		attendSub[index]=null;
//		
//		//인덱스 줄이기
//		index--;
//		
//	}
//	
//	public Subject printSubject(int num) {
//		return this.attendSub[num];
//	}
//	
//	
//	
//	@Override
//	public String toString() {
//		return "학번:" + stdNo + ", 이름:" + stdName + ", 나이:" + stdAge + ", 전화번호:" + stdPhone
//				+ ", 주소:" + stdAdress;
	// 수강과목은 따로 만들어서 null값 없애기
//	}
//
//
//
//	public String getStdNo() {
//		return stdNo;
//	}
//	public void setStdNo(String stdNo) {
//		this.stdNo = stdNo;
//	}
//	public String getStdName() {
//		return stdName;
//	}
//	public void setStdName(String stdName) {
//		this.stdName = stdName;
//	}
//	public int getStdAge() {
//		return stdAge;
//	}
//	public void setStdAge(int stdAge) {
//		this.stdAge = stdAge;
//	}
//	public String getStdPhone() {
//		return stdPhone;
//	}
//	public void setStdPhone(String stdPhone) {
//		this.stdPhone = stdPhone;
//	}
//	public String getStdAdress() {
//		return stdAdress;
//	}
//	public void setStdAdress(String stdAdress) {
//		this.stdAdress = stdAdress;
//	}
//	public Subject[] getAttendSub() {
//		return attendSub;
//	}
//	public void setAttendSub(Subject[] attendSub) {
//		this.attendSub = attendSub;
//	}
//
//
//	public int getIndex() {
//		return index;
//	}
//
//
//	public void setIndex(int index) {
//		this.index = index;
//	}

	// 학생정보 클래스 => 학생1명
	// 학번, 이름, 나이, 전화번호, 주소, 수강과목[5]
	// 멤버변수에 배열이 존재하면 index 역할을 하는 변수가 필요

	private String studentNumber;
	private String studentName;
	private int studentAge;
	private String studentPhone;
	private String studentAdress;

	// 학생 1명당 본인이 수강신청한 과목의 목로
	private List<Subject> subjectList = new ArrayList<>();

	// 생성자
	public Student() {
	}

	public Student(String studentNumber, String studentName, int studentAge, String studentPhone,
			String studentAdress) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentPhone = studentPhone;
		this.studentAdress = studentAdress;
	}

	// 학생 등록
	public Student(String studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAge = 20;
		this.studentPhone = "010-1234-5678";
		this.studentAdress = "XX동";
	}

	// 수강과목의 객체가 들어오면 내 수강 배열에 추가하는 역할
	// 해당 배열에 이미 동일 과목이 존재하는 경우==> 이미 추가한 과목
	// 배열이 꽉찬 경우 ==> 새배열을 만들어서 배열 복사,배열 주소 바꾸기
	public void insertSubject(Subject sub) {
		if (!nullCheck(sub)) {
			return;
		}

		subjectList.add(sub);
		System.out.println("수강신청 완료");

	}

	// 수강과목이 존재하는지 확인하는 메서드
	public boolean nullCheck(Subject sub) {
		if (sub == null) {
			return false;
		}
		if (sub.getSubjectCode().isBlank()) {
			System.out.println("수강정보가 없습니다.");
			return false;
		}
		return true;
	}

	// 수강과목 객체가 들어오면 내 수강배열에서 삭제
	public void deleteSubject(Subject sub) {
		// subjectList에서 sub가 몇번지에 있는지 찾기

		if (!nullCheck(sub)) {
			return;
		}

		// 해당 과목이 내 수강신청 목록에 존재하는지 확인
		if (!subjectList.contains(sub)) {
			System.out.println("해당과목이 수강신청 목록에 없습니다.");
			return;
		}

		subjectList.remove(sub);

	}

	// 출력메서드
	// 개인정보를 출력하는 메서드
	public void printInfo() {
		System.out.println(studentName + "(" + studentName + ") /" + studentAge);
		System.out.println(studentPhone + "/ " + studentAdress);
	}

	// 수강정보 확인 후 있으면 출력하는 메서드
	public void printSubjectList() {
		if (subjectList == null) {
			System.out.println("수강과목이 없습니다.");
			return; // 조건에 맞으면 메서드를 끝내기
		}
		for (Subject tmp : subjectList) {
			System.out.println(tmp);
		}
		System.out.println("-------------");
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAdress() {
		return studentAdress;
	}

	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

}
