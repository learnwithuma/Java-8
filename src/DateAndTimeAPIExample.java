
// Lambda Expression and Collections

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class DateAndTimeAPIExample {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);

		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getYear());

		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());

		LocalDateTime ldt1 = LocalDateTime.of(1988, 01, 01, 0, 0, 0, 0);
		System.out.println(ldt1);
		
		ldt1.plusDays(10);
		ldt1.minusDays(5);
		
		Period p = Period.between(ld, ld.plusDays(10));
		System.out.println(p.getDays());
		
		System.out.println(ZoneId.systemDefault());
		
		ZoneId ca = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(ca);
		System.out.println(zt.now());

	}
}