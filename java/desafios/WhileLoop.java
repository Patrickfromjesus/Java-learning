package desafios;

import javax.swing.*;

public class WhileLoop {
  public static void main(String[] args) {

    String password = JOptionPane.showInputDialog("Insira a senha: ");

    while (!password.equalsIgnoreCase("sair")) {
      password = JOptionPane.showInputDialog("Senha incorreta! Tente novamente: ");
    }

    System.out.println("Boa! Acertou.");

  }
}