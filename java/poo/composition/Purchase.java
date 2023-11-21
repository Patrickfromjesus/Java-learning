package poo.composition;

import java.util.Set;
import java.util.HashSet;

public class Purchase {
  private double total = 0.00;
  private double subtotal = 0.00;
  private Set<Item> cart = new HashSet<>();
  private double discount = 0;

  Purchase() {
  }

  Purchase(String coupon) {
    this.applyCoumpon(coupon);
  }

  public void addItem(String name, double price) {
    Item item = new Item(name, price);
    cart.add(item);

    for (Item i : cart) {
      if (i.equals(item)) {
        i.addQuantity();
        break;
      }
    }

    this.subtotal += item.getPrice();
  }

  public void removeItem(String name, double price) {
    Item item = new Item(name, price);

    for (Item i : cart) {
      if (i.equals(item)) {
        if (item.getQuantity() == 1) {
          cart.remove(item);
        }
        if (item.getQuantity() >= 1) {
          i.removeQuantity();
          this.subtotal -= item.getPrice();
        }
        break;
      }
    }
  }

  public Set<Item> getCart() {
    return this.cart;
  }

  public void showItems() {
    for (Item i : this.cart) {
      System.out.println(i);
    }
  }

  public void applyCoumpon(String coupon) {
    if (coupon.equalsIgnoreCase("bemvindo"))
      this.discount = 0.2;
  }

  public double getTotal() {
    this.total = this.subtotal - (this.subtotal * this.discount);
    return this.total;
  }

  public void showTotal() {
    System.out.println();
    System.out.printf("Subtotal: %.2f\nTotal: %.2f\n", this.subtotal, this.getTotal());
  }

  public String toString() {
    showItems();
    showTotal();
    return "";
  }

}
