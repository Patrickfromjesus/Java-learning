package desafios;

import java.util.Scanner;

public class CalcImc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual seu peso (kg)?");
    double weight = scanner.nextDouble();

    System.out.println("Qual a sua altura (m)?");
    double height = scanner.nextDouble();

    double imc = weight / (height * height);
    double imc2 = weight / Math.pow(height, 2);

    System.out.printf("Seu IMC é: %.2f.\n", imc);
    System.out.println("Seu IMC é: " + imc2 + '.');

    scanner.close();
  }
}