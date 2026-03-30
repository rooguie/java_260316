package day10;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student[] stdList = new Student[5];

	
		
		//학생 이름을 입력받아 그 학생의 정보를 출력
		//등록되어 있지 않은 학생이라면 없는 정보 입니다.
		String name;
		name=scan.next();
		
		for(int i=0;i<stdList.length;i++) {
			if(stdList[i].getStudentName().equals(name)) {
				stdList[i].print();
			}
		}
		
		scan.close();

	}

}
