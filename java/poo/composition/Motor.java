package poo.composition;

public class Motor {
  public double turnoverFactor = 0.1;

  Motor() {
  }

  public void accelerate() {
    if (this.turnoverFactor >= 2.6) {
      this.turnoverFactor = 3;
      return;
    }
    this.turnoverFactor += 0.4;
  }

  public void decelerate() {
    if (this.turnoverFactor <= 0.4) {
      this.turnoverFactor = 0;
      return;
    }
    this.turnoverFactor -= 0.4;
  }

  public int spins() {
    return (int) Math.round(this.turnoverFactor * 1000);
  }
}
