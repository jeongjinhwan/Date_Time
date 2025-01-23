package main.java.date_time;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateNTime {
  private static final String DT_PATTERN = "yyyyMMddHHmmss";
  private static final String AMERICA = "America/Los_Angeles";

  public static void main(String[] args) {
    DateTimeFormatter dtPattern = DateTimeFormatter.ofPattern(DT_PATTERN);

    System.out.println(ZoneId.systemDefault().toString());
    System.out.println(getToday(dtPattern, null));
    System.out.println(getToday(dtPattern, Clock.system(ZoneId.of(AMERICA))));
  }

  private static String getToday(DateTimeFormatter dtPattern, Clock clock) {
    if (clock != null) {
      return LocalDateTime.now(clock).format(dtPattern);
    } else {
      return LocalDateTime.now().format(dtPattern);
    }
  }

}
