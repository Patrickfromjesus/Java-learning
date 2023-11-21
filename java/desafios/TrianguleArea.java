package desafios;

import java.util.Scanner;

public class TrianguleArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira a base do triângulo (cm): ");
    double base = scanner.nextDouble();

    System.out.print("Insira a altura do triângulo (cm): ");
    double height = scanner.nextDouble();

    double area = (base * height) / 2;

    System.out.printf("A área do triângulo é: %.2f\n cm².", area);

    scanner.close();
  }
}