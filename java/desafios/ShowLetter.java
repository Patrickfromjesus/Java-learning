package desafios;

import java.util.Scanner;

public class ShowLetter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira a palavra: ");
    String letters = scanner.next();

    for (int i = 0; i < letters.length(); i += 1) {
      System.out.println(letters.substring(i, i + 1));
    }

    scanner.close();
  }
}