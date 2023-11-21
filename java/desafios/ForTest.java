package desafios;

public class ForTest {
  public static void main(String[] args) {
    String value = "#";
    for (; !value.equals("######"); value += "#") {
      System.out.println(value);
    }
  }
}