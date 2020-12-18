package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {

	@org.junit.Test
	public void r(){
		Integer hour = LocalDateTime.now().getHour();
		LocalDateTime beginOfDay = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
		System.out.println(beginOfDay);
		LocalDateTime endOfDay = beginOfDay.plusHours(hour);
		System.out.println(endOfDay);

		String esSuffix = beginOfDay.format(DateTimeFormatter.ofPattern("yyyyMM"));
		System.out.println(esSuffix);

	}
}

