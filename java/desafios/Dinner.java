package desafios;

import java.util.Scanner;

public class Dinner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nome da pessoa: ");
    String personName = scanner.next();

    System.out.print("Peso da pessoa: ");
    double personWeight = scanner.nextDouble();

    Person person = new Person(personName, personWeight);

    System.out.print("Nome da comida: ");
    String mealName = scanner.next();

    System.out.print("Peso da comida: ");
    double mealWeight = scanner.nextDouble();

    Meal meal = new Meal(mealName, mealWeight);

    person.eat(meal);

    person.showWeight();

    scanner.close();
  }
}