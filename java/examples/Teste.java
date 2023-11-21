package examples;

// import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    // System.out.println("Hello, World!");
    // String hello = "Hello, World!";
    // System.out.println(hello);
    // System.out.printf("A primeira mensagem impressa será: %s\n", hello);
    // System.out.println("A primeira mensagem impressa será: " + hello);

    // Scanner s = new Scanner(System.in);

    // System.out.print("Insira seu nome: ");
    // String name = s.nextLine();

    // System.out.printf("Olá, %s, seja bem-vindo!\n", name);
    // System.out.println("Olá, " + name + ", seja bem-vindo!");

    // s.close();

    // for (int i = 1; i <= 10; i += 3) {
    // System.out.printf("i = %d\n", i);
    // }

    // Infinity Loop with for:
    // for (;;) {
    // System.out.println("Infinity");
    // }

    int age = 1;

    switch (age) {
      case 1:
      case 0: // Não pode ter range no case, mas pode associar dois cases com msm resultado
        System.out.println("Bebê");
      case 2:
        System.out.println("Criança");
      case 3:
        System.out.println("Jovem");
      default:
        System.out.println("Humano");
    }
  }
}