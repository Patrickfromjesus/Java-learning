package classes;

public class CircArea {
  double radius;
  final static double PI = 3.14;

  CircArea(double radius) {
    this.radius = radius;
  }

  public double calcArea() {
    return PI * Math.pow(radius, 2);
  }
}