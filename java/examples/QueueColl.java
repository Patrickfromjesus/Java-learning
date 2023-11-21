package examples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueColl {
  public static void main(String[] args) {
    Queue<Integer> fila = new LinkedList<>();

    // Throws exception if queue is full.
    fila.add(1);
    fila.add(2);
    fila.add(3);
    fila.add(4);
    fila.add(5);
    fila.add(2);

    System.out.println(fila);

    // Returns false if queue is full.
    fila.offer(1);
    fila.offer(2);
    fila.offer(3);
    fila.offer(4);
    fila.offer(5);
    fila.offer(2);

    System.out.println(fila);

    // Readonly methods (do not remove, only READ):

    // peek -> Returns null if queue is empty.
    System.out.println(fila.peek());
    System.out.println(fila.peek());

    // element -> Throws exception if queue is empty.
    System.out.println(fila.element());
    System.out.println(fila.element());

    // fila.clear();
    // System.out.println(fila.element());

    // System.out.println(fila);

    // Read and delete methods (remove and return):

    // poll -> Returns null if queue is empty.
    System.out.println(fila.poll());
    System.out.println(fila.poll());

    // remove -> Throws exception if queue is empty.
    System.out.println(fila.remove());
    System.out.println(fila.remove());

    System.out.println(fila);

  }
}
