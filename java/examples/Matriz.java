package examples;

import java.util.Scanner;
import java.util.Arrays;

public class Matriz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos alunos há na classe? ");
    int studentsQuantity = scanner.nextInt();

    System.out.print("Quantas notas são por aluno? ");
    int gradesQuantity = scanner.nextInt();

    double[][] grades = new double[studentsQuantity][gradesQuantity];

    double sum1 = 0;

    for (int i = 0; i < studentsQuantity; i += 1) {
      for (int j = 0; j < gradesQuantity; j += 1) {
        System.out.printf("%d° nota do %d° aluno: ", j + 1, i + 1);
        grades[i][j] = scanner.nextDouble();
        sum1 += grades[i][j];
      }
    }

    System.out.println(Arrays.toString(grades));

    for (double[] student : grades) {
      System.out.println(Arrays.toString(student));
    }

    System.out.println(sum1 / (studentsQuantity * gradesQuantity));

    scanner.close();
  }
}
