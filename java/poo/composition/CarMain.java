package poo.composition;

public class CarMain {
  public static void main(String[] args) {
    Car car = new Car();

    System.out.println(car.isOn());

    car.turOn();
    System.out.println(car.isOn());

    System.out.println(car.speed());

    car.accelerate();
    car.accelerate();
    car.accelerate();

    System.out.println(car.speed());

    car.decelerate();
    car.decelerate();
    car.decelerate();
    car.decelerate();

    System.out.println(car.speed());
  }
}
