package desafios;

import java.util.Scanner;

public class PrintPositiveNum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num = 0;

    while (true) {
      System.out.print("Entre com um número positivo ou nulo: ");
      double numFromUser = scanner.nextDouble();
      if (numFromUser < 0)
        break;
      num += numFromUser;
      System.out.println(num);
    }

    scanner.close();
  }
}