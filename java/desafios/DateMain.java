package desafios;

public class DateMain {
  public static void main(String[] args) {
    Date date1 = new Date();

    String formated1 = date1.format();

    System.out.println(formated1);

    Date date2 = new Date("02", "11", "2023");
    date2.day = "02";
    date2.month = "11";
    date2.year = "2023";

    String formated2 = date2.format();
    // System.out.println(date2.local);
    System.out.println(Date.local);

    System.out.println(formated2);

  }
}
