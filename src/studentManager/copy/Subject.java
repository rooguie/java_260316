package studentManager.copy;

public class Subject {
	//과목정보 클래스
	//과목정보: 과목코드,과목명,시수,강사명,강의장
//	private String subNo;
//	private String subName;
//	private String subSession;
//	private String teacherName;
//	private String subClass;
//	
//	public Subject() {}
//	
//	public Subject(String subNo,String subName,String subSession,String teacherName,String subClass) {
//		this.subNo=subNo;
//		this.subName=subName;
//		this.subSession=subSession;
//		this.teacherName=teacherName;
//		this.subClass=subClass;
//	}
//	
//	@Override
//	public String toString() {
//		return "과목코드:" + subNo + ", 과목명:" + subName + ", 학기:" + subSession + ", 교수:"
//				+ teacherName + ", 강의장:" + subClass;
//	}
//
//
//	public String getSubNo() {
//		return subNo;
//	}
//
//	public void setSubNo(String subNo) {
//		this.subNo = subNo;
//	}
//
//	public String getSubName() {
//		return subName;
//	}
//
//	public void setSubName(String subName) {
//		this.subName = subName;
//	}
//
//	public String getSubSession() {
//		return subSession;
//	}
//
//	public void setSubSession(String subSession) {
//		this.subSession = subSession;
//	}
//
//	public String getTeacherName() {
//		return teacherName;
//	}
//
//	public void setTeacherName(String teacherName) {
//		this.teacherName = teacherName;
//	}
//
//	public String getSubClass() {
//		return subClass;
//	}
//
//	public void setSubClass(String subClass) {
//		this.subClass = subClass;
//	}
	
	
	//과목정보: 과목코드,과목명,시수,강사명,강의장
	//멤버변수 -> 생성자-> getter/setter-> toString + 필요한거 추가로
	
	private String subjectCode;
	private String subjectName;
	private String subjectTime;
	private String subjectProfessor;
	private String subjectRoom;
	
	public Subject() {}

	public Subject(String subjectCode, String subjectName, String subjectTime, String subjectProfessor,
			String subjectRoom) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectTime = subjectTime;
		this.subjectProfessor = subjectProfessor;
		this.subjectRoom = subjectRoom;
	}
	
	public Subject(String subjectCode,String subjectName) {
		this.subjectCode=subjectCode;
		this.subjectName=subjectName;
		this.subjectTime = "3";
		this.subjectProfessor = "홍길동";
		this.subjectRoom = "A강의장";
	}
	
	
	
	//출력 메서드
	public void printSubject() {
		System.out.println(subjectName+"("+subjectCode+")"+"/"+subjectRoom);
	}

	

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String getSubjectProfessor() {
		return subjectProfessor;
	}

	public void setSubjectProfessor(String subjectProfessor) {
		this.subjectProfessor = subjectProfessor;
	}

	public String getSubjectRoom() {
		return subjectRoom;
	}

	public void setSubjectRoom(String subjectRoom) {
		this.subjectRoom = subjectRoom;
	}
	
	
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectTime=" + subjectTime
				+ ", subjectProfessor=" + subjectProfessor + ", subjectRoom=" + subjectRoom + "]";
	}
	
	
	
	
	
}
