package poo.composition.challenge;

import java.util.HashSet;
import java.util.Set;

public class Customer {
  private String cpf;
  private String name;
  private Set<Purchase> purchases = new HashSet<>();

  Customer(String cpf) {
    this.cpf = cpf;
    this.name = this.getNameByCpf(cpf);
  }

  public String toString() {
    return this.name;
  }

  public boolean addPurchase(Purchase purchase) {
    return this.purchases.add(purchase);
  }

  public String getCpf() {
    return this.cpf;
  }

  public double spentTotal() {
    double total = 0;
    for (Purchase p : this.purchases) {
      total += p.getTotal();
    }
    return total;
  }

  public void showRecipes() {
    for (Purchase p : purchases) {
      System.out.println(p);
    }
  }

  private String getNameByCpf(String cpf) {
    switch (cpf) {
      case "123456":
        return "Maicon";
      case "987654":
        return "Ronaldo";
      case "1010101":
        return "Lucas";
      default:
        return "Visita";
    }
  }
}
