package desafios;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;

    do {
      System.out.print("Entre com um número entre 0 e 10 (inclusive): ");
      num = scanner.nextInt();
    } while (num > 10 || num < 0);

    System.out.println(num % 2 == 0 ? "Par" : "Ímpar");

    scanner.close();
  }
}