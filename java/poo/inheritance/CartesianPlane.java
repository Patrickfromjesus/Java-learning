package poo.inheritance;

public class CartesianPlane {
  int x = 0;
  int y = 0;

  CartesianPlane() {
  }

  CartesianPlane(int x, int y) {
    this.x = x;
    this.y = y;
  }

  boolean walk(EOrientation orientation) {
    switch (orientation) {
      case NORTH:
        this.y += 1;
        break;
      case WEAST:
        this.x += 1;
        break;
      case EAST:
        this.x -= 1;
        break;
      case SOUTH:
        this.y -= 1;
        break;
      default:
        return false;
    }
    return true;
  }

  public String toString() {
    return String.format("(%s, %s)", this.x, this.y);
  }
}
