package poo.composition;

public class Car {
  private Motor motor = new Motor();
  private boolean isOn = false;

  Car() {
  }

  public boolean isOn() {
    return this.isOn;
  }

  public void turOn() {
    this.isOn = true;
  }

  public void turOff() {
    this.isOn = false;
  }

  public void accelerate() {
    if (this.isOn)
      this.motor.accelerate();
  }

  public void decelerate() {
    if (this.isOn)
      this.motor.decelerate();
  }

  public double speed() {
    if (!this.isOn)
      return 0;
    return (this.motor.spins() / 10);
  }
}
