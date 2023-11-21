package poo.composition.challenge;

public class Item {
  private String name;
  private double price;

  public int hashCode() {
    return (int) Math.round(this.price);
  }

  public boolean equals(Item item) {
    if (item == null)
      return false;
    return item.name.equals(this.name) && item.price == this.price;
  }

  Item(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public String toString() {
    return String.format("%s --------- %.2f", this.name, this.price);
  }
}
