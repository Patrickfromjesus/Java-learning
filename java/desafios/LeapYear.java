package desafios;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira o ano: ");
    int year = scanner.nextInt();

    boolean leapCondition = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

    System.out.println(leapCondition ? "Bissexto." : "Não é bissexto.");

    scanner.close();
  }
}