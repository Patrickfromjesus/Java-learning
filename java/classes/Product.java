package classes;

public class Product {
  String name;
  double price;
  static double discount;

  Product(String name, double price) {
    discount = 0.25;
    this.name = name;
    this.price = price;
  }

  public double finalPrice() {
    return this.price * (1 - discount);
  }
}
