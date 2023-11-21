package desafios;

import java.util.Scanner;

public class GuessNum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num, randomNum = (int) (Math.random() * 100);

    for (int i = 10; i > 0; i -= 1) {
      System.out.print("Advinhe o número: ");
      num = scanner.nextInt();
      if (num == randomNum) {
        System.out.println("Acertou!! :)");
        break;
      }
      boolean isGreater = num > randomNum;
      System.out.printf("Você tem %d tentativas restantes. ", i - 1);
      if (i - 1 == 0) {
        System.out.println("\nPerdeu, doidão!");
        break;
      }
      System.out.printf(isGreater ? "Tente um número menor. :(\n" : "Tente um número maior. :(\n");
    }

    scanner.close();
  }
}
