package examples;

public class LabelBreak {
  public static void main(String[] args) {
    // "break" with label, to identify witch loop you wanna break. It also works
    // with "continue".
    out: for (int i = 0; i < 10; i += 1) {
      for (int j = 0; j < 10; j += 1) {
        if (j == 5)
          break out;
        System.out.printf("%s %s\n", i, j);
      }
    }
    System.out.println("Fora");
  }
}