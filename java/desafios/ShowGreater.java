package desafios;

import java.util.Scanner;

public class ShowGreater {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int oldNum = 0;

    for (int i = 0; i < 10; i += 1) {
      System.out.print("Entre com um número: ");
      int currNum = scanner.nextInt();
      oldNum = (currNum > oldNum || i == 0) ? currNum : oldNum;
    }

    System.out.printf("O maior número digitado foi: %d\n", oldNum);

    scanner.close();
  }
}