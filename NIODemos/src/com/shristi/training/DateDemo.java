package com.shristi.training;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate date1 = LocalDate.of(2023, 2, 17);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.parse("2023-05-11");
		System.out.println(date2);
		System.out.println(date1.isAfter(date2));
		
		Month month = date1.getMonth();
		System.out.println(month.name());
		
		System.out.println(date2.getYear());
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		localDateTime = LocalDateTime.of(2023, 1, 5, 10, 20);
		System.out.println(localDateTime);
		localDateTime = localDateTime.plusHours(2);
		System.out.println(localDateTime);
		
		
		
		
	}

}
