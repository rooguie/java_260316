package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 시간 클래스 
		/*
		 * Date 클래스 => Deprecated(비권장)
		 * Calendar 클래스
		 * LocalDate 클래스
		 */

		Date date=new Date(); //오늘 날짜 리턴
		System.out.println(date.toString());
		date.getDate();
		System.out.println(date.getDate());
		

		Calendar c= Calendar.getInstance() ;
		int year=c.get(Calendar.YEAR);
		System.out.println(year);
		
		//월이 1~12월이 0부터 시작 즉 0~11의 숫자가 들어감
		int month=c.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		
		//static method now()
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate);
		
		LocalDateTime local=LocalDateTime.now();
		System.out.println(local.getYear());
		System.out.println(local.getMonthValue());
		System.out.println(local.getDayOfMonth());
		
		System.out.println(local.toLocalDate());
		
		LocalDateTime birth=LocalDateTime.of(2000, 4, 17, 12,00);
		System.out.println(birth);
		
		
		//yyyy MM dd hh:mm:ss
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(birth));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
