package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapColl {
  public static void main(String[] args) {
    Map<String, Integer> maps = new HashMap<>();

    maps.put("Age", 15);
    maps.put("BornAt", 2008);

    System.out.println(maps);

    System.out.println(maps.get("Age"));

    System.out.println(maps.entrySet());
    System.out.println(maps.values());
    System.out.println(maps.keySet());

    for (int value : maps.values()) {
      System.out.println(value);
    }

    for (String key : maps.keySet()) {
      System.out.println(key);
      System.out.println(maps.get(key));
    }

    for (Entry<String, Integer> register : maps.entrySet()) {
      System.out.println(register.getKey());
      System.out.println(register.getValue());
    }

  }
}
