package org.altar.session4.test;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExamples {
	public static void main(String[] args) {
		// Today
		LocalDate today = LocalDate.now();
		System.out.println("Today is -> " + today);
		
		// Tomorrow
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow is -> " + tomorrow);
		
		// Today - Year, Month, Day
		System.out.printf("Year : %d | Month : %d | day : %d \t %n", today.getYear(), today.getMonthValue(), today.getDayOfMonth());
		
		// Create LocalDate from int values
		LocalDate someDateOf = LocalDate.of(2017, 01, 20);
		System.out.println("Some LocalDate -> " + someDateOf);
		 
		// Parse LocalDate from String
		LocalDate parseDate = LocalDate.parse("2017-01-20");
		System.out.println("Parsed LocalDate from String -> " + parseDate);
		
		// Find the Day of Week
		DayOfWeek dayOfWeek = LocalDate.parse("2016-03-17").getDayOfWeek();
		System.out.println("Day of the week -> " + dayOfWeek);
		
		// Is leap year
		boolean isLeapYear = LocalDate.now().isLeapYear();
		System.out.println("Is this a leap year ? -> " +isLeapYear);
		
		// -- //
		// Current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time -> " + currentTime);
		
		// Is time before
		boolean isBefore = LocalTime.parse("08:30").isBefore(LocalTime.parse("11:30"));
		System.out.println("Is the initial before x ? -> " + isBefore);
		
		// -- //
		// Date and Time
		LocalDateTime someDateTime = LocalDateTime.of(2015, Month.MARCH, 22, 06, 40);
		System.out.println("Some LocalDateTime of -> " +someDateTime);
		
		// Zoned Date and Time
		ZoneId zoneId = ZoneId.of("Europe/Lisbon");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println("ZonedDateTime -> " + zonedDateTime);
		
		// Instant
		Instant thisInstant = Instant.now();
		System.out.println("Instant -> " + thisInstant );
		
		// Clock
		Clock clock = Clock.systemUTC();
		System.out.println("Now on UTC clock -> " + Instant.now(clock));
		
		// Duration
		LocalTime initialTime = LocalTime.of(11, 30, 0); 
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(40));
		int duration = (int) Duration.between(initialTime, finalTime).getSeconds();
		System.out.println("Duration in seconds -> " + duration);
		
		// Period
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		System.out.println("Period -> " + finalDate);
		
		// ISO DateTimeFormatter
		LocalDateTime formattedNow = LocalDateTime.now();
		System.out.println("LocalDateTime formatted with ISO -> " + formattedNow.format(DateTimeFormatter.ISO_DATE_TIME));
		
		// Custom DateTimeFormatter
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("YYYY m d HH:mm");
		System.out.println("LocalDateTime with custom format -> " + formattedNow.format(customFormat));
	}
}
