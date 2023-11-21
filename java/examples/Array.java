package examples;

import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int[] grades = new int[2];

    // Mostra o endereço de memória
    System.out.println(grades);

    // Mostra o array como String
    System.out.println(Arrays.toString(grades));

    grades[0] = 1;
    grades[1] = 2;
    System.out.printf("%d, %d\n", grades[0], grades[1]);

    int[] array1 = { 1, 2, 3, 4, 5 }; // Same of: int[] array1 = new int[5];

    // Mostra o tamanho do array
    System.out.println(array1.length); // é um atributo, não um método.

    for (int i = 0; i < array1.length; i += 1) {
      System.out.print(array1[i] + " ");
    }

    System.out.println();

    // Equivalente ao forEach:
    for (int i : array1) {
      System.out.print(i + " ");
    }
  }
}
