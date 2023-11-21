package examples;

import java.util.ArrayList;
import java.util.List;

public class ListColl {
  public static void main(String[] args) {
    List<User> list1 = new ArrayList<>();
    list1.add(new User("Ronaldo", "ronaldo9@fenomeno.com"));
    User u2 = new User("Neymar", "menino11@ney.com");
    list1.add(u2);

    System.out.println(list1.get(0));
    System.out.println(list1.get(1));

    for (User u : list1) {
      System.out.println("-------> " + u.email);
    }

    System.out.println("----> " + list1.contains(u2));

    System.out.println(list1.remove(0)); // By index
    System.out.println(list1.remove(u2)); // By Object

    System.out.println(list1);

  }
}
