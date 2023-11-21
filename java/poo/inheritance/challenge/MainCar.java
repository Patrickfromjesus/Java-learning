package poo.inheritance.challenge;

public class MainCar {
  public static void main(String[] args) {
    Car ferrari = new Ferrari();
    Car civic = new Civic();

    while (ferrari.currentSpeed < 300) {
      ferrari.accelerate();
    }

    // ferrari.accelerate();
    // ferrari.accelerate();
    // ferrari.accelerate();
    // ferrari.accelerate();
    // ferrari.accelerate();
    // ferrari.accelerate();
    // ferrari.accelerate();
    // ferrari.accelerate();
    // ferrari.accelerate();
    // ferrari.accelerate();

    civic.accelerate();
    civic.accelerate();
    civic.accelerate();
    civic.accelerate();
    civic.accelerate();

    System.out.println(ferrari);
    System.out.println(civic);

  }
}
