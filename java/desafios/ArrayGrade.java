package desafios;

import java.util.Scanner;

public class ArrayGrade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos valores você deseja inserir: ");
    int quantity = scanner.nextInt();

    int[] values = new int[quantity];
    int sum = 0;

    for (int i = 0; i < quantity; i += 1) {
      System.out.printf("Insira o %d° valor: ", i + 1);
      int value = scanner.nextInt();
      values[i] = value;
    }

    for (int value : values) {
      sum += value;
    }

    System.out.printf("A média dos valores é: %.2f\n", sum / (double) quantity);

    scanner.close();
  }
}
