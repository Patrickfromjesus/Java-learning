package desafios;

public class Person {
  String name;
  double weight, lastWeight;

  Person(String name, double weight) {
    this.name = name;
    this.weight = weight;
    this.lastWeight = weight;
  }

  public void eat(Meal food) {
    System.out.printf("%s está comendo %s...\n", this.name, food.name);
    this.weight += food.weight;
    System.out.printf("%s terminou de comer...\n", this.name);
  }

  public void showWeight() {
    System.out.printf("Peso antes da última refeição: %.2f kg.\n", this.lastWeight);
    System.out.printf("Peso após refeição: %.2f kg.\n", this.weight);
  }

  // public void eatAndShowWeight(Meal food) {
  // System.out.printf("%s está comendo %s...\n", this.name, food.name);
  // this.weight += food.weight;
  // System.out.printf("%s terminou de comer...\n", this.name);
  // this.showWeight();
  // }

  // private void showWeight() {
  // System.out.printf("Peso antes da última refeição: %.2f kg.\n",
  // this.lastWeight);
  // System.out.printf("Peso após refeição: %.2f kg.\n", this.weight);
  // }
}