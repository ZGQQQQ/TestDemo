package com;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;



import java.time.temporal.ChronoUnit;

public class Test {

	@org.junit.Test
	public void r(){
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.now());

		String s = Timestamp.valueOf(LocalDateTime.now().plus(5L, ChronoUnit.SECONDS)).toString();
		System.out.println(s);

	}
}

