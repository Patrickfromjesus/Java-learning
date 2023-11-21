package poo.composition.challenge;

public class Product {
  private Item item;
  private double total = 0;
  private int quantity = 1;

  Product(Item item) {
    this.item = item;
    this.total += item.getPrice();
  }

  public int hashCode() {
    return this.item.hashCode();
  }

  public boolean equals(Product product) {
    return product.item.equals(this.item);
  }

  public String toString() {
    return String.format("%dx %s\n", this.quantity, this.item);
  }

  public double getTotal() {
    return this.total;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public Item getItem() {
    return this.item;
  }

  public boolean addItem(Item item) {
    if (item.equals(this.item)) {
      this.quantity += 1;
      this.total += item.getPrice();
      return true;
    }
    return false;
  }

  public boolean removeItem(Item item) {
    if (item.equals(this.item) && this.quantity > 0) {
      this.quantity -= 1;
      this.total -= item.getPrice();
      return true;
    }
    return false;
  }
}
