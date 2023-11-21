package examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackColl {
  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<>();
    stack.add("Cristiano Ronaldo");
    stack.offer("Ney Júnior");
    stack.push("Lionel Messi");
    stack.push("Kevin De Bruyne");

    System.out.println(stack.peek());
    System.out.println(stack.element());

    stack.remove();
    stack.poll();

    System.out.println(stack);

  }
}
