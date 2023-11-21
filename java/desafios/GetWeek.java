package desafios;

import java.util.Scanner;

public class GetWeek {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o dia da semana: ");
    String weekDay = scanner.nextLine().toLowerCase();

    if (weekDay.equals("domingo"))
      System.out.println(1);
    else if (weekDay.equals("segunda"))
      System.out.println(2);
    else if (weekDay.equals("terça"))
      System.out.println(3);
    else if (weekDay.equals("quarta"))
      System.out.println(4);
    else if (weekDay.equals("quinta"))
      System.out.println(5);
    else if (weekDay.equals("sexta"))
      System.out.println(6);
    else if (weekDay.equals("sábado"))
      System.out.println(7);
    else
      System.out.println("Dia da semana inválido!");

    scanner.close();
  }
}
