package day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class FileEx01 {

	public static void main(String[] args) throws IOException{
		// "C:\Users\hoogil\Documents\scores.txt"
		// 파일을 읽어 들여 map에 저장
		// 명단 출력/ 합계/ 평균 출력
		// 점수가 80점 이상인 학생의 명단 출력 => 인원 수 출력
		
		final String fileName="C:\\Users\\hoogil\\Documents\\scores.txt";
		
		BufferedReader br= new BufferedReader(new FileReader(fileName));
		
		Map<String, Integer> scores= new HashMap<String, Integer>();
		
		int sum=0;
		int count=0;
		double avg=0;
		
		while(true) {
			
			//파일 읽기
			String line=br.readLine();
			
			
			if(line == null) {
				break;
			}
			//String => substring
//			String name=line.substring(0,line.indexOf(" "));
//			int score=Integer.parseInt(line.substring(line.indexOf(" ")+1));

			count++; //총원 파악
			
			//split(" ") => 배열로 리턴
			//파일에 있는 내용 나누어 map 저장
			String[] tmp=line.split(" "); //배열로 리턴
			
			scores.put(tmp[0],Integer.parseInt(tmp[1]));
			
			
		}
		
		System.out.println("학생 명단");
		
		for(String key:scores.keySet()) {
			sum+=scores.get(key);
			System.out.println(key);
		}
		
		//forEach로도 가능
		System.out.println("--forEach--");
		scores.forEach((k,v)->System.out.println(k+":"+v));
		
		avg=(double)sum/count;
		
		System.out.println("----------");
		
		System.out.println("총 점수:"+sum+"/평균:"+avg);
		
		System.out.println();
		
		System.out.println("---80점이상 학생 명단---");
		
		for(String key:scores.keySet()) {
			if(scores.get(key)>=80) {
				System.out.println(key);
			}
		}
		
		
		br.close();
		

	}

}
