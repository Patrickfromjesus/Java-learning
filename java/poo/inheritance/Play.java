package poo.inheritance;

public class Play {
  public static void main(String[] args) {
    CartesianPlane cartesianPlane = new CartesianPlane();

    cartesianPlane.walk(EOrientation.WEAST);
    cartesianPlane.walk(EOrientation.NORTH);
    cartesianPlane.walk(EOrientation.SOUTH);
    cartesianPlane.walk(EOrientation.NORTH);
    cartesianPlane.walk(EOrientation.NORTH);
    cartesianPlane.walk(EOrientation.SOUTH);
    cartesianPlane.walk(EOrientation.NORTH);
    cartesianPlane.walk(EOrientation.SOUTH);
    cartesianPlane.walk(EOrientation.WEAST);

    System.out.println(cartesianPlane);
  }
}
