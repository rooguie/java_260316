package day10;

import java.text.DecimalFormat;

public class Report {

	/*
	 * 멤버변수:이름 국어 영어 수학 합계 평균 등수 생성자(이름,국어,영어,수학) 합계 평균 계산 출력 getter/setter
	 */

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int rank;
	private double avg;

	// 생성자
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//합계 평균 메서드
	public void total() {
		this.sum = kor + eng + math;
		this.avg = (double) sum / 3;
	}

	// 출력
	public void print() {
		System.out.println("이름:" + name);
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);
		System.out.println("합계:" + sum);
		System.out.printf("평균:%.2f\n", avg);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.00");

		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
