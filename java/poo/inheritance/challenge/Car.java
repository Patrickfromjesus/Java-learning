package poo.inheritance.challenge;

public class Car {
  public double currentSpeed = 0;
  final double MAX_SPEED;
  public int delta = 5;

  public Car(double MAX_SPEED) {
    this.MAX_SPEED = MAX_SPEED;
  }

  public String toString() {
    return String.format("%.2f km/h", this.currentSpeed);
  }

  public void accelerate() {
    if (this.currentSpeed + delta > MAX_SPEED) {
      this.currentSpeed = MAX_SPEED;
      return;
    }
    this.currentSpeed += delta;
  }

  public void deccelerate() {
    if (this.currentSpeed <= delta) {
      this.currentSpeed = 0;
      return;
    }
    this.currentSpeed -= delta;
  }
}
