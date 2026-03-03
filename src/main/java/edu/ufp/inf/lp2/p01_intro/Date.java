package edu.ufp.inf.lp2.p01_intro;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date implements Comparable<Date> {

  private short day;
  private short month;
  private int year;

  public Date(short day, short month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  private LocalDate toLocalDate() {
    return LocalDate.of(year, month, day);
  }

  @Override
  public String toString() {
    return day + "/" + month + "/" + year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Date d = (Date) o;
    return day == d.day && month == d.month && year == d.year;
  }

  @Override
  public int hashCode() {
    return toLocalDate().hashCode();
  }

  @Override
  public int compareTo(Date d) {
    return this.toLocalDate().compareTo(d.toLocalDate());
  }

  public boolean afterDate(Date d) {
    return this.compareTo(d) > 0;
  }

  public boolean beforeDate(Date d) {
    return this.compareTo(d) < 0;
  }

  public int diferenceDays(Date d) {
    return (int) Math.abs(ChronoUnit.DAYS.between(this.toLocalDate(), d.toLocalDate()));
  }

  public int diferenceMonths(Date d) {
    return (int) Math.abs(ChronoUnit.MONTHS.between(this.toLocalDate(), d.toLocalDate()));
  }

  public int diferenceYears(Date d) {
    return Math.abs(this.year - d.year);
  }

  public void incrementDate() {
    LocalDate nextDay = this.toLocalDate().plusDays(1);
    this.day = (short) nextDay.getDayOfMonth();
    this.month = (short) nextDay.getMonthValue();
    this.year = nextDay.getYear();
  }

  public int daysCrawlerRecursive(Date begin, Date end) {
    return (int) ChronoUnit.DAYS.between(begin.toLocalDate(), end.toLocalDate());
  }

  public int daysCrawler(Date begin, Date end) {
    return (int) ChronoUnit.DAYS.between(begin.toLocalDate(), end.toLocalDate());
  }

  public int monthsCrawler(Date begin, Date end) {
    return (int) ChronoUnit.MONTHS.between(begin.toLocalDate(), end.toLocalDate());
  }

  public boolean isLeapYear(int year) {
    return java.time.Year.isLeap(year);
  }

  public int daysMonth(short month, int year) {
    return LocalDate.of(year, month, 1).lengthOfMonth();
  }

  public int daysBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year) {
    LocalDate begin = LocalDate.of(year, beginMonth, beginDay);
    LocalDate end = LocalDate.of(year, endMonth, endDay);
    return (int) ChronoUnit.DAYS.between(begin, end);
  }

  public int monthsBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year) {
    LocalDate begin = LocalDate.of(year, beginMonth, beginDay);
    LocalDate end = LocalDate.of(year, endMonth, endDay);
    return (int) ChronoUnit.MONTHS.between(begin, end);
  }


}