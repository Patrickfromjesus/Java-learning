package examples;

import java.util.Date;

public class HashEquals {
  public static void main(String[] args) {
    User user1 = new User("Patrick", "patrick@email.com");
    User user2 = new User("Patrick", "patrick@email.com");

    System.out.println(user1 == user2);
    System.out.println(user1.equals(new Date()));

  }
}
