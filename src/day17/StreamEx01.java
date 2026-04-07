package day17;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class StreamEx01 {

	public static void main(String[] args) {
		// class 생성 student(이름, 점수)
		
		//student list 생성 객체 추가(10)명
		//출력=>forEach()사용
		
		List<Student> std=new ArrayList<Student>();
		
		std.add(new Student("김철수", 14));
		std.add(new Student("이영희", 15));
		std.add(new Student("박지민", 13));
		std.add(new Student("최유진", 16));
		std.add(new Student("정민호", 12));
		std.add(new Student("강하늘", 14));
		std.add(new Student("윤서준", 15));
		std.add(new Student("임지우", 13));
		std.add(new Student("한승우", 17));
		std.add(new Student("권다은", 12));
		
		
		std.stream().forEach(n->System.out.println(n));
		
		//toString 말고 모양내서 출력
		std.stream().forEach(n->{
			String name=n.getStdName();
			int score=n.getScore();
			System.out.println("이름:"+name+"/"+score);
		});
		
		//점수 합계
		int sum=std.stream().mapToInt(n->n.getScore()).sum();
		System.out.println("합계"+sum);
		
		//전체 인원수
//		Student[] st=std.stream().toArray(n->new Student[n]);
//		long count=Arrays.stream(st).count();
		long count=std.stream().count();
		
		System.out.println("학생 수:"+count);
		
		//점수가 80점 이상인 학생의 인원수
		
		long count2=std.stream().filter(n->n.getScore()>=80).count();
		
		//이름 순으로 정렬 compareTo 구현
		std.stream()
		.sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getStdName().compareTo(o2.getStdName());
			}
			
		})
		.forEach(n->System.out.println(n));
		
		//점수가 높은 순으로 정렬
		System.out.println("-------------");
		Comparator<Student> byScore =
				Comparator.comparingInt((Student n)->n.getScore())
						.reversed()
						.thenComparing((Student n)->n.getStdName());
		std.stream().sorted(byScore).forEach(n->System.out.println(n));

		//클래스에 직접 implement=>comparable
		System.out.println("클래스에서 직접 구현");
		
		
	}

}


class Student{
	
	private String stdName;
	private int score;
	
	public Student() {}
	
	
	
	public Student(String stdName, int score) {
		this.stdName = stdName;
		this.score = score;
	}




	@Override
	public String toString() {
		return stdName + ":" + score;
	}
	
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}