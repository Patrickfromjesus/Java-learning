package poo.composition.challenge;

public class ChallengeMain {
  public static void main(String[] args) {
    // Declare items
    Item item1 = new Item("Caderno", 12);
    Item item2 = new Item("Caneta", 2.5);
    Item item3 = new Item("Lapiseira", 4.8);
    Item item4 = new Item("Borracha", 1.25);
    Item item5 = new Item("Corretivo", 4.99);
    Item item6 = new Item("Resma de folha", 18.35);
    Item item7 = new Item("Estojo", 4.8);
    Item item8 = new Item("Post-it", 3.69);
    Item item9 = new Item("Marca texto", 4.89);
    Item item10 = new Item("Tesoura", 6);

    Purchase purchase = new Purchase("1010101");

    purchase.addProducts(item1);
    purchase.addProducts(item2);
    purchase.addProducts(item3);
    purchase.addProducts(item4);
    purchase.addProducts(item5);
    purchase.addProducts(item6);
    purchase.addProducts(item7);
    purchase.addProducts(item8);
    purchase.addProducts(item9);
    purchase.addProducts(item10);
    purchase.removeProducts(item10);
    purchase.addProducts(item10);
    purchase.addProducts(item10);
    purchase.addProducts(item10);
    purchase.removeProducts(item10);
    purchase.removeProducts(item10);
    purchase.removeProducts(item10);

    System.out.println(purchase);

  }
}
