package desafios;

import java.util.Scanner;

public class ShowAvg {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double currentGrade = 0;
    double sumGrades = 0;
    double totalGrades = 1;

    while (currentGrade != -1) {
      System.out.print("Insira a nota: ");
      currentGrade = scanner.nextDouble();
      if (currentGrade <= 10 && currentGrade >= 0) {
        sumGrades += currentGrade;
        totalGrades += 1;
      } else if (currentGrade != -1)
        System.out.printf("Insira uma nota válida!");
    }

    System.out.printf("A média das notas é: %.2f\n", sumGrades / totalGrades);

    scanner.close();
  }
}