package desafios;

import java.util.Scanner;

public class DesafioCalc {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);

    System.out.println("Primeiro número: ");
    double num1 = entry.nextDouble();

    System.out.println("Segundo número: ");
    double num2 = entry.nextDouble();

    System.out.println("Operação desejada (+, -, *, / ou %): ");
    String operation = entry.next();

    double result = operation.equals("+") ? num1 + num2
        : operation.equals("-") ? num1 - num2
            : operation.equals("*") ? num1 * num2
                : operation.equals("/") ? num1 / num2 : operation.equals("%") ? num1 % num2 : 0;

    System.out.printf("Resultado: %.2f.\n", result);

    entry.close();
  }
}

// Ler um número
// Ler outro número
// Fazer operação
// +, -, *, /, %
// Mostrar o resultado.
// Usar JOptionPane e Scanner