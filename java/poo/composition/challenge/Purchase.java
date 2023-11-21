package poo.composition.challenge;

import java.util.Set;
import java.util.HashSet;

public class Purchase {
  private Set<Product> products = new HashSet<>();
  private Customer customer = null;

  Purchase() {
  }

  Purchase(Item item) {
    this.addProducts(item);
  }

  Purchase(String cpf) {
    this.customer = new Customer(cpf);
  }

  public String toString() {
    String recipe = String.format("Customer: %s\n", this.customer != null ? this.customer : "Visit");
    for (Product p : products) {
      recipe += p;
    }
    recipe += String.format("\nTotal: %.2f", this.getTotal());
    return recipe;
  }

  public Set<Product> getProducts() {
    return this.products;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public boolean addProducts(Item item) {
    Product product = new Product(item);
    if (this.products.size() == 0) {
      return this.products.add(product);
    }
    for (Product p : this.products) {
      if (p.equals(product)) {
        return p.addItem(item);
      }
    }
    return this.products.add(product);
  }

  public boolean removeProducts(Item item) {
    Product product = new Product(item);
    for (Product p : this.products) {
      if (product.equals(p)) {
        p.removeItem(item);
        if (p.getQuantity() == 0) {
          this.products.remove(p);
        }
        return true;
      }
    }
    return false;
  }

  public double getTotal() {
    double total = 0;
    for (Product p : products) {
      total += p.getTotal();
    }
    return total;
  }
}
