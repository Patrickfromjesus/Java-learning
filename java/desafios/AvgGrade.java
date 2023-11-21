package desafios;

import java.util.Scanner;

public class AvgGrade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double grade1, grade2;
    do {
      System.out.print("Entre com a primeira nota: ");
      grade1 = scanner.nextDouble();
    } while (grade1 < 0 || grade1 > 10);

    do {
      System.out.print("Entre com a segunda nota: ");
      grade2 = scanner.nextDouble();
    } while (grade2 < 0 || grade2 > 10);

    double avg = (grade1 + grade2) / 2;

    if (avg < 4)
      System.out.println("Reprovado.");
    else if (avg < 7)
      System.out.println("Recuperação.");
    else
      System.out.println("Aprovado.");

    scanner.close();
  }
}