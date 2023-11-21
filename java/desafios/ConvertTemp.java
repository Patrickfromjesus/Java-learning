package desafios;

import java.util.Scanner;

public class ConvertTemp {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual a temperatura ? ");
    double temp = scanner.nextDouble();

    System.out.println("Deseja transformar para Fahrenheit ou Celsius ? (Ex.: f ou c)");
    String scale = scanner.next();

    double result = scale.equals("f") ? (9 * temp / 5) + 32 : (5 * (temp - 32)) / 9;

    System.out.printf("Resultado: %.2f°%s\n", result, scale.toUpperCase());

    scanner.close();
  }
}