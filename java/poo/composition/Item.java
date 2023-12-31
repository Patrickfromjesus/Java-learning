package poo.composition;

public class Item {
  private String name;
  private double price;
  private int quantity = 0;

  Item(String name, double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(price);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Item other = (Item) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
      return false;
    return true;
  }

  public String toString() {
    return String.format("%dx %s ------------- %.2f", this.quantity, this.name, this.price);
  }

  public void addQuantity() {
    this.quantity += 1;
  }

  public void removeQuantity() {
    this.quantity -= 1;
  }

  public double getQuantity() {
    return this.quantity;
  }

  public double getPrice() {
    return this.price;
  }

  public String getName() {
    return this.name;
  }

}
