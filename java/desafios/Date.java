package desafios;

public class Date {
  String day, month, year;
  static String local = "Brazil";

  // Construtor -> Should not have type of return and must have same name of
  // class.
  Date() {
    day = "01";
    month = "01";
    year = "1970";
  }

  // Another constructor, but now with parameters. We can have more than one
  // constructor.
  Date(String day, String month, String year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String format() {
    return String.format("%s/%s/%s", day, month, year);
  }
}
