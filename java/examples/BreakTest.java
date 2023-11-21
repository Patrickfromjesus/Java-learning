package examples;

class BreakTest {
  public static void main(String[] args) {
    // "break" breaks the loop.
    for (int i = 0; i < 12; i += 1) {
      if (i == 5)
        break;
      System.out.println(i);
    }
    System.out.println("Fim");

    // "continue" breaks the current iteration.
    for (int i = 0; i < 12; i += 1) {
      if (i == 5)
        continue;
      System.out.println(i);
    }
    System.out.println("Fim");
  }
}