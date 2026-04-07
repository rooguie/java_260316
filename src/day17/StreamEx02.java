package day17;

import java.util.ArrayList;
import java.util.List;

public class StreamEx02 {

	public static void main(String[] args) {
		//여행 비용구하기
		/*
		 * Customer 클래스 생성
		 * 이름,나이,비용
		 * 
		 * 여행비용이 15세 이상은 100만원, 15세 미만은 80만원 계산
		 * 고객 5명이 패키지 여행을 떠난다고 했을 경우
		 * 1.비용 계산=> 출력
		 * 2.고객명단 출력=> 이름 순으로 정렬
		 * 3.20세 이상인 성명 고객 명단 출력=> 나이순으로 정렬
		 * 
		 * 
		 * 예)
		 * 이름: 신형만 나이:40 비용:100
		 * 이름: 봉미선 나이:38 비용:100
		 * 이름: 짱구 나이:7 비용:80
		 * 이름: 짱아 나이:3 비용:80
		 * 이름: 흰둥이 나이:10 비용:80
		 * 
		 * 총 여행 경비:000
		 * 
		 */
		
		List<Customer> customerList=new ArrayList<>();
		
		Customer c1=new Customer("신형만",40);
		Customer c2=new Customer("봉미선",38);
		Customer c3=new Customer("짱구",7);
		Customer c4=new Customer("짱아",3);
		Customer c5=new Customer("흰둥이",10);
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		
		//1. 비용 계산 및 출력
		customerList.stream().forEach(n->System.out.println(n));
		int sum=customerList.stream().mapToInt(n->n.getCost()).sum();
		System.out.println("총 여행비용: "+sum+"만원");
		
		
		//2.고객 명단 출력 이름순
		
		
		
		
		
		

	}

}
