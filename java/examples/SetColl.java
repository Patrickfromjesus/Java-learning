package examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetColl {
  // HashSet -> more performance, no sort.
  // LinkedSet -> more or less performance, sort by first in.
  // TreeSet -> less performance, custom sort.

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("Ronaldo");
    set.add("Fenomenal");
    set.add("Cr7");
    set.add("Ankara Messi");
    set.add("Zidane");
    set.add("Marcelo");

    System.out.println(set);

    for (String player : set) {
      System.out.println(player);
    }

    SortedSet<Integer> sortSet = new TreeSet<>();
    sortSet.add(1);
    sortSet.add(8);
    sortSet.add(11);
    sortSet.add(9);
    sortSet.add(5);
    sortSet.add(2);
    sortSet.add(3);

    System.out.println(sortSet);

    for (int num : sortSet) {
      System.out.println(num);
    }

    SortedSet<String> stringSet = new TreeSet<>();
    stringSet.addAll(set);

    System.out.println(stringSet);

    for (String dupName : stringSet) {
      System.out.println(dupName);
    }

    Set<Integer> test1 = new LinkedHashSet<>();

    test1.add(9);
    test1.add(8);
    test1.add(5);
    test1.add(2);
    test1.add(7);
    test1.add(8);

    System.out.println(test1);

    test1.remove(5);
    test1.remove(2);
    test1.remove(8);

    Set<Integer> test2 = new TreeSet<>(test1); // Sort of LinkedSet.

    System.out.println(test2);

  }
}
