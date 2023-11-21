package poo.composition;

public class PurchaseMain {
  public static void main(String[] args) {
    Purchase purchase = new Purchase("bemvindo");

    purchase.addItem("Teclado", 200);
    purchase.addItem("Teclado", 200);
    purchase.addItem("Mouse", 500);
    purchase.addItem("TouchPad", 80);

    purchase.removeItem("Teclado", 200);
    purchase.removeItem("Teclado", 200);
    purchase.removeItem("Teclado", 200);

    System.out.println(purchase);

  }
}
