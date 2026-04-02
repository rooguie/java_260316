package studentManager;

import java.util.Scanner;

public class StudentController implements StudentProgram {
	// 학생배열
	private Student[] student;
	private int stdIndex;

	// 수강 과목 데이터
	private Subject[] subList;
//	private int subIndex;

	public StudentController() {
		student = new Student[5];
		subList = new Subject[5];
	}

	// 학생 더미데이터
	public void addStudent() {
		student[0] = new Student("STD2601", "홍길동", 21, "010-1234-5678", "서울시 강남구");
		student[1] = new Student("STD2602", "강민지", 22, "010-9876-5432", "부산시 해운대구");
		student[2] = new Student("STD2603", "오윤석", 20, "010-5555-4444", "경기도 수원시");

		this.stdIndex = 3;

	}

	// 과목 더미데이터
	public void addSubject() {
		subList[0] = new Subject("SUB001", "자바 프로그래밍", "2026-1", "김철수", "A강의실");
		subList[1] = new Subject("SUB002", "데이터베이스 기초", "2026-1", "이영희", "B강의실");
		subList[2] = new Subject("SUB003", "운영체제론", "2026-2", "박지성", "C강의실");
		subList[3] = new Subject("SUB004", "인공지능 개론", "2026-1", "최수호", "D강의실");
		subList[4] = new Subject("SUB005", "알고리즘 실습", "2026-2", "정나래", "A강의실");

		// this.subIndex = 5;
	}

	// 학번을 입력받아 해당 배열에서 학번이 있는지 확인하는 방법
	// 학번이 있는지 없는지 보다 일치하는 학번의 학생이 어떤 배열에 있는지 확인해야한다
	// 그리고 그 인덱스를 반환해야한다.
	// 학번을 스케너에서 직접 받아

	public int indexSearch(String number) {
		for (int i = 0; i < stdIndex; i++) {
			if (student[i].getStudentNumber().equals(number)) {
				return i;
			}
		}
		return -1;
	}

	// 수강 신청 시 신청가능한 목록을 출력하는 메소드
	public void printSubList() {
		int i = 1;
		System.out.println("--수강신청 목록--");
		for (Subject s : subList) {
			System.out.print(i + ".");
			s.printSubject();
			i++;

		}
	}

	@Override // 메서드 쓴 후
	public void insertStudent(Scanner scan) {
		// 학번에 대한 중복 불가 처리
		System.out.println("학번 입력:");
		String num = scan.next();
		if (indexSearch(num) != -1) {
			System.out.println("학번이 중복됩니다.");
			return;
		}

		// 먼저 객체 선언을 해야
		Student std = new Student();
		student[this.stdIndex] = std;

		System.out.println("학번:");
		// 객체가 형성되어서 받을 수 있음
		student[this.stdIndex].setStudentNumber(num);

		System.out.println("학생 이름:");
		String name = scan.next();
		student[this.stdIndex].setStudentName(name);

		System.out.println("나이:");
		int age = scan.nextInt();
		student[this.stdIndex].setStudentAge(age);
		;

		System.out.println("전화번호:");
		String phone = scan.next();
		student[this.stdIndex].setStudentPhone(phone);

		// 전화번호에서 입력 후 enter가 스캐너 버퍼에 남아있음
		scan.nextLine();

		System.out.println("주소:");
		// 한 단어로 입력받기 힘들때
		String adress = scan.nextLine();
		student[this.stdIndex].setStudentAdress(adress);
		;

		System.out.println("등록 완료");

		this.stdIndex++;

	}

//	@Override 메서드 쓰기 전
//	public void insertStudent(Scanner scan) {
//		// 학생 등록
//		System.out.println("학번>");
//		String num = scan.next();
//
//		// 학번에 대한 중복 불가 처리
//		for (int i = 0; i < stdIndex; i++) {
//			if (student[i].getStudentNumber().equals(num)) {
//				System.out.println("학번이 중복");
//				return; // 학번 입력 다시
//			}
//		}
//
//		// 먼저 객체 선언을 해야
//		Student std = new Student();
//		student[this.stdIndex] = std;
//
//		System.out.println("학번:");
//		// 객체가 형성되어서 받을 수 있음
//		student[this.stdIndex].setStudentNumber(num);
//
//		System.out.println("학생 이름:");
//		String name = scan.next();
//		student[this.stdIndex].setStudentName(name);
//
//		System.out.println("나이:");
//		int age = scan.nextInt();
//		student[this.stdIndex].setStudentAge(age);
//		;
//
//		System.out.println("전화번호:");
//		String phone = scan.next();
//		student[this.stdIndex].setStudentPhone(phone);
//
//		// 전화번호에서 입력 후 enter가 스캐너 버퍼에 남아있음
//		scan.nextLine();
//
//		System.out.println("주소:");
//		// 한 단어로 입력받기 힘들때
//		String adress = scan.nextLine();
//		student[this.stdIndex].setStudentAdress(adress);
//		;
//
//		System.out.println("등록 완료");
//
//		this.stdIndex++;
//
//	}

	@Override
	public void printStudentList() {
		// 전체 학생 목록을 출력(수강정보X)
		System.out.println("--학생명단 출력--");
		// 학생 명단이 배열에 다 차 있지 않기 때문에 끝까지 돌리는 향상된 for문을 돌리면 안됨
		for (int i = 0; i < stdIndex; i++) {
			student[i].printInfo();
		}

	}

	@Override
	public void searchStudent(Scanner scan) {
		// 학생 검색
		// 학생 학번을 입력받아 그 학생의 정보를 출력
		System.out.println("학번 입력:");
		String num = scan.next();

		int index = indexSearch(num);

		if (index == -1) {
			System.out.println("일치하는 학생이 없음");
			return;
		}

		student[index].printInfo();
		student[index].printSubjectList();

	}

//	@Override
//	public void searchStudent(Scanner scan) {
//		// 학생 검색
//		// 학생 학번을 입력받아 그 학생의 정보를 출력
//		System.out.println("학번 입력:");
//		String num = scan.next();
//
//		// 학생 번지를 확인
//		for (int i = 0; i < stdIndex; i++) {
//			if (student[i].getStudentNumber().equals(num)) {
//				student[i].printInfo();
//				student[i].printSubjectList();
//				return;
//			}
//		}
//
//		System.out.println("일치하는 학번이 없음");
//
//	}

	@Override
	public void insertSubject(Scanner scan) {
		// 수강 신청은 개인별로
		// 수강 신청할 학생의 학번을 입력받아 수강과목 리스트를 출력
		// 수강할 과목 선택 후
		// 해당 과목의 객체를 Student 클래스의 insertSubject로 전달
		System.out.println("학번 입력:");
		String num = scan.next();

		int index = indexSearch(num);

		if (index == -1) {
			System.out.println("일치하는 학생이 없음");
			return;
		}

		printSubList(); // 과목 목록 출력 메서드 호출
		System.out.println("수강과목 선택(번호로 선택)>");
		int subIndex = scan.nextInt();

		// 이상한 값을 입력했을 때
		if (subIndex <= 0 || subIndex > subList.length) {
			System.out.println("잘못 선택");
			return;
		}

		// subList[subIndex-1]==> 선택한 과목
		// 학생 클래스에서 과목 추가 메서드 호출
		student[index].insertSubject(subList[subIndex - 1]);
		return;
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강 철회도 개인별로 한다.
		// 철회할 학번을 입력받아 해당 과목이 있는지 체크
		// 과목 번호를 받아 해당 객체를 Student=>deleteSubject() 전달

		System.out.println();
		String num = scan.next();
		for (int i = 0; i < stdIndex; i++) {
			if (student[i].getStudentNumber().equals(num)) {
				// 내가 신청한 수강신청 리스트 출력
				System.out.println("---내 수강과목----");
				student[i].printSubjectList();

				System.out.println("철회할 과목코드>");
				String subNum = scan.next();

				// Subject 객체에 과목코드만 담아 전송
				Subject s = new Subject();
				s.setSubjectCode(subNum);

				student[i].deleteSubject(s);
				;
				return;

			}
		}
		System.out.println("일치하는 학번이 없습니다.");

	}

//	@Override
//	public void insertStudent(Scanner scan) {
//		// 학생 등록
//
//		// 먼저 객체 선언을 해야
//		Student std = new Student();
//		student[this.stdIndex] = std;
//
//		System.out.println("학번:");
//		String num = scan.next();
//		// 객체가 형성되어서 받을 수 있음
//		student[this.stdIndex].setStdNo(num);
//
//		System.out.println("학생 이름:");
//		String name = scan.next();
//		student[this.stdIndex].setStdName(name);
//
//		System.out.println("나이:");
//		int age = scan.nextInt();
//		student[this.stdIndex].setStdAge(age);
//
//		System.out.println("전화번호:");
//		String phone = scan.next();
//		student[this.stdIndex].setStdPhone(phone);
//
//		System.out.println("주소:");
//		String adress = scan.next();
//		student[this.stdIndex].setStdAdress(adress);
//
//		System.out.println("등록 완료");
//
//		this.stdIndex++;
//
//	}
//
//	@Override
//	public void printStudentList() {
//		// 학생 리스트 출력
//		// 신청 비어있는 인덱스 null없애기
//		System.out.println("--학생 리스트--");
//		for (int i = 0; i < stdIndex; i++) {
//			System.out.println(i + 1 + "." + student[i]);
//		}
//
//	}
//
//	@Override
//	public void searchStudent(Scanner scan) {
//		// 학생 조회
//		// 신청 비어있는 인덱스 null없애기 --> student 출력을 바꾸기
//		while (true) {
//			int cnt = 0;
//			System.out.println("학번 입력:");
//			String stdNum = scan.next();
//			for (int i = 0; i < this.stdIndex; i++) {
//
//				if (student[i].getStdNo().equals(stdNum)) {
//
//					System.out.println(student[i]);
//
//					cnt = 1;
//
//					break;
//
//				}
//
//			}
//
//			if (cnt == 1) {
//				break;
//			}
//
//			System.out.println("일치하는 학번 없음");
//			System.out.println("학번 다시 입력");
//
//		}
//
//	}
//
//	@Override
//	public void insertSubject(Scanner scan) {
//		// 학번 입력 받고
//		// 해당 학번 학생을 찾고
//		
//		while (true) {
//			int cnt = 0;
//			System.out.println("학번 입력:");
//			String stdNum = scan.next();
//			for (int i = 0; i < this.stdIndex; i++) {
//
//				if (student[i].getStdNo().equals(stdNum)) {
//
//					System.out.println(student[i].getStdName() + "학생");
//
//					for (int j = 0; j < this.subIndex; j++) {
//						System.out.println(j + 1 + "." + subject[j]);
//					}
//
//					System.out.println("수강할 과목 선택:");
//					int num = scan.nextInt();
//
//					Subject s = new Subject();
//
//					s = subject[num - 1];
//
//					// 그 학생 수강과목 배열에 넣기
//
//					student[i].addAttend(s);
//					System.out.println("수강 신청 완료");
//
//					cnt = 1;
//
//					break;
//
//				}
//
//			}
//
//			if (cnt == 1) {
//				break;
//			}
//
//			System.out.println("일치하는 학번 없음");
//			System.out.println("학번 다시 입력");
//
//		}
//
//	}
//
//	@Override
//	public void deleteSubject(Scanner scan) {
//		// 수강 철회
//		while (true) {
//			int cnt = 0;
//			System.out.println("학번 입력:");
//			String stdNum = scan.next();
//			for (int i = 0; i < this.stdIndex; i++) {
//
//				if (student[i].getStdNo().equals(stdNum)) {
//
//					System.out.println(student[i].getStdName() + "학생");
//
//					System.out.println("----수강 신청 내역----");
//
//					if (student[i].printSubject(0) == null) {
//						System.out.println("수강신청 내역이 없습니다.");
//						cnt = 1;
//						break;
//					}
//
//					else if (student[i].printSubject(0) != null) {
//
//						System.out.println("----철회할 과목 선택----");
//						for (int j = 0; j < student[i].getIndex(); j++) {
//							System.out.println(j + 1 + "." + student[i].printSubject(j));
//						}
//
//						System.out.println("철회할 과목 선택:");
//						int num = scan.nextInt();
//
//						student[i].back(num - 1);
//						
//
//						System.out.println("수강 철회 완료");
//
//						cnt = 1;
//
//						break;
//					}
//
//				}
//
//			}
//
//			if (cnt == 1) {
//				break;
//			}
//
//			System.out.println("일치하는 학번 없음");
//			System.out.println("학번 다시 입력");
//
//		}
//
//	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

	public int getStdIndex() {
		return stdIndex;
	}

	public void setStdIndex(int stdIndex) {
		this.stdIndex = stdIndex;
	}

	public Subject[] getSubList() {
		return subList;
	}

	public void setSubList(Subject[] subList) {
		this.subList = subList;
	}

}
