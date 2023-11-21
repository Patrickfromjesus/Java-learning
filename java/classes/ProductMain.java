package classes;

public class ProductMain {
  public static void main(String[] args) {
    Product product1 = new Product("Notebook", 3700);

    double finalPrice1 = product1.finalPrice();

    System.out.println(finalPrice1);

    Product product2 = new Product("Monitor", 1200);

    double finalPrice2 = product2.finalPrice();

    System.out.println(finalPrice2);

    Product.discount = 0.5;

    System.out.println(product1.finalPrice());
    System.out.println(product2.finalPrice());

  }
}