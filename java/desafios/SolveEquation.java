package desafios;

import java.util.Scanner;

public class SolveEquation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Insira o coeficiente angular: ");
    double a = scanner.nextDouble();

    System.out.print("Insira o coeficiente linear: ");
    double b = scanner.nextDouble();

    System.out.print("Insira o termo independente: ");
    double c = scanner.nextDouble();

    double delta = Math.pow(b, 2) - (4 * a * c);

    double root1 = (b * (-1) + Math.pow(delta, 0.5)) / (2 * a);
    double root2 = (b * (-1) - Math.pow(delta, 0.5)) / (2 * a);

    System.out.printf("As raízes da equação %.0fx² + %.0fx + %.0f = 0 são: %.2f e %.2f.\n", a, b, c, root1, root2);

    scanner.close();
  }
}