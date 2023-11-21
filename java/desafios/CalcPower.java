package desafios;

import java.util.Scanner;

public class CalcPower {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira um número");
    double num = scanner.nextDouble();

    System.out.println("Qual a potência?");
    double power = scanner.nextDouble();

    double result = Math.pow(num, power);

    System.out.printf("O resultado da operação é: %.2f\n", result);

    scanner.close();
  }
}