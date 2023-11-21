package poo.inheritance.challenge;

public class Ferrari extends Car {

  Ferrari() {
    this(300);
  }

  Ferrari(double MAX_SPEED) {
    super(MAX_SPEED);
  }

  @Override
  public void accelerate() {
    this.delta = 15;
    super.accelerate();
  }

  @Override
  public void deccelerate() {
    this.delta = 15;
    super.deccelerate();
  }
}
