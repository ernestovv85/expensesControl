package entities;

public class Date {
  private int day, year;
  private String month;

  public Date() {
  }

  public Date(int day, int year, String month) {
    this.day = day;
    this.year = year;
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }
}
