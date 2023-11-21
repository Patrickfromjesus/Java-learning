package desafios;

import java.util.Scanner;

public class PrimeNum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre com um número: ");
    int num = scanner.nextInt();
    boolean isPrime = num != 1;
    // int count = num == 1 ? 0 : 1;

    // More performance.
    for (int i = 2; i <= num; i += 1) {
      if (num % i == 0 && i != num) {
        isPrime = false;
        break;
      }
    }

    // Execise using switch:
    // switch (Boolean.toString(isPrime)) {
    // case "true":
    // System.out.printf("%d é primo\n", num);
    // break;
    // default:
    // System.out.printf("%d não é primo\n", num);

    // }

    System.out.printf(isPrime ? "%d é primo.\n" : "%d não é primo.\n", num);

    // Less performance.
    // for (int i = 2; i <= num; i += 1) {
    // if (num == 1)
    // break;
    // if (num % i == 0 && i != num) {
    // count += 1;
    // }
    // }

    // System.out.printf(count == 1 ? "%d é primo.\n" : "%d não é primo.\n", num);

    // Verififcar se é divisível por 1 e por ele mesmo.
    // Se tem apenas dois divisores.

    scanner.close();
  }
}